package com.sioasis.dao;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.sioasis.entity.enrolledAdmin;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.bson.types.ObjectId;


@Stateless
@LocalBean
public class enrolledAdminDAO {

    private Datastore ds = null;

    public enrolledAdminDAO() {
    }

    public enrolledAdminDAO(Datastore connection) throws Exception {
        this.ds = connection;
    }

    public Datastore getDatastore() {
        return ds;
    }

    public enrolledAdmin create(enrolledAdmin u) throws Exception {
        try {
            ds.save(u);
            return u;
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(enrolledAdmin u) throws Exception {
        try {
            Query q = ds.createQuery(enrolledAdmin.class).field("_id").equal(u.getId());
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(ObjectId id) throws Exception {
        try {
            Query q = ds.createQuery(enrolledAdmin.class).field("_id").equal(id);
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<enrolledAdmin> findAll() throws Exception {
        try {
            List<enrolledAdmin> list = ds.find(enrolledAdmin.class).asList();
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public enrolledAdmin findByUserName(String name) throws Exception {
        enrolledAdmin u;
        try {
            Query q = ds.createQuery(enrolledAdmin.class).field("userName").equal(name);
            u = (enrolledAdmin) q.get();
        } catch (Exception e) {
            u = null;
            throw e;
        }
        return u;
    }
}