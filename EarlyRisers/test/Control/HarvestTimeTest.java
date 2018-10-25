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
    public void testCalcHarvest() {
        System.out.println("calcHarvest");
        
         // --- Text Case 1---
        System.out.println("\tTest Case 1");
        int percent = 15;
        int acresOwned = 80;
        int highTithesYieldPerAcre = 5;
        int medTithesYieldPerAcre = 0;
        int lowTithesYieldPerAcre = 0;
        int expResult = 400;
        int result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
        
         // --- Text Case 2---
        System.out.println("\tTest Case 2");
        percent = 5;
        acresOwned = 50;
        highTithesYieldPerAcre = 0;
        medTithesYieldPerAcre = 0;
        lowTithesYieldPerAcre = 3;
        expResult = 150;
        result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
        
         // --- Text Case 3---
        System.out.println("\tTest Case 3");
        percent = -6;
        acresOwned = 90;
        highTithesYieldPerAcre = 5;
        medTithesYieldPerAcre = 0;
        lowTithesYieldPerAcre = 3;
        expResult = -1;
        result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
        
        // --- Text Case 4---
        System.out.println("\tTest Case 4");
        percent = 105;
        acresOwned = 102;
        highTithesYieldPerAcre = 0;
        medTithesYieldPerAcre = 0;
        lowTithesYieldPerAcre = 1;
        expResult = 0;
        result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
        
        // --- Text Case 5---
        System.out.println("\tTest Case 5");
        percent = 3;
        acresOwned = 20;
        highTithesYieldPerAcre = 0;
        medTithesYieldPerAcre = 0;
        lowTithesYieldPerAcre = 2;
        expResult = 40;
        result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
        
        // --- Text Case 6---
        System.out.println("\tTest Case 6");
        percent = 10;
        acresOwned = 97;
        highTithesYieldPerAcre = 0;
        medTithesYieldPerAcre = 4;
        lowTithesYieldPerAcre = 0;
        expResult = 388;
        result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
        
        // --- Text Case 7---
        System.out.println("\tTest Case 7");
        percent = 12;
        acresOwned = 151;
        highTithesYieldPerAcre = 0;
        medTithesYieldPerAcre = 3;
        lowTithesYieldPerAcre = 0;
        expResult = 453;
        result = HarvestTime.calcHarvest(percent, acresOwned, highTithesYieldPerAcre, medTithesYieldPerAcre, lowTithesYieldPerAcre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
