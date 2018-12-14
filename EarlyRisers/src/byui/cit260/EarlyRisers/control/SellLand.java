/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.exceptions.BuyLandException;

/**
 *
 * @author rache
 */
public class SellLand {
    public static int sellLand(int pricePerAcre, int acresToSell, int acresOwned, int wheatInStorage, int population)throws BuyLandException{
        int wheatNeeded = acresToSell * pricePerAcre;
        double peopleNeeded = Math.ceil((acresOwned - acresToSell) / 10.0);
        
        pricePerAcre = 10;
        acresOwned = 100;
        wheatInStorage = 500;
        population = 100;
        acresToSell = 0;
        
        if (acresToSell < 0)
	{
            throw new BuyLandException ("You cannot sell less than 0 acres of land.");
	}
        else if (wheatNeeded > wheatInStorage)
        {
            throw new BuyLandException ("You need wheat in your storage.");
        }
        else if (peopleNeeded > population) 
        {
            throw new BuyLandException ("You must have people to work the land.");
        }
//        else if(){
//            
//        }
        int remainingWheat = wheatInStorage - wheatNeeded;
        int totalAcresOwned = acresOwned - acresToSell;
        
        return acresToSell;
}
}
