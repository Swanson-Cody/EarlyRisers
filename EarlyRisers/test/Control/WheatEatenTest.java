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
public class WheatEatenTest {
    
    public WheatEatenTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcWheatEaten method, of class WheatEaten.
     */
    @Test
    public void testCalcWheatEaten() {
        System.out.println("calcWheatEaten");
        
        // --- Test Case 1---
        System.out.println("\tTest Case 1");
        double wheatStorage = 120;
        double tithing = 10;
        double random = 7.2;
        double expResult = 112.8;
        double result = WheatEaten.calcWheatEaten(wheatStorage, tithing, random);
        assertEquals(expResult, result, 0.0);
        
        // --- Text Case 2---
        System.out.println("\tTest Case 2");
        
        wheatStorage = 100;
        tithing = 3;
        random = 10;
        expResult = 90;
        result = WheatEaten.calcWheatEaten(wheatStorage, tithing, random);
        assertEquals(expResult, result, 0.0);
        
        // --- Text Case 3---
        System.out.println("\tTest Case 3");
        
        wheatStorage = 111;
        tithing = -6;
        random = 3;
        expResult = -1;
        result = WheatEaten.calcWheatEaten(wheatStorage, tithing, random);
        assertEquals(expResult, result, 0.0);
        
        // --- Text Case 4---
        System.out.println("\tTest Case 4");
        
        wheatStorage = 130;
        tithing = 15;
        random = 3.6;
        expResult = 126.4;
        result = WheatEaten.calcWheatEaten(wheatStorage, tithing, random);
        assertEquals(expResult, result, 0.0);
        
        // --- Text Case 5---
        System.out.println("\tTest Case 5");
        
        wheatStorage = 122;
        tithing = 30;
        random = 4.88;
        expResult = 117.12;
        result = WheatEaten.calcWheatEaten(wheatStorage, tithing, random);
        assertEquals(expResult, result, 0.0);
        
        // --- Text Case 6---
        System.out.println("\tTest Case 6");
        wheatStorage = 103;
        tithing = 8;
        random = 4.12;
        expResult = 98.88;
        result = WheatEaten.calcWheatEaten(wheatStorage, tithing, random);
        assertEquals(expResult, result, 0.0);
        
        // --- Text Case 7---
        System.out.println("\tTest Case 7");
        
        wheatStorage = 124;
        tithing = -10;
        random = 2.4;
        expResult = -1;
        result = WheatEaten.calcWheatEaten(wheatStorage, tithing, random);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
