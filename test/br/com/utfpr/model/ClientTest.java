/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Client.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Client.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Client instance = new Client();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSsn method, of class Client.
     */
    @Test
    public void testGetSsn() {
        System.out.println("getSsn");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getSsn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSsn method, of class Client.
     */
    @Test
    public void testSetSsn() {
        System.out.println("setSsn");
        String ssn = "";
        Client instance = new Client();
        instance.setSsn(ssn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddr method, of class Client.
     */
    @Test
    public void testGetAddr() {
        System.out.println("getAddr");
        Client instance = new Client();
        Address expResult = null;
        Address result = instance.getAddr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddr method, of class Client.
     */
    @Test
    public void testSetAddr() {
        System.out.println("setAddr");
        Address addr = null;
        Client instance = new Client();
        instance.setAddr(addr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class Client.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        Client instance = new Client();
        Contact expResult = null;
        Contact result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class Client.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        Contact cont = null;
        Client instance = new Client();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient_id method, of class Client.
     */
    @Test
    public void testGetClient_id() {
        System.out.println("getClient_id");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getClient_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient_id method, of class Client.
     */
    @Test
    public void testSetClient_id() {
        System.out.println("setClient_id");
        int client_id = 0;
        Client instance = new Client();
        instance.setClient_id(client_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}