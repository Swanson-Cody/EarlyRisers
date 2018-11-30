/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.GameControl;
import static byui.cit260.EarlyRisers.control.GameControl.Game;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import byui.cit260.EarlyRisers.model.InventoryItem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rache
 */
public class SuppliesView extends View {

    boolean exit;
//    public void displaySupplies() {
//
//        this.printSuppliesHeader();
//        MainMenuView menu = new MainMenuView();
//        menu.display();
//
//    }
//    

    //Get number input from user 
    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|                 Supplies                  |"
                + "\n+-------------------------------------------+"
                + "\n1: What is the current population"
                + "\n2: Tools available"
                + "\n3: Exit supplies screen");
        inputs[0] = selection;
        return inputs;
    }
    //Get input from user 

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }

    private void calculatePopulation() {
        int population = new InventoryItem().getPopulation();
        System.out.println("The current population is " + population);
    }

    private void displayToolsInventoryView() {
         Game game = EarlyRisers.getCurrentGame();
         game.getInventory();
         ArrayList<InventoryItem> tools = game.getInventory();
        System.out.println("Items available in the tool array " + tools); 
  
       
        
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        choice = choice.toUpperCase();
        switch (choice) {
            case "3":
                System.out.println("You have exited the supplies screen."
                        + "Have fun with the game!");
                return true;
            case "1":
                calculatePopulation();
                break;
            case "2":
                displayToolsInventoryView();
                break;
            default:
                System.out.println("\nInvalid selection.");
        }
        return false;
    }

}
