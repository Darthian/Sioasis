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
public class InsertionController {

    public void dataInsert(String userName, String userPass, String rol, Long docNumber, String realName, String lastName) throws Exception {

        User u = new User();
        u.setUserName(userName);
        u.setUserPass(userPass);
        u.setRol(rol);
        u.setDocNumber(docNumber);
        u.setRealName(realName);
        u.setLastName(lastName);
        UserDao userDao = new UserDao(FactoryConnection.getConnection(u));
        userDao.create(u);

    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
