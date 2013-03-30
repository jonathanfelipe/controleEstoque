/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({br.com.utfpr.model.ProductTest.class, br.com.utfpr.model.ClientTest.class, br.com.utfpr.model.ProviderTest.class, br.com.utfpr.model.ContactTest.class, br.com.utfpr.model.AddressTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}