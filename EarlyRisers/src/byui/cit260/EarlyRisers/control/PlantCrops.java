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
public class PlantCrops {
    public static int buyLand(int pricePerAcre, int acresToBuy, int acresOwned, int wheatInStorage, int population)throws BuyLandException{
        int wheatNeeded = acresToBuy * pricePerAcre;
        double peopleNeeded = Math.ceil((acresToBuy + acresOwned) / 10.0);
        int plantCrops = 0;
        
        pricePerAcre = 10;
        acresOwned = 100;
        wheatInStorage = 500;
        population = 100;
        acresToBuy = 0;
        
        if (plantCrops < 0)
	{
            throw new BuyLandException ("You cannot plant less than 0 crops");
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
        int totalAcresOwned = acresOwned + acresToBuy;
        
        return plantCrops;
}
}
