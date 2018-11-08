/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public class ReportsMenuView {
    boolean exit;
    
    public void runReportsMenuView() {
	        printReportsMenu();
	        while (!exit){
	            printReportsMenu();
	            String choice = getInput();
	            doAction(choice);
	        }
	}
    
    private void printReportsMenu() {
        boolean done = false;
        
        do{
        System.out.println("+-------------------------------------------+");
        System.out.println("|                                           |");
        System.out.println("|                Reports Menu               |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("+-------------------------------------------+");
        
        System.out.println("A: View the animals in the storehouse");
        System.out.println("T: View the tools in the storehouse");
        System.out.println("P: View the provisions in the storehouse");
        System.out.println("X: View the authors of this game");
        System.out.println("E: Exit Reports Menu screen");
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
    private void viewAnimals(){
        System.out.println("You're Viewing Animals!");
    }
    private void viewTools(){
        System.out.println("You're Viewing Tools!");
    }
    private void viewProvisions(){
        System.out.println("You're Viewing Provisions!");
    }
    private void viewAuthors(){
        System.out.println("You're Viewing Authors!");
    }
    private void goToGameMenu(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.gameMenu();
    }
    
    private boolean doAction(String choice){
       choice = choice.toUpperCase();
    
       if("E".equals(choice)){
            System.out.println("You have exited the Reports Menu. "
                    + "Have fun with the game!");
            goToGameMenu();
            return true;
       }
        else if("A".equals(choice)){
            viewAnimals();
        }
        else if("T".equals(choice)){ 
            viewTools();
        }
        else if("P".equals(choice)){
            viewProvisions();
        }
        else if("X".equals(choice)){
            viewAuthors();
        }
        else{
            System.out.println("\nInvalid selection.");
        }
       
    return false;
    }

}
