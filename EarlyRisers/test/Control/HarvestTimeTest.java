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
 * @author rache
 */
public class HarvestTimeTest {
    
    public HarvestTimeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcHarvest method, of class HarvestTime.
     */
    @Test
    public void testCalcHarvestOne() {
        int percent = 15;
        int acresOwned = 80;
        int highTithesYieldPerAcre = 5;
        int medTithesYieldPerAcre = 0;
        int lowTithesYieldPerAcre = 0;
        int expResult = 400;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
    }    
    
    
    /**
     * Test of calcHarvest method, of class HarvestTime.
     */
    @Test
    public void testCalcHarvestTwo() {
        int percent = 5;
        int acresOwned = 50;
        int highTithesYieldPerAcre = 0;
        int medTithesYieldPerAcre = 0;
        int lowTithesYieldPerAcre = 3;
        int expResult = 150;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
    }    
    
        /**
     * Test of calcHarvest method, of class HarvestTime.
     */
    @Test
    public void testCalcHarvestThree() {
        int percent = -6;
        int acresOwned = 90;
        int highTithesYieldPerAcre = 5;
        int medTithesYieldPerAcre = 0;
        int lowTithesYieldPerAcre = 3;
        int expResult = -1;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
    }    
    @Test
    public void testCalcHarvestFour() {
        int percent = 105;
        int acresOwned = 102;
        int highTithesYieldPerAcre = 0;
        int medTithesYieldPerAcre = 0;
        int lowTithesYieldPerAcre = 1;
        int expResult = -2;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcHarvestFive() {
        int percent = 3;
        int acresOwned = 20;
        int highTithesYieldPerAcre = 0;
        int medTithesYieldPerAcre = 0;
        int lowTithesYieldPerAcre = 2;
        int expResult = 40;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcHarvestSix() {
        int percent = 10;
        int acresOwned = 97;
        int highTithesYieldPerAcre = 0;
        int medTithesYieldPerAcre = 4;
        int lowTithesYieldPerAcre = 0;
        int expResult = 388;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcHarvestSeven() {
        int percent = 12;
        int acresOwned = 151;
        int highTithesYieldPerAcre = 0;
        int medTithesYieldPerAcre = 3;
        int lowTithesYieldPerAcre = 0;
        int expResult = 453;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
    }
//        // --- Text Case 7---
//        System.out.println("\tTest Case 7");
//        percent = 12;
//        acresOwned = 151;
//        highTithesYieldPerAcre = 0;
//        medTithesYieldPerAcre = 3;
//        lowTithesYieldPerAcre = 0;
//        expResult = 453;
//        result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
}
