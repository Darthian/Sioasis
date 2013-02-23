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
public class Enrolled {

    @Id
    private ObjectId id;
    private int yearForm;
    private char sex;
    private boolean newOrOld;
    private String name;
    private String lastName;
    private String age;
    private String birthDay;
    private String address;
    private String homePhone;
    private String movilPhone;
    private String weight;
    private String height;
    private String sizeHeight;
    private int numPersonLive;
    private boolean displaced;
    private boolean sisben;
    private boolean EPS;
    private String wichEPS;
    private boolean study;
    private String school;
    private String grade;
    private String tipeOwnHome; //Arriendo, Propia, en Pago
    private String tipeHome;    //Casa, Apartamento, Casalote, Inquilinato, Invacion, 
    @Embedded
    private Guardian guardian;
    private int numChild17;
    private Long docID;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getYearForm() {
        return yearForm;
    }

    public void setYearForm(int yearForm) {
        this.yearForm = yearForm;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isNewOrOld() {
        return newOrOld;
    }

    public void setNewOrOld(boolean newOrOld) {
        this.newOrOld = newOrOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMovilPhone() {
        return movilPhone;
    }

    public void setMovilPhone(String movilPhone) {
        this.movilPhone = movilPhone;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSizeHeight() {
        return sizeHeight;
    }

    public void setSizeHeight(String sizeHeight) {
        this.sizeHeight = sizeHeight;
    }

    public int getNumPersonLive() {
        return numPersonLive;
    }

    public void setNumPersonLive(int numPersonLive) {
        this.numPersonLive = numPersonLive;
    }

    public boolean isDisplaced() {
        return displaced;
    }

    public void setDisplaced(boolean displaced) {
        this.displaced = displaced;
    }

    public boolean isSisben() {
        return sisben;
    }

    public void setSisben(boolean sisben) {
        this.sisben = sisben;
    }

    public boolean isEPS() {
        return EPS;
    }

    public void setEPS(boolean EPS) {
        this.EPS = EPS;
    }

    public String getWichEPS() {
        return wichEPS;
    }

    public void setWichEPS(String wichEPS) {
        this.wichEPS = wichEPS;
    }

    public boolean isStudy() {
        return study;
    }

    public void setStudy(boolean study) {
        this.study = study;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTipeOwnHome() {
        return tipeOwnHome;
    }

    public void setTipeOwnHome(String tipeOwnHome) {
        this.tipeOwnHome = tipeOwnHome;
    }

    public String getTipeHome() {
        return tipeHome;
    }

    public void setTipeHome(String tipeHome) {
        this.tipeHome = tipeHome;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public int getNumChild17() {
        return numChild17;
    }

    public void setNumChild17(int numChild17) {
        this.numChild17 = numChild17;
    }

    public Long getDocID() {
        return docID;
    }

    public void setDocID(Long docID) {
        this.docID = docID;
    }
}
