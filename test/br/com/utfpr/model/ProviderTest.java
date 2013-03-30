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
public class ProviderTest {
    
    public ProviderTest() {
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
     * Test of getProvider_id method, of class Provider.
     */
    @Test
    public void testGetProvider_id() {
        System.out.println("getProvider_id");
        Provider instance = new Provider();
        int expResult = 0;
        int result = instance.getProvider_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProvider_id method, of class Provider.
     */
    @Test
    public void testSetProvider_id() {
        System.out.println("setProvider_id");
        int provider_id = 0;
        Provider instance = new Provider();
        instance.setProvider_id(provider_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Provider.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Provider instance = new Provider();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Provider.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Provider instance = new Provider();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLegalPersonNumber method, of class Provider.
     */
    @Test
    public void testGetLegalPersonNumber() {
        System.out.println("getLegalPersonNumber");
        Provider instance = new Provider();
        int expResult = 0;
        int result = instance.getLegalPersonNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLegalPersonNumber method, of class Provider.
     */
    @Test
    public void testSetLegalPersonNumber() {
        System.out.println("setLegalPersonNumber");
        int legalPersonNumber = 0;
        Provider instance = new Provider();
        instance.setLegalPersonNumber(legalPersonNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducts_id method, of class Provider.
     */
    @Test
    public void testGetProducts_id() {
        System.out.println("getProducts_id");
        Provider instance = new Provider();
        ArrayList expResult = null;
        ArrayList result = instance.getProducts_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProducts_id method, of class Provider.
     */
    @Test
    public void testSetProducts_id() {
        System.out.println("setProducts_id");
        ArrayList<Integer> products_id = null;
        Provider instance = new Provider();
        instance.setProducts_id(products_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct_id method, of class Provider.
     */
    @Test
    public void testAddProduct_id() {
        System.out.println("addProduct_id");
        int product_id = 0;
        Provider instance = new Provider();
        instance.addProduct_id(product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddr method, of class Provider.
     */
    @Test
    public void testGetAddr() {
        System.out.println("getAddr");
        Provider instance = new Provider();
        Address expResult = null;
        Address result = instance.getAddr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddr method, of class Provider.
     */
    @Test
    public void testSetAddr() {
        System.out.println("setAddr");
        Address addr = null;
        Provider instance = new Provider();
        instance.setAddr(addr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class Provider.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        Provider instance = new Provider();
        Contact expResult = null;
        Contact result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class Provider.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        Contact cont = null;
        Provider instance = new Provider();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}