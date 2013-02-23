/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.AccessController;

import com.sioasis.controller.ReadController;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author darthian
 */
@ManagedBean
@RequestScoped
public class AccessControl {

    @EJB
    private ReadController RC;
    private String userName;
    private String userPass;

    /**
     * Creates a new instance of AccessControl
     */
    public AccessControl() {
    }

    public String accessMethod() {
        String flag;
        try {
            flag = RC.readMethod(getUserName(), getUserPass());
        } catch (Exception ex) {
            flag = "error";
        }
        return flag;
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
}
