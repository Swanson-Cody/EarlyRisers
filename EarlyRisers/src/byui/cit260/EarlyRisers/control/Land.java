/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;
import byui.cit260.EarlyRisers.exceptions.BuyLandException;
import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.model.InventoryItem;
import java.util.Random;
/**
 *
 * @author Family
 */
public class Land {    
    public void buyLand(int acresToBuy)throws BuyLandException, GameControlException
    {
        InventoryItem acresOwned = GameControl.getInventoryItemByName("Acres");
        InventoryItem population = GameControl.getInventoryItemByName("Population");
        InventoryItem wheatInStorage = GameControl.getInventoryItemByName("Wheat Bushels");        
        Random rnd = new Random();
        int pricePerAcre = rnd.nextInt(11) + 17;
        int wheatNeeded = acresToBuy * pricePerAcre;
        double peopleNeeded = Math.ceil((acresToBuy + acresOwned.getQuantity()) / 10.0);
        
        if (acresToBuy < 0)
	{
            throw new BuyLandException ("You cannot have less than 0 acres of land.");
	}
        else if (wheatNeeded > wheatInStorage.getQuantity())
        {
            throw new BuyLandException ("You need wheat in your storage.");
        }
        else if (peopleNeeded > population.getQuantity()) 
        {
            throw new BuyLandException ("You must have people to work the land.");
        }
        
        int remainingWheat = wheatInStorage.getQuantity() - wheatNeeded;
        int totalAcresOwned = acresOwned.getQuantity() + acresToBuy;
        
        wheatInStorage.setQuantity(remainingWheat);
        acresOwned.setQuantity(totalAcresOwned);
    }
    
    public void sellLand(int acresToSell)throws BuyLandException, GameControlException{
        InventoryItem acresOwned = GameControl.getInventoryItemByName("Acres");
        InventoryItem population = GameControl.getInventoryItemByName("Population");
        InventoryItem wheatInStorage = GameControl.getInventoryItemByName("Wheat Bushels"); 
        Random rnd = new Random();
        int pricePerAcre = rnd.nextInt(11) + 17;
        int wheatNeeded = acresToSell * pricePerAcre;
        double peopleNeeded = Math.ceil((acresOwned.getQuantity() - acresToSell) / 10.0);
        
        if (acresToSell < 0)
	{
            throw new BuyLandException ("You cannot sell less than 0 acres of land.");
	}
        else if (wheatNeeded > wheatInStorage.getQuantity())
        {
            throw new BuyLandException ("You need wheat in your storage.");
        }
        else if (peopleNeeded > population.getQuantity()) 
        {
            throw new BuyLandException ("You must have people to work the land.");
        }
        
        int remainingWheat = wheatInStorage.getQuantity() - wheatNeeded;
        int totalAcresOwned = acresOwned.getQuantity() - acresToSell;
        
        wheatInStorage.setQuantity(remainingWheat);
        acresOwned.setQuantity(totalAcresOwned);
    }   
}