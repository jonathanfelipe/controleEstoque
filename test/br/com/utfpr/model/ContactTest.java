/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import java.util.ArrayList;
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
public class ContactTest {
    
    public ContactTest() {
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
     * Test of getContact_id method, of class Contact.
     */
    @Test
    public void testGetContact_id() {
        System.out.println("getContact_id");
        Contact instance = new Contact();
        int expResult = 0;
        int result = instance.getContact_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContact_id method, of class Contact.
     */
    @Test
    public void testSetContact_id() {
        System.out.println("setContact_id");
        int contact_id = 0;
        Contact instance = new Contact();
        instance.setContact_id(contact_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephone method, of class Contact.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Contact instance = new Contact();
        ArrayList expResult = null;
        ArrayList result = instance.getTelephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelephone method, of class Contact.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        ArrayList<String> telephone = null;
        Contact instance = new Contact();
        instance.setTelephone(telephone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTelephone method, of class Contact.
     */
    @Test
    public void testAddTelephone() {
        System.out.println("addTelephone");
        String telephone = "";
        Contact instance = new Contact();
        instance.addTelephone(telephone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellphone method, of class Contact.
     */
    @Test
    public void testGetCellphone() {
        System.out.println("getCellphone");
        Contact instance = new Contact();
        ArrayList expResult = null;
        ArrayList result = instance.getCellphone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellphone method, of class Contact.
     */
    @Test
    public void testSetCellphone() {
        System.out.println("setCellphone");
        ArrayList<String> cellphone = null;
        Contact instance = new Contact();
        instance.setCellphone(cellphone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCellphone method, of class Contact.
     */
    @Test
    public void testAddCellphone() {
        System.out.println("addCellphone");
        String cellphone = "";
        Contact instance = new Contact();
        instance.addCellphone(cellphone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Contact.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Contact instance = new Contact();
        ArrayList expResult = null;
        ArrayList result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Contact.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        ArrayList<String> email = null;
        Contact instance = new Contact();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmail method, of class Contact.
     */
    @Test
    public void testAddEmail() {
        System.out.println("addEmail");
        String email = "";
        Contact instance = new Contact();
        instance.addEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}