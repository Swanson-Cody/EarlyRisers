/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import java.util.Scanner;
import byui.cit260.EarlyRisers.model.InventoryItem;
/**
 *
 * @author Family
 */
public class ReportsMenuView extends View {

    boolean exit;

   

    //Get number input from user 
    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|                Reports Menu               |"
                + "\n+-------------------------------------------+"
                + "\n1: View the animals in the storehouse"
                + "\n2: View the tools in the storehouse"
                + "\n3: View the provisions in the storehouse"
                + "\n4: View the authors of this game"
                + "\n5: Exit Reports Menu screen");
        inputs[0] = selection;
        return inputs;

    }

    private void viewAnimals() {
        String animals = new InventoryItem().getAnimals();
        System.out.println(animals + " You're Viewing Animals!");
    }

    private void viewTools() {
        String tools = new InventoryItem().getName();
        System.out.println(tools + " You're Viewing Tools!");
    }

    private void viewProvisions() {
        String provisions = new InventoryItem().getProvisions();
        System.out.println(provisions + " You're Viewing Provisions!");
    }

    private void viewAuthors() {
        System.out.println("Cody, Rachel and Heather! hfYou're Viewing Authors!");
    }

    private void goToGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    @Override
    public boolean doAction(String[] input){
        String choice = input[0].toUpperCase();
        choice = choice.toUpperCase();

        if ("5".equals(choice)) {
            System.out.println("You have exited the Reports Menu. "
                    + "Have fun with the game!");
            goToGameMenu();
            return true;
        } else if ("1".equals(choice)) {
            viewAnimals();
        } else if ("2".equals(choice)) {
            viewTools();
        } else if ("3".equals(choice)) {
            viewProvisions();
        } else if ("4".equals(choice)) {
            viewAuthors();
        } else {
            System.out.println("\nInvalid selection.");
        }

        return false;
    }

}
