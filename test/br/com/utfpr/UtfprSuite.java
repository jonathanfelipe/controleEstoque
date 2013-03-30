/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr;

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
@Suite.SuiteClasses({br.com.utfpr.dao.DaoSuite.class, br.com.utfpr.view.ViewSuite.class, br.com.utfpr.model.ModelSuite.class, br.com.utfpr.persistence.PersistenceSuite.class, br.com.utfpr.control.ControlSuite.class})
public class UtfprSuite {

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