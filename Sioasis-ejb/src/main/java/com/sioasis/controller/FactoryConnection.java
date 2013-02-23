/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.controller;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import java.util.ResourceBundle;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 *
 * @author darthian
 */
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
@LocalBean
public class FactoryConnection {

    private static Datastore ds;
    private static FactoryConnection instance;
    private String ip;
    private int port;
    //private String userdb;
    //private String passdb;
    private String dbname;

    public FactoryConnection() {
    }

    private <T> FactoryConnection(T colection) throws Exception {
        ResourceBundle rb = ResourceBundle.getBundle("connectionSioasis");
        try {
            this.ip = rb.getString("openshift_ip");
            this.port = Integer.parseInt(rb.getString("port"));
            //this.userdb = rb.getString("userdb");
            //this.passdb = rb.getString("passdb");
            this.dbname = rb.getString("dbname");
            Mongo mongo = new Mongo(ip, port);
            Morphia morphia = new Morphia();
            morphia.map(colection.getClass());
            ds = morphia.createDatastore(mongo, dbname);
            ds.ensureIndexes();
            ds.ensureCaps();
        } catch (Exception E) {
            try {
                this.ip = rb.getString("ip");
                Mongo mongo = new Mongo(ip, port);
                Morphia morphia = new Morphia();
                morphia.map(colection.getClass());
                ds = morphia.createDatastore(mongo, dbname);
                ds.ensureIndexes();
                ds.ensureCaps();
            } catch (Exception er) {
                throw er;
            }
        }
    }
    
    @Lock(LockType.READ)
    public static <T> Datastore getConnection(T colection) throws Exception {
        while (instance == null) {
            instance = new FactoryConnection(colection);
        }
        return ds;
    }
}
