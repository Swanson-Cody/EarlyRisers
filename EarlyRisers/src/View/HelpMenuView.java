/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
      
import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class HelpMenuView {
    boolean exit;
    
    public static void main (String[]args)  {
        HelpMenuView menu = new HelpMenuView();
        menu.runMenu();
        
    }
    public void runMenu() {
        printHeader();
        while (!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);}
}
   
    //Welcome Screen
    private void printHeader(){
    System.out.println("+-------------------------------------------+");
    System.out.println("|                                           |");
    System.out.println("|              Welcome to the               |");
    System.out.println("|                 Help Menu                 |");
    System.out.println("|                                           |");
    System.out.println("+-------------------------------------------+");
    }
    //Menu options
    private void printMenu(){
    System.out.println("\nPlease make a menu selection: ");
    System.out.println("1) Learn more about Wheat");
    System.out.println("2) Learn more about Tithing");
    System.out.println("3) Learn more about Land");
    System.out.println("4) Learn more about Game Play");
    System.out.println("5) Learn more about Scenes");
    System.out.println("0) Exit Menu");
    }
    
    private int getInput(){
        Scanner kb = new Scanner(System.in);
        int choice = -1; 
    while (choice <0 || choice >5){
    try {
        System.out.print("\nEnter your choice: ");
        choice = Integer.parseInt(kb.nextLine());
    }
    catch (NumberFormatException e)  {
    System.out.println("Invalid selection. Please try again.");
    }
    }
    return choice;
}
        private void performAction (int choice){
    switch (choice){
        case 0:
            exit = true;
            System.out.println("Have a good day.  Goodbye!");
            break;
        case 1: 
            System.out.println("You will start the game with an allotment of wheat."
                + "Each turn you will be given the option to use wheat to feed the"
                + "people of the city and use wheat to plant crops for a fall harvest."
                + "You will also be given the opportunity to pay your tithing using your"
                + "wheat. Use this resource wisely.  If you don't feed your people enough"
                + "they will starve.");
            break;
        case 2:
            System.out.println("You will be given the opportunity each turn to pay your tithing."
                + "This is not required of you, however, paying your tithing will return blessings"
                + "upon you.");
            break;
        case 3:
            System.out.println("You will be given land to start the game.  You will also"
                + "be given the opportunity to purchase or sell land each round. The price"
                + "of the purchase or sell will vary on the round."); 
            break;
        case 4:
           System.out.println("This game will be played in 5 rounds with optional scenes that"
                + "may help you along the way.  ");
            break;
        case 5:
             System.out.println("This game has a total of 25 scenes and 5 rounds of play."
                + "Use your resources wisely to complete the game.");
            break;
        default:
            System.out.println("An unknown error has occured.");
    }
    }
   }


 