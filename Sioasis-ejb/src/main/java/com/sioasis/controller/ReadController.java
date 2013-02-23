/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.controller;

import com.sioasis.dao.UserDao;
import com.sioasis.entity.User;
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
        User u = new User();
        UserDao userDao = new UserDao(FactoryConnection.getConnection(u));
        try {
            if (!userDao.findByUserName(userName).equals(null)) {
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
