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
 * @author Heather
 */
public class PopulationTest {
    
    public PopulationTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcGrowth method, of class Population.
     */
    @Test
    public void testCalcGrowth() {
        System.out.println("calcGrowth");
        //Test case 1
        System.out.println("Test case 1");
        int population = 100;
        int w = 2;
        double expResult = 102.0;
        double result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
