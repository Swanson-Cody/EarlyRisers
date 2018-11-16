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
public class ReportsMenuView extends View {

    boolean exit;

    public void display() {
    }

    //Get number input from user 
    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|                                           |"
                + "\n|                Reports Menu               |"
                + "\n|                                           |"
                + "\n|                                           |"
                + "\n+-------------------------------------------+"
                + "\n1: View the animals in the storehouse"
                + "\n2: View the tools in the storehouse"
                + "\n3: View the provisions in the storehouse"
                + "\n4: View the authors of this game"
                + "\n5: Exit Reports Menu screen");
        inputs[0] = selection;
        return inputs;

    }

    //Get input from user 
    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }

    private void viewAnimals() {
        System.out.println("You're Viewing Animals!");
    }

    private void viewTools() {
        System.out.println("You're Viewing Tools!");
    }

    private void viewProvisions() {
        System.out.println("You're Viewing Provisions!");
    }

    private void viewAuthors() {
        System.out.println("You're Viewing Authors!");
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
