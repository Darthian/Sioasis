/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.entity;

import com.google.code.morphia.annotations.Entity;

/**
 *
 * @author darthian
 */
@Entity
public class proyectDays {
    
    private int hourBegin;
    private int hourEnding;
    private String placeProject;

    public int getHourBegin() {
        return hourBegin;
    }

    public void setHourBegin(int hourBegin) {
        this.hourBegin = hourBegin;
    }

    public int getHourEnding() {
        return hourEnding;
    }

    public void setHourEnding(int hourEnding) {
        this.hourEnding = hourEnding;
    }
    
    public String getPlaceProject() {
        return placeProject;
    }

    public void setPlaceProject(String placeProject) {
        this.placeProject = placeProject;
    }
}
