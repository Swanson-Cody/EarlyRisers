/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.GameControl;
import byui.cit260.EarlyRisers.control.Land;
import byui.cit260.EarlyRisers.exceptions.BuyLandException;
import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.InventoryItem;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rache
 */
public class SellLandView extends View {
    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput("How much land would you like to sell?");
        inputs[0] = selection;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        // this.console.println("This is where we'll validate the input and call the buy land function in the controller.");
        Land land = new Land();

        try {
            land.sellLand(Integer.parseInt(inputs[0]));
            InventoryItem acresOwned = GameControl.getInventoryItemByName("Acres");
            InventoryItem wheatOwned = GameControl.getInventoryItemByName("Wheat Bushels");
            this.console.println("You successfully sold " + inputs[0] + " acres. You now own " + wheatOwned.getQuantity() + " amount of wheat. You also have " + acresOwned.getQuantity() + " amount of acres.");
        } catch (BuyLandException | GameControlException ex) {
            EarlyRisers.logFile.write(ex.getMessage());
        }
        
        ManageCropsView view = new ManageCropsView();
        view.display();

        return false;
    }
}
