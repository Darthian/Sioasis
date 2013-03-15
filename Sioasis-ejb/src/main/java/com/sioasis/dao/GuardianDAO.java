/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.dao;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.sioasis.entity.Guardian;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.bson.types.ObjectId;

/**
 *
 * @author darthian
 */
@Stateless
@LocalBean
public class GuardianDAO {

    private Datastore ds = null;

    public GuardianDAO() {
    }

    public GuardianDAO(Datastore connection) throws Exception {
        this.ds = connection;
    }

    public Datastore getDatastore() {
        return ds;
    }

    public Guardian create(Guardian u) throws Exception {
        try {
            ds.save(u);
            return u;
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(Guardian u) throws Exception {
        try {
            Query q = ds.createQuery(Guardian.class).field("_id").equal(u.getId());
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(ObjectId id) throws Exception {
        try {
            Query q = ds.createQuery(Guardian.class).field("_id").equal(id);
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Guardian> findAll() throws Exception {
        try {
            List<Guardian> list = ds.find(Guardian.class).asList();
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public Guardian findByGuardianName(String name) throws Exception {
        Guardian u;
        try {
            Query q = ds.createQuery(Guardian.class).field("name").equal(name);
            u = (Guardian) q.get();
        } catch (Exception e) {
            u = null;
            throw e;
        }
        return u;
    }

    public Guardian findByGuardianDoc(Long docId) throws Exception {
        Guardian u;
        try {
            Query q = ds.createQuery(Guardian.class).field("docID").equal(docId);
            u = (Guardian) q.get();
        } catch (Exception e) {
            u = null;
            throw e;
        }
        return u;
    }
}
