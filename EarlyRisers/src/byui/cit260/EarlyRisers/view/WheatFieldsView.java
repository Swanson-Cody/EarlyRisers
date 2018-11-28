/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.WheatEaten;
import java.util.Scanner;

/**
 *
 * @author rache
 */
public class WheatFieldsView extends View{
    
        //Menu options 
    //Get number input from user 

    public WheatFieldsView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                   "+---------------------------------------------+" +
                 "\n|                                             |" +
                 "\n|                                             |" +
                 "\n|                 Welcome to                  |" + 
                 "\n|              The Wheat Fields               |" +
                 "\n|                                             |" +
                 "\n|                                             |" +
                 "\n+---------------------------------------------+" +
                 "\n\nPlease make a game selection: "
                + "\n1) Plant more wheat"
                + "\n2) Scare off rats"
                + "\n3) Exit the fields");
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();

        switch (choice) {
            case "1":
                plantWheat();
                break;
            case "2":
                rats();
                break;
            case "3":
                exit();
                break;
            default:
                System.out.println("\nInvalid selection.");
        }
        return false;
    }
//scene of the church where you have the option to pay tithing

    public void plantWheat() {
    
     Scanner keyboard = new Scanner(System.in);
    int wheat;
    System.out.print("How much wheat would you like to plant?");
            wheat = keyboard.nextInt();
    System.out.println("You planted " + wheat + " more bussles of wheat.");
    
    }
//sit and rest in the church and pray

    private void rats() {
        WheatEaten wheatEaten = new WheatEaten();
        System.out.println("Those rats are such pesky things, but you manged"
                + " to scare of a few");
        System.out.println("They did eat" + wheatEaten + " bussels of wheat though.");
    }

    private void exit() {
        MainMenuView menu = new MainMenuView();
        menu.display();

    }

    
}


