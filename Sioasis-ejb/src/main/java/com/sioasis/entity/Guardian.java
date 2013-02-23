/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.entity;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

/**
 *
 * @author darthian
 */
@Embedded
public class Guardian {

    @Id
    private ObjectId id;
    private String relation; //Relationship to Enrollee: Mother, father..other..
    private String name;
    private String job;
    private String movilPhone;
    private String docID;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMovilPhone() {
        return movilPhone;
    }

    public void setMovilPhone(String movilPhone) {
        this.movilPhone = movilPhone;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }
}
