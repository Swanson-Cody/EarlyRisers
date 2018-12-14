/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
import byui.cit260.EarlyRisers.control.PlantCrops;
import byui.cit260.EarlyRisers.control.SellLand;

/**
 *
 * @author Rache
 */
public class PlantCropsView extends View {

    private static PlantCrops goToPlantCrops() {
        PlantCrops cropsPlanted = new PlantCrops();
//        buyTheLand.buyLand();
        return cropsPlanted;
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput("How many crops would you like to plant?");
        inputs[0] = selection;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        // System.out.println("This is where we'll validate the input and call the buy land function in the controller.");
        goToPlantCrops();

        ManageCropsView view = new ManageCropsView();
        view.display();

        return false;
    }
}
