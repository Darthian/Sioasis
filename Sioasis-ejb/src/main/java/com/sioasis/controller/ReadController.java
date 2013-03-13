/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.controller;

import com.sioasis.dao.UserAdminDAO;
import com.sioasis.entity.userAdmin;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author darthian
 */
@Stateless
@LocalBean
public class ReadController {

    public String readMethod(String userName, String userPass) throws Exception {
        String flag = "error";
        userAdmin u = new userAdmin();
        UserAdminDAO userDao = new UserAdminDAO(FactoryConnection.getConnection(u));
        try {
            if (userDao.findByUserName(userName) != null) {
                if (userDao.findByUserName(userName).getUserPass().equals(userPass)) {
                    flag = userDao.findByUserName(userName).getRol();                    
                }
            }
        } catch (Exception ex) {
            flag = "error";
        }
        return flag;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
