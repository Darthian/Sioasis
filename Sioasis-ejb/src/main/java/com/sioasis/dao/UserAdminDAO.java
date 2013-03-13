
package com.sioasis.dao;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.sioasis.entity.userAdmin;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.bson.types.ObjectId;


@Stateless
@LocalBean
public class UserAdminDAO {

    private Datastore ds = null;

    public UserAdminDAO() {
    }

    public UserAdminDAO(Datastore connection) throws Exception {
        this.ds = connection;
    }

    public Datastore getDatastore() {
        return ds;
    }

    public userAdmin create(userAdmin u) throws Exception {
        try {
            ds.save(u);
            return u;
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(userAdmin u) throws Exception {
        try {
            Query q = ds.createQuery(userAdmin.class).field("_id").equal(u.getId());
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(ObjectId id) throws Exception {
        try {
            Query q = ds.createQuery(userAdmin.class).field("_id").equal(id);
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<userAdmin> findAll() throws Exception {
        try {
            List<userAdmin> list = ds.find(userAdmin.class).asList();
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public userAdmin findByUserName(String name) throws Exception {
        userAdmin u;
        try {
            Query q = ds.createQuery(userAdmin.class).field("userName").equal(name);
            u = (userAdmin) q.get();
        } catch (Exception e) {
            u = null;
            throw e;
        }
        return u;
    }
}
