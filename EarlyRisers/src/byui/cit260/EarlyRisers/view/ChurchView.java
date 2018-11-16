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
                 "\n|                                             |" +
                 "\n|                                             |" +
                 "\n|                 Welcome to                  |" + 
                 "\n|                 The Church                  |" +
                 "\n|                                             |" +
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
                payTithing();
                break;
            case "2":
                rest();
                break;
            case "3":
                home();
                break;
            default:
                System.out.println("\nInvalid selection.");
        }
        return false;
    }
//scene of the church where you have the option to pay tithing

    public void payTithing() {
    
     Scanner keyboard = new Scanner(System.in);
    int tithing;
    System.out.print("How much wheat would you like to pay for your tithing?");
            tithing = keyboard.nextInt();
    System.out.println("You have paid " + tithing +" for your tithes and offerings."
            + "Thank you.");
    
    }
//sit and rest in the church and pray

    private void rest() {
        System.out.println("Isaiah 40:29 ' But they that wait upon the Lord"
                + "/n shall renew their strength; they shall mount up with "
                + "/nwings as eagles; they shall run, and not be weary; and "
                + "/nthey shall walk, and not faint.'");

    }

    private void home() {
        MainMenuView menu = new MainMenuView();
        menu.display();

    }

    
}
