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

    public void display() {}
        //Get number input from user 
        @Override
        public String[] getInputs
        
            (){
        String[] inputs = new String[10];
            String selection = this.getInput(
                    "+-------------------------------------------+"
                    + "|                                           |"
                    + "|                 Supplies                  |"
                    + "|                                           |"
                    + "|                                           |"
                    + "+-------------------------------------------+"
                    + "1: How much Money You have"
                    + "2: What is the current population"
                    + "3: How much wheat do you have"
                    + "4: Exit supplies screen");
            inputs[0] = selection;
            return inputs;
        }
        //Get input from user 
    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }

    private void calculateMoney() {
        System.out.println("You currently have this much money.");
    }

    private void calculatePopulation() {
        System.out.println("The current population is: ");
    }

    private void calculateWheat() {
        System.out.println("You currently have this much wheat in storage.");

    }

    private void goToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        choice = choice.toUpperCase();
        switch (choice) {
            case "4":
                System.out.println("You have exited the supplies screen."
                        + "Have fun with the game!");
                goToMainMenu();
                return true;
            case "1":
                calculateMoney();
                break;
            case "2":
                calculatePopulation();
                break;
            case "3":
                calculateWheat();
                break;
            default:
                System.out.println("\nInvalid selection.");
        }
        return false;
    }

}
