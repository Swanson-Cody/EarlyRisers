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
public class ToolShop extends View{
      public ToolShop (){
      double plow;
      double horse;
      double shovel;
      double scythe;
      double oxen;}
//      public void display() {
//        this.printHeader();
//        this.getPlayer();
//        MainMenuView menu = new MainMenuView();
//        menu.display();        
//}              
	        //Menu options
     @Override
     public String[] getInputs(){
        String[] inputs = new String[10];
        String selection = this.getInput(
     
   ("\n+-------------------------------------------+" +
    "\n|                                           |" +
    "\n|              Welcome to the               |" +
    "\n|                 Tool Shop                 |" +
    "\n|                                           |" +
    "\n+-------------------------------------------+" +
    "\n\n1: Buy new tools" +
    "\n2: Sell used tools"));
    inputs[0] = selection;
    return inputs;
}   
    
    //Get number input from user 
    @Override
    public boolean doAction (String [] inputs){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        switch (choice) {

        case "1":
            buyTools();
            return true;
        case "2":
            sellTools();
        break;
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
    }
    private void buyTools(){
       
    System.out.println("\nThe tools for sale are plow (20 wheat), horse(100), "
            + "ox(120), scythe2=(20), and shovel(5).");
    }
    private void sellTools(){
        System.out.println("\nThe tools for sale are plow (5 wheat), horse(20), "
            + "ox(30), scythe2=(5), and shovel(1).");
    }
    private void help(){
       HelpMenuView menu = new HelpMenuView();
       menu.display();
    
    }

   
        
}
