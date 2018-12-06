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
public class HelpMenuView extends View {

    public HelpMenuView() {
    }
//Get number input from user 

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|                                           |"
                + "\n|              Welcome to the               |"
                + "\n|                 Help Menu                 |"
                + "\n|                                           |"
                + "\n+-------------------------------------------+"
                + "\n\nPlease make a menu selection: "
                + "\n1) Learn more about Wheat"
                + "\n2) Learn more about Tithing"
                + "\n3) Learn more about Land"
                + "\n4) Learn more about Game Play"
                + "\n5) Learn more about Scenes"
                + "\n6) Return to main menu");

        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        //Scanner keyboard = new Scanner(System.in);
        
//        int choice = -1;
//        do {
//            System.out.print("\nEnter a Number: ");
//            try {
//                choice = Integer.parseInt(keyboard.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid selection. Please try again.");
//            }
//            if (choice < 0 || choice > 5) {
//                System.out.println("Choice outside of range.  Please choose again.");
//            }
//        } while (choice < 0 || choice > 5);
//        return choice;
//    }

        switch (choice) {
            case "1":
                System.out.println("\nWheat Information \nYou will start the game with an allotment of wheat."
                        + "\nEach turn you will be given the option to use wheat to feed "
                        + "\nthe people of the city and use wheat to plant crops for a fall"
                        + "\nharvest. You will also be given the opportunity to pay your"
                        + "\ntithing using your wheat. Use this resource wisely.  If you"
                        + "\ndon't feed your people enough they will starve.");
                break;
            case "2":
                System.out.println("\nTithing Information \nYou will be given the opportunity each turn to "
                        + "\npay your tithing. This is not required of you, however, "
                        + "\npaying your tithing will return blessings upon you.");
                break;
            case "3":
                System.out.println("\nLand Information\nYou will be given land to start the game.  "
                        + "\nYou will also be given the opportunity to purchase or sell "
                        + "\nland each round. The price of the purchase or sell will vary "
                        + "\non the round.");
                break;
            case "4":
                System.out.println("\nGame Play\nThis game will be played in 5 rounds with "
                        + "\noptional scenes that may help you along the way.  ");

                break;
            case "5":
                System.out.println("\nScene Information\nThis game has a total of 25 scenes and 5 rounds"
                        + " \nof play. Use your resources wisely to complete the game.");
            case "6":

                System.out.println("You have exited the supplies screen."
                        + "Have fun with the game!");
               return true;

              
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }
        return false;
    }

   
}
