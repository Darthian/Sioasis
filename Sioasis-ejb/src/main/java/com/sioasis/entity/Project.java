/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.entity;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author darthian
 */
@Entity
public class Project {

    @Id
    private ObjectId id;
    private String nameProject;
    private String attendant;
    private String description;
    @Reference
    private List<Enrolled> enrolled;
    @Reference
    private List<Schedule> schedule;
    private Long code;
    private String duration;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getAttendant() {
        return attendant;
    }

    public void setAttendant(String attendant) {
        this.attendant = attendant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Enrolled> getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(List<Enrolled> enrolled) {
        this.enrolled = enrolled;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long proID) {
        this.code = proID;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
