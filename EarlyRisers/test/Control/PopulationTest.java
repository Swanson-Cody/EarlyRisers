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
            
        //Test-case 1
        System.out.println("Test Case 1");
        double population = 100.0;
        double w = 2.0;
        double expResult = 102.0;
        double result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);
     
        //Test-Case 2
        System.out.println("Test Case 2");
        population = 93.0;
        w = 3.0;
        expResult = 96; 
        result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);
       
        //Test-Case 3
        System.out.println("Test Case 3");
        population = 115.0;
        w = 0.0;
        expResult = -3;
        result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);
        
        //Test-Case 4
        System.out.println("Test Case 4");
        population = 70.0;
        w = 101.0;
        expResult = -4.0;
        result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);
        
        //Test-Case 5
        System.out.println("Test Case 5");
        population = 55.0;
        w = 4.0;
        expResult = 57; 
        result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);
        
        //Test-Case 6
        System.out.println("Test Case 6");
        population = 140.0;
        w = 3.0;
        expResult = 144; 
        result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);
        
        //Test-Case 7
        System.out.println("Test Case 7");
        population = 85.0;
        w = 2.0;
        expResult = 87; 
        result = Population.calcGrowth(population, w);
        assertEquals(expResult, result, 0.0);

        
              
    }

    }
    


