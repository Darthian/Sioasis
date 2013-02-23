/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.entity;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Id;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author darthian
 */
@Embedded
public class Schedule {

    @Id
    private ObjectId id;
    private List<proyectDays> days;    
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<proyectDays> getDays() {
        return days;
    }

    public void setDays(List<proyectDays> days) {
        this.days = days;
    }    
}
