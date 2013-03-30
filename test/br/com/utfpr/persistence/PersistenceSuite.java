/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.persistence;

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
@Suite.SuiteClasses({br.com.utfpr.persistence.ProductDaoTest.class, br.com.utfpr.persistence.AddressDaoTest.class, br.com.utfpr.persistence.ProviderDaoTest.class, br.com.utfpr.persistence.ClientDaoTest.class, br.com.utfpr.persistence.DaoTest.class, br.com.utfpr.persistence.ContactDaoTest.class, br.com.utfpr.persistence.ConnectionFactoryTest.class})
public class PersistenceSuite {

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