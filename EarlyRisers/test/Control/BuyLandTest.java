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
     * Test of buyLand method with too few population that should return -3.
     */
    @Test
    public void testBuyLand_TooFewPeople() {
        
        int pricePerAcre = 17;
        int acresToBuy = 20;
        int acresOwned = 20;
        int wheatInStorage = 500;
        int population = 3;
        int expResult = -3;
        int result = BuyLand.buyLand(pricePerAcre, acresToBuy, acresOwned, wheatInStorage, population);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method with all checks validating while returning 70.
     */
    @Test
    public void testBuyLand_Success_1() {
       
        int pricePerAcre = 22;
        int acresToBuy = 12;
        int acresOwned = 58;
        int wheatInStorage = 951;
        int population = 8;
        int expResult = 70;
        int result = BuyLand.buyLand(pricePerAcre, acresToBuy, acresOwned, wheatInStorage, population);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method with all checks validating while returning 50.
     */
    @Test
    public void testBuyLand_Success_2() {
       
        int pricePerAcre = 26;
        int acresToBuy = 6;
        int acresOwned = 44;
        int wheatInStorage = 380;
        int population = 5;
        int expResult = 50;
        int result = BuyLand.buyLand(pricePerAcre, acresToBuy, acresOwned, wheatInStorage, population);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method with a -1 returned indicating an error of cannot buy a negative amount of acres.
     */
    @Test
    public void testBuyLand_NegativeValueToBuy() {
       
        int pricePerAcre = 27;
        int acresToBuy = -10;
        int acresOwned = 70;
        int wheatInStorage = 856;
        int population = 12;
        int expResult = -1;
        int result = BuyLand.buyLand(pricePerAcre, acresToBuy, acresOwned, wheatInStorage, population);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method with a -2 returned indicating an error of not having enough wheat to make the purchase of acres.
     */
    @Test
    public void testBuyLand_NotEnoughWheatToBuy() {
       
        int pricePerAcre = 19;
        int acresToBuy = 100;
        int acresOwned = 80;
        int wheatInStorage = 1000;
        int population = 20;
        int expResult = -2;
        int result = BuyLand.buyLand(pricePerAcre, acresToBuy, acresOwned, wheatInStorage, population);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method with all checks validating while returning 60.
     */
    @Test
    public void testBuyLand_Success_3() {
       
        int pricePerAcre = 23;
        int acresToBuy = 10;
        int acresOwned = 50;
        int wheatInStorage = 628;
        int population = 6;
        int expResult = 60;
        int result = BuyLand.buyLand(pricePerAcre, acresToBuy, acresOwned, wheatInStorage, population);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method with all checks validating while returning 124.
     */
    @Test
    public void testBuyLand_Success_4() {
       
        int pricePerAcre = 18;
        int acresToBuy = 26;
        int acresOwned = 98;
        int wheatInStorage = 1028;
        int population = 14;
        int expResult = 124;
        int result = BuyLand.buyLand(pricePerAcre, acresToBuy, acresOwned, wheatInStorage, population);
        assertEquals(expResult, result);
    }
}
