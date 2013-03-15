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
public class InsertionController {

    public void dataInsert1(String userName, String userPass, Long docNumber, String realName, String lastName) throws Exception {

        userAdmin u = new userAdmin();
        u.setUserName(userName);
        u.setUserPass(userPass);
        u.setDocNumber(docNumber);
        u.setRealName(realName);
        u.setLastName(lastName);
        
        UserAdminDAO userDao = new UserAdminDAO(FactoryConnection.getConnection(u));
        if(userDao.findByUserName(userName)!= null){
            //TO DO
        }
        else{
        userDao.create(u);
        }
        
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
