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
public class FeedPeople {
        public static int buyLand(int pricePerAcre, int acresToBuy, int acresOwned, int wheatInStorage, int population)throws BuyLandException{
        double peopleNeeded = Math.ceil((acresToBuy + acresOwned) / 10.0);
        int wheatPerPerson = 2;
        int wheatNeeded = population * wheatPerPerson;
        
        
        pricePerAcre = 10;
        acresOwned = 100;
        wheatInStorage = 500;
        population = 100;
        acresToBuy = 0;
               
        if (wheatPerPerson < 0)
	{
            throw new BuyLandException ("You cannot feed people a negative amount of food");
	}
        else if (wheatNeeded > wheatInStorage)
        {
            throw new BuyLandException ("You need wheat in your storage.");
        }
        else if (peopleNeeded > population) 
        {
            throw new BuyLandException ("You must have people to work the land.");
        }
        else if(wheatNeeded < wheatNeeded){
            population = population - 3;
      }
        int remainingWheat = wheatInStorage - wheatNeeded;
        int totalAcresOwned = acresOwned + acresToBuy;
        
        return remainingWheat;
}
}
