/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Family
 */
public class BuyLandTest {
    
    public BuyLandTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class BuyLand.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BuyLand.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcHarvest method, of class BuyLand.
     */
    @Test
    public void testCalcHarvest() {
        System.out.println("calcHarvest");
        int percent = 0;
        int acresToHarvest = 0;
        int expResult = 0;
        int result = BuyLand.calcHarvest(percent, acresToHarvest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
