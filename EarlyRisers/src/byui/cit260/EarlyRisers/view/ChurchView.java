/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.GameControl;
import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.model.InventoryItem;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Heather
 */
public class ChurchView extends View {
    //Menu options 
    //Get number input from user 

    public ChurchView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "+---------------------------------------------+" +
                 "\n|                 Welcome to                  |" + 
                 "\n|                 The Church                  |" +
                 "\n+---------------------------------------------+" +
                 "\n\nPlease make a game selection: "
                + "\n1) Pay tithing now."
                + "\n2) Stop and worship for the Sabbath."
                + "\n3) Exit.");
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();

        switch (choice) {
            case "1":
//        {
//            try {
                payTithing();
//            } catch (GameControlException ex) {
//                Logger.getLogger(ChurchView.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
                break;
            case "2":
                rest();
                break;
            case "3":
               return true;
            default:
                //this.console.println("\nInvalid selection.");
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }
        return false;
    }
//scene of the church where you have the option to pay tithing

    public void payTithing() {
//        int tithing;
//    InventoryItem tithes = GameControl.getInventoryItemByName("Tithing");
//    Scanner keyboard = new Scanner(System.in);
//System.out.println("How much wheat would you like to pay for your tithing?");
//  tithing = keyboard.nextInt();
//  tithing = tithes.setQuantity(tithing);
//         this.console.println("You have paid " + tithes +" for your tithes and offerings."
//            + "Thank you.");
//    
//    }
//sit and rest in the church and pray
    }
    private void rest() {
        this.console.println("Isaiah 40:29 ' But they that wait upon the Lord"
                + "/n shall renew their strength; they shall mount up with "
                + "/nwings as eagles; they shall run, and not be weary; and "
                + "/nthey shall walk, and not faint.'");

    }

      
}
