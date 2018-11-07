/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

/**
 *
 * @author Family
 */
public class BuyLand {    
    public static int buyLand(int pricePerAcre, int acresToBuy, int acresOwned, int wheatInStorage, int population) {
        int wheatNeeded = acresToBuy * pricePerAcre;
        double peopleNeeded = Math.ceil((acresToBuy + acresOwned) / 10.0);
        
        if (acresToBuy < 0)
	{
            return -1;
	}
        else if (wheatNeeded > wheatInStorage)
        {
            return -2;
        }
        else if (peopleNeeded > population) 
        {
            return -3;
        }
        int remainingWheat = wheatInStorage - wheatNeeded;
        int totalAcresOwned = acresOwned + acresToBuy;
        
        return totalAcresOwned;
    }

    public void buyLand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}