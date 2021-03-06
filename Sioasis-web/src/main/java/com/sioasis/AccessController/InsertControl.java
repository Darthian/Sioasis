/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.AccessController;

import com.sioasis.controller.InsertionController;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author darthian
 */
@ManagedBean
@RequestScoped
public class InsertControl {

    /**
     * Creates a new instance of InsertControl
     */
    @EJB
    private InsertionController IC;
    private String userName;
    private String userPass;
    private Long docNumber;
    private String realName;
    private String lastName;

    public String insertMethod() throws Exception {
        String flag = "userAdmin"; 
        System.out.println("entro al managedBean del usuario");
        try {
            IC.dataInsert1(getUserName(), getUserPass(), getDocNumber(), getRealName(), getLastName());
        } catch (Exception ex) {
            flag = "error";
        }
        return flag;
    }

    public InsertControl() {
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * @param userPass the userPass to set
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * @return the docNumber
     */
    public Long getDocNumber() {
        return docNumber;
    }

    /**
     * @param docNumber the docNumber to set
     */
    public void setDocNumber(Long docNumber) {
        this.docNumber = docNumber;
    }

    /**
     * @return the realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName the realName to set
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return the nameUser
     */
}
