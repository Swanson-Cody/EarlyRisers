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
public class ToolShop {
    boolean exit;
    	    
    public ToolShop (){
      int plow;
      int horse;
      int shovel;
      int scythe;
      int oxen;
      int seed;}
//      public void display() {
//        this.printHeader();
//        this.getPlayer();
//        MainMenuView menu = new MainMenuView();
//        menu.display();        
//}              
	        //Menu options         
    public void displayTools() {
	this.toolsHeader();
        String choice = getInput();
        doAction(choice);
        ToolShop tools = new ToolShop();
        tools.displayTools();
                   }    
            
            
    private void toolsHeader(){      
    System.out.println("+-------------------------------------------+");
    System.out.println("|                                           |");
    System.out.println("|              Welcome to the               |");
    System.out.println("|                 Tool Shop                 |");
    System.out.println("|                                           |");
    System.out.println("+-------------------------------------------+");
    System.out.println("\nN: Buy new tools");
    System.out.println("S: Sell used tools");
    System.out.println("H: Help");}
    
    
        boolean done = false;
    //Get number input from user 
    private String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
}
    private boolean doAction(String choice){
       choice = choice.toUpperCase();
    switch(choice){
        case "N":
            buyTools();
            return true;
        case "S":
            sellTools();
        break;
        case "H":
            help();
            break;
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
    }
    private void buyTools(){
       
    System.out.println("\nThe tools for sale are plow (20 wheat), horse(100), "
            + "ox(120), scythe2=(20), shovel(5) and seed(20/acre).");
    }
    private void sellTools(){
        System.out.println("\nThe tools for sale are plow (5 wheat), horse(20), "
            + "ox(30), scythe2=(5), shovel(1) and seed(2/acre).");
    }
    private void help(){
       HelpMenuView menu = new HelpMenuView();
       menu.runMenu();
    
    }
        
}
