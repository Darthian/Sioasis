/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sioasis.controller;

import com.google.code.morphia.Datastore;
import com.sioasis.entity.userAdmin;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author darthian
 */
public class ConnectionFactoryTest {

    static userAdmin user;

    public ConnectionFactoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        user = new userAdmin();
        user.setUserName("Yo");
        user.setUserPass("12345");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getConnection method, of class FactoryConnection.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        Datastore ds = FactoryConnection.getConnection(user);
        System.out.println("trying to conect to database: " + ds.getDB());
        assertNotNull(ds);
    }
}
