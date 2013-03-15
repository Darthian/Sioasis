/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.controllerEnrolled;

import com.sioasis.controller.FactoryConnection;
import com.sioasis.dao.EnrolledDAO;
import com.sioasis.dao.GuardianDAO;
import com.sioasis.entity.Enrolled;
import com.sioasis.entity.Guardian;
import java.util.Date;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author darthian
 */
@Stateless
@LocalBean
public class CreateSessionEnrolled {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void newEnrolled(String name, String lastName, String address, String homePhone, String movilPhone, String weight, String height, String sizeHeight, String shcool, String grade, String tipeOwnHome, String tipeHome, String wichEPS, Date birthDay, Long docId, boolean displaced, boolean sisben, boolean EPS, boolean study, boolean newOrOld, char sex, int age, int numPersonLive, int numChild17, int yearForm) throws Exception {
        Enrolled en = new Enrolled();
        en.setName(name);
        en.setLastName(lastName);
        en.setAddress(address);
        en.setHomePhone(homePhone);
        en.setMovilPhone(movilPhone);
        en.setWeight(weight);
        en.setHeight(height);
        en.setSizeHeight(sizeHeight);
        en.setSchool(shcool);
        en.setGrade(grade);
        en.setTipeOwnHome(tipeOwnHome);
        en.setTipeHome(tipeHome);
        en.setWichEPS(wichEPS);
        en.setBirthDay(birthDay);
        en.setDocID(docId);
        en.setDisplaced(displaced);
        en.setSisben(sisben);
        en.setEPS(EPS);
        en.setStudy(study);
        en.setNewOrOld(newOrOld);
        en.setAge(age);
        en.setSex(sex);
        en.setNumPersonLive(numPersonLive);
        en.setNumChild17(numChild17);
        en.setYearForm(yearForm);

        EnrolledDAO enDao = new EnrolledDAO(FactoryConnection.getConnection(en));
        enDao.create(en);
        if (enDao.findByDocumentNumber(docId) == null) {
            //TO DO
        } else {
        }
    }

    public void newGuardian(String guardianName, String relationGuardian, String jobGuardian, String movilPhoneGuardian, Long docIdGuardian) throws Exception {
        Guardian gu = new Guardian();
        gu.setName(guardianName);
        gu.setRelation(relationGuardian);
        gu.setJob(jobGuardian);
        gu.setMovilPhone(movilPhoneGuardian);
        gu.setDocID(docIdGuardian);

        GuardianDAO guDao = new GuardianDAO(FactoryConnection.getConnection(gu));
        if (guDao.findByGuardianDoc(docIdGuardian) != null) {
            //TO DO
        } else {
            guDao.create(gu);
        }
    }
}
