/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class SceneMenuView {
     public SceneMenuView()  {               
	    }
    
        //Menu options 
    public void display(){
        boolean done = false;
        do {
    System.out.println("+-------------------------------------------+");
    System.out.println("|                                           |");
    System.out.println("|                Welcome to                 |");
    System.out.println("|              Scene Selection              |");
    System.out.println("|                                           |");
    System.out.println("+-------------------------------------------+");
	    
    System.out.println("\nPlease make a scene selection: ");
    System.out.println("C) Go to the Church"); 
    System.out.println("W) Go to the Warehouse");
    System.out.println("F) Go to the Fields");
    System.out.println("T) Buy tools from the shop");
    System.out.println("H) Go home");
    System.out.println("E) Exit Menu");
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
        case "C": 
            church();
            break;
        case "W":
             warehouse();
            break;
        case "F":
            fields();
            break;
        case "T":
             tools();
            break;
        case "H":
             home();
        case "E":
            System.out.println("You have exited the Scene Menu."
                    + "Have fun with the game!");
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
    }
//scene of the church where you have the option to pay tithing
    private void church(){
        System.out.println("How much tithing would you like to pay?");
    }
//scene of the warehouse where you can buy and sell wheat and extra supplies
//are stored
    private void warehouse(){
        System.out.println("This to the warehouse for supplies.");
    }
//scene of the field where you harvest and plant next years crops
    private void fields(){
        System.out.println("This will take us to fields to plant and harvest.");
    }
//scene of a tool shop to help you be able to plant and harvest crops    
    private void tools(){
         System.out.println("This will take us to the tool menu.");
    }
//home where the year ends and you start the next phase
    private void home(){
         System.out.println("This will take us home to end the year and begin "
                 + "the next one.");
    }
    
}
