/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
import java.util.Scanner;
/**
 *
 * @author rache
 */
public class SuppliesView {
    
    boolean exit;
//    public void displaySupplies() {
//
//        this.printSuppliesHeader();
//        MainMenuView menu = new MainMenuView();
//        menu.display();
//
//    }
//    
                
	    public void display() {
	        printSuppliesHeader();
	        while (!exit){
	            printSuppliesHeader();
	            String choice = getInput();
	            doAction(choice);
	        }
	}

    //Welcome Screen
    private void printSuppliesHeader() {
        boolean done = false;
        
        do{
        System.out.println("+-------------------------------------------+");
        System.out.println("|                                           |");
        System.out.println("|                 Supplies                  |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("+-------------------------------------------+");
        
        System.out.println("M: How much Money You have");
        System.out.println("P: What is the current population");
        System.out.println("W: How much wheat do you have");
        System.out.println("E: Exit supplies screen");
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
        private void calculateMoney(){
        System.out.println("You currently have this much money.");
    }
            private void calculatePopulation(){
        System.out.println("The current population is: ");
    }
            
    private void calculateWheat(){
        System.out.println("You currently have this much wheat in storage.");

    }
    
    private void goToMainMenu(){
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    private boolean doAction(String choice){
       choice = choice.toUpperCase();
    switch(choice){
        case "E":
            System.out.println("You have exited the supplies screen."
                    + "Have fun with the game!");
            goToMainMenu();
            return true;
        case "M":
            calculateMoney();
            break;
        case "P": 
            calculatePopulation();
        break;
        case "W":
             calculateWheat();
        break;
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
    }

}
