/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victoria
 */
public class PackerTest {
    
    public PackerTest() {
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
     * Class Packer, tests PackProducts method
     */
    @Test
    public void testPackProducts() {
        System.out.println("packProducts");
        Customer c = null;
        Depot d = null;
        Manifest m = null;
        List<Box> expResult = null;
        List<Box> result = null;
        assertEquals(expResult, result);
    }
    
}
