/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
import java.util.Scanner;
/**
 *
 * @author Cody
 */
public class ManageCropsView extends View {
    //Get input from user 
    @Override
    public String[] getInputs(){
        String[] inputs = new String[10];
        String selection = this.getInput(
        "+-------------------------------------------+" +
        "\n|                                           |" +
        "\n|                Manage Crops               |" +
        "\n|                                           |" +
        "\n|                                           |" +
        "\n+-------------------------------------------+\n" +
        "\n1: Buy Land" +
        "\n2: Sell Land" +
        "\n3: Feed the People" +
        "\n4: Plant Crops" +
        "\n5: Tithes and Offerings Payment" +
        "\n6: Exit Manage Crops screen"
        );
        
        inputs[0] = selection;
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] input){
        String choice = input[0].toUpperCase();
        switch(choice){
            
            case "1":
                getBuyLandView();
                break;
            case "2": 
                calculateSellLand();
                break;
            case "3":
                calculateFeedPeople();
                break;
            case "4":
                calculatePlantCrops();
                break;
            case "5":
                calculateTithesAndOfferings();
                break;
            case "6":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }
        return false;
    }
    
    private void getBuyLandView(){
        BuyLandView menu = new BuyLandView();
        menu.display();
    }
    
    private void calculateSellLand(){
        SellLandView menu = new SellLandView();
        System.out.println("You're going to sell land!");
    }
    private void calculateFeedPeople(){
        System.out.println("You're going to feed the people!");
    }
    private void calculatePlantCrops(){
        PlantCropsView menu = new PlantCropsView();
        System.out.println("You're going to plant crops!");
    }
    private void calculateTithesAndOfferings(){
        System.out.println("You're going to pay tithes and offerings!");
    }
   
}
