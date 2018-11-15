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
        "\nB: Buy Land" +
        "\nS: Sell Land" +
        "\nF: Feed the People" +
        "\nP: Plant Crops" +
        "\nT: Tithes and Offerings Payment" +
        "\nE: Exit Manage Crops screen"
        );
        
        inputs[0] = selection;
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] input){
        String choice = input[0].toUpperCase();
        switch(choice){
            case "E":
                System.out.println("You have exited the Manage Crops screen."
                        + " Have fun with the game!");
                goToGameMenu();
                return true;
            case "B":
                calculateBuyLand();
                break;
            case "S": 
                calculateSellLand();
                break;
            case "F":
                calculateFeedPeople();
                break;
            case "P":
                calculatePlantCrops();
                break;
            case "T":
                calculateTithesAndOfferings();
                break;
            default:
                System.out.println("\nInvalid selection.");
        }
        return false;
    }
    
    private void calculateBuyLand(){
        System.out.println("You're going to buy land!");
    }
    private void calculateSellLand(){
        System.out.println("You're going to sell land!");
    }
    private void calculateFeedPeople(){
        System.out.println("You're going to feed the people!");
    }
    private void calculatePlantCrops(){
        System.out.println("You're going to plant crops!");
    }
    private void calculateTithesAndOfferings(){
        System.out.println("You're going to pay tithes and offerings!");
    }
    private void goToGameMenu(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
