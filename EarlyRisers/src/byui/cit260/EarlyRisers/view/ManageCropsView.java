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
public class ManageCropsView {
    boolean exit;
    
    public void runManageCropsView() {
	        printCropsMenu();
	        while (!exit){
	            printCropsMenu();
	            String choice = getInput();
	            doAction(choice);
	        }
	}
    
    private void printCropsMenu() {
        boolean done = false;
        
        do{
        System.out.println("+-------------------------------------------+");
        System.out.println("|                                           |");
        System.out.println("|                Manage Crops               |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("+-------------------------------------------+");
        
        System.out.println("B: Buy Land");
        System.out.println("S: Sell Land");
        System.out.println("F: Feed the People");
        System.out.println("P: Plant Crops");
        System.out.println("T: Tithes and Offerings Payment");
        System.out.println("E: Exit Manage Crops screen");
        String input = getInput();
        done = doAction(input);
        
        } while(!done);

    } 
    
    
    //Get input from user 
    private String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
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
        gameMenu.gameMenu();
    }
    
    private boolean doAction(String choice){
        choice = choice.toUpperCase();
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

}
