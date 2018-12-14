/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
import byui.cit260.EarlyRisers.control.SellLand;

/**
 *
 * @author Rache
 */
public class SellLandView extends View {

    private static SellLand goToSellLand() {
        SellLand sellTheLand = new SellLand();
//        buyTheLand.buyLand();
        return sellTheLand;
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput("How much land would you like to sell?");
        inputs[0] = selection;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        // System.out.println("This is where we'll validate the input and call the buy land function in the controller.");
        goToSellLand();

        ManageCropsView view = new ManageCropsView();
        view.display();

        return false;
    }
}
