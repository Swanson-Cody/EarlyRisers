/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
//import byui.cit260.EarlyRisers.model.Player;
//import byui.cit260.EarlyRisers.model.Game;  
import byui.cit260.EarlyRisers.control.BuyLand;

import java.util.Scanner;

/**
 *
 * 
 */
public class GameMenuView {
            //Menu options 
    public void gameMenu(){
        boolean done = false;
        do {
    System.out.println("+-------------------------------------------+");
    System.out.println("|                                           |");
    System.out.println("|                Welcome to                 |");
    System.out.println("|         Game of the City of Aaron         |");
    System.out.println("|                                           |");
    System.out.println("+-------------------------------------------+");
	    
    System.out.println("You have been elected the leader of the City of Aaron."
            + "You are starting the game with the population of 100 people."
            + "\nYou are the ruler and must make wise choices to provide for the"
            + "\nneeds of your people.  You will start the game with 2800 bushels"
            + "\nof wheat to feed your people, use as currency or plant the next"
            + "\nharvest. You will also have the opportunity to buy tools and pay"
            + "\ntithes to the church. Use all your resources well. "
            + "\nEach turn you will use the options below to complete the time"
            + "\nperiod.");
           
    System.out.println("\nPlease make a game selection: ");
    System.out.println("L) Buy/Sell land"); 
    System.out.println("N) Buy/Sell Tools");
    System.out.println("T) Pay tithing");
    System.out.println("F) Plant/Collect Fields");
    System.out.println("H) Go home");
            String input = getInput();
        done = doAction(input);
        } while(!done);
    }
    
     private String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
      
    //Get number input from user 
   }
    private boolean doAction(String choice){
       choice = choice.toUpperCase();
    switch(choice){
        case "L":
            land();
            break;
        case "N":
            tools();
            break;
        case "T":
             tithes();
            break;
        case "F":
             fields();
             break;
        case "H":
            help();
            break;
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
    }
//scene of the church where you have the option to pay tithing
    private void land(){
        SuppliesView menu = new SuppliesView();
        menu.runSuppliesMenu();
    }
//scene of the warehouse where you can buy and sell wheat and extra supplies
//are stored
    private void tools(){
        GameMenuView game = new GameMenuView();
        game.gameMenu();  
      
    }
//scene of the field where you harvest and plant next years crops
    private void tithes(){
        System.out.println("This will take us to the church to pay tithing.");
    }
//scene of a tool shop to help you be able to plant and harvest crops    
    private void fields(){
        SuppliesView menu = new SuppliesView();
        menu.runSuppliesMenu();
    }
//home where the year ends and you start the next phase
    private void help(){
      HelpMenuView menu = new HelpMenuView();
       menu.runMenu();
    }
    
}
