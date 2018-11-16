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
public class GameMenuView extends View{
            //Menu options 
      //Get number input from user 
    @Override
    public String[] getInputs(){
        String[] inputs = new String[10];
        String selection = this.getInput(

    "\n+-------------------------------------------+" +
    "\n|                                           |" +
    "\n|                Welcome to                 |" +
    "\n|         Game of the City of Aaron         |" +
    "\n|                                           |" +
    "\n+-------------------------------------------+" +
	    
 "\nYou have been elected the leader of the City of Aaron." +
            "\nYou are starting the game with the population of 100 people." +
            "\nYou are the ruler and must make wise choices to provide for the" +
            "\nneeds of your people.  You will start the game with 2800 bushels" +
            "\nof wheat to feed your people, use as currency or plant the next" +
            "\nharvest. You will also have the opportunity to buy tools and pay" +
            "\ntithes to the church. Use all your resources well. " +
            "\nEach turn you will use the options below to complete the time" +
            "\nperiod." + 
           
    "\n\nPlease make a game selection: " +
    "\n1) Reports Menu" +
    "\n2) Buy/Sell Tools" +
    "\n3) Pay tithing" +
    "\n4) Manage Crops" +
    "\n5) Go home"); 
        inputs [0] = selection;
        return inputs;
    }
@Override
    public boolean doAction(String[] input){
        String choice = input[0].toUpperCase();

    switch(choice){
        case "1":
            getReportsMenuView();
            break;
        case "2":
            tools();
            break;
        case "3":
             tithes();
            break;
        case "4":
             getManageCropsView();
             break;
        case "5":
            home();
            break;
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
    }
//scene of the church where you have the option to pay tithing
    private void getReportsMenuView(){
        ReportsMenuView menu = new ReportsMenuView();
        menu.display();
    }
//scene of the warehouse where you can buy and sell wheat and extra supplies
//are stored
    private void tools(){
        GameMenuView game = new GameMenuView();
        game.display();  
      
    }
//scene of the field where you harvest and plant next years crops
    private void tithes(){
        ChurchView church = new ChurchView();
        church.display();
        System.out.println("This will take us to the church to pay tithing.");
    }
//scene of a tool shop to help you be able to plant and harvest crops    
    private void getManageCropsView(){
        ManageCropsView menu = new ManageCropsView();
        menu.display();
    }
//home where the year ends and you start the next phase
    private void home(){
       MainMenuView menu = new MainMenuView();
       menu.display();
               
    }
    
}
