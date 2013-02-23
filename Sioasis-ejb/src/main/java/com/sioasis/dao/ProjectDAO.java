package com.sioasis.dao;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.sioasis.entity.Project;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.bson.types.ObjectId;

@Stateless
@LocalBean
public class ProjectDAO {
    
    private Datastore ds = null;

    public ProjectDAO() {
    }

    public ProjectDAO(Datastore connection) throws Exception {
        this.ds = connection;
    }
    
    public Datastore getDatastore() {
        return ds;
    }

    public Project create(Project project) throws Exception {
        try {
            ds.save(project);
            return project;
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(ObjectId id) throws Exception {
        try {
            Query query = ds.createQuery(Project.class).field("_id").equal(id);
            ds.delete(query);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(Project project) throws Exception {
        try {
            Query query = ds.createQuery(Project.class).field("_id").equal(project.getId());
            ds.delete(query);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Project> findAll() throws Exception {
        try {
            List<Project> projectList = ds.find(Project.class).asList();
            return projectList;
        } catch (Exception e) {
            throw e;
        }
    }

    public Project findByNameProject(String nameProject) throws Exception {
        try {
            Query query = ds.createQuery(Project.class).field("nameProject").equal(nameProject);
            Project p = (Project) query.get();
            return p;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(Project project) throws Exception {
        try {
            Query query = ds.createQuery(Project.class).field("_id").equal(project.getId());
            Project p = (Project) query.get();
            if (p != null) {
                ds.save(project);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
