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
import byui.cit260.EarlyRisers.model.InventoryItem;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cody
 */
public class BuyLandView extends View {
    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput("How much land would you like to buy?");
        inputs[0] = selection;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        Land land = new Land();
        try {
            land.buyLand(Integer.parseInt(inputs[0]));
            InventoryItem acresOwned = GameControl.getInventoryItemByName("Acres");
            this.console.println("You successfully purchased " + inputs[0] + " acres. You now own " + acresOwned.getQuantity() + " acres.");
        } catch (BuyLandException | GameControlException ex) {
            Logger.getLogger(BuyLandView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ManageCropsView view = new ManageCropsView();
        view.display();

        return false;
    }
}
