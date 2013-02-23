package com.sioasis.dao;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.sioasis.entity.Enrolled;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.bson.types.ObjectId;

@Stateless
@LocalBean
public class EnrolledDAO {

    private Datastore ds = null;

    public EnrolledDAO() {
    }

    public EnrolledDAO(Datastore connection) throws Exception {
        this.ds = connection;
    }

    public Enrolled create(Enrolled enrolled) throws Exception {
        try {
            ds.save(enrolled);
            return enrolled;
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(ObjectId id) throws Exception {
        try {
            Query query = ds.createQuery(Enrolled.class).field("_id").equal(id);
            ds.delete(query);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(Enrolled enrolled) throws Exception {
        try {
            Query query = ds.createQuery(Enrolled.class).field("_id").equal(enrolled.getId());
            ds.delete(query);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Enrolled> findAll() throws Exception {
        try {
            List<Enrolled> userList = ds.find(Enrolled.class).asList();
            return userList;
        } catch (Exception e) {
            throw e;
        }
    }

    public Enrolled findByDocumentNumber(Long doc) throws Exception {
        try {
            Query query = ds.createQuery(Enrolled.class).field("docID").equal(doc);
            Enrolled enrol = (Enrolled) query.get();
            return enrol;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Enrolled> findByName(String name) throws Exception {
        try {
            List<Enrolled> enrolledList = ds.find(Enrolled.class).field("name").equal(name).asList();
            return enrolledList;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(Enrolled enrolled) throws Exception {
        try {
            Query query = ds.createQuery(Enrolled.class).field("_id").equal(enrolled.getId());
            Enrolled enrol = (Enrolled) query.get();
            if (enrol != null) {
                ds.save(enrolled);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
