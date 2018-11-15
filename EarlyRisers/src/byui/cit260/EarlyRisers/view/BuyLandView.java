/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.BuyLand;

/**
 *
 * @author Cody
 */
public class BuyLandView extends View{
    private static BuyLand goToBuyLand() {
        BuyLand buyTheLand = new BuyLand();
//        buyTheLand.buyLand();
        return buyTheLand;
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput("How much land would you like to buy?");
        inputs[0] = selection;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0].toUpperCase();
        
        System.out.println("This is where we'll validate the input and call the buy land function in the controller.");
//        goToBuyLand();
        
        ManageCropsView view = new ManageCropsView();
        view.display();
        
        return false;
    }
}