/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.dao;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.sioasis.entity.User;
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
public class UserDao {

    private Datastore ds = null;

    public UserDao() {
    }

    public UserDao(Datastore connection) throws Exception {
        this.ds = connection;
    }

    public Datastore getDatastore() {
        return ds;
    }

    public User create(User u) throws Exception {
        try {
            ds.save(u);
            return u;
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(User u) throws Exception {
        try {
            Query q = ds.createQuery(User.class).field("_id").equal(u.getId());
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(ObjectId id) throws Exception {
        try {
            Query q = ds.createQuery(User.class).field("_id").equal(id);
            ds.delete(q);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<User> findAll() throws Exception {
        try {
            List<User> list = ds.find(User.class).asList();
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public User findByUserName(String name) throws Exception {
        User u;
        try {
            Query q = ds.createQuery(User.class).field("userName").equal(name);
            u = (User) q.get();
        } catch (Exception e) {
            u = null;
            throw e;
        }
        return u;
    }
}
