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
//public class StartProgramView{
public class StartProgramViewNew {
    boolean exit;
    
    public static void main (String[] args)  {
        StartProgramViewNew menu = new StartProgramViewNew();
        menu.runMenu();    
    }
   
    public void runMenu() {
        printHeader();
        getPlayer();
        while (!exit){
            printMenu();
            int choice = getInput();
            doAction(choice);
        }
}
   
    //Welcome Screen
    private void printHeader(){
    System.out.println("+-------------------------------------------+");
    System.out.println("|                                           |");
    System.out.println("|              Welcome to the               |");
    System.out.println("|               City of Aaron               |");
    System.out.println("|                                           |");
    System.out.println("+-------------------------------------------+");
    
    }   //Get name of player from user
    
    public boolean getPlayer(){
    System.out.print("\nPlease enter your name.\n");
    Scanner keyboard = new Scanner(System.in); 
    String playerName = keyboard.nextLine();
        if (playerName == null) {
       System.out.println("Could not create the Player." + "Please try again.");}
        else {
        System.out.println("Welcome " + playerName + " to the City of Aaron.");
        }
     return false;   
    }
    //Menu options 
    private void printMenu(){
    System.out.println("\nPlease make a menu selection: \n");
    System.out.println("1) Start a New Game");
    System.out.println("2) Load a Saved Game");
    System.out.println("3) Load a Help Menu");
    System.out.println("0) Exit Menu");
    }
 
    
    //Get number input from user 
    private int getInput(){
        Scanner keyboard = new Scanner(System.in);
        int choice = -1; 
        do{
            System.out.print("\nEnter a Number: ");
        try {
            choice = Integer.parseInt(keyboard.nextLine());
    }
        catch (NumberFormatException e)  {
        System.out.println("Invalid selection. Please try again.");
    }
        if(choice< 0 || choice > 3) {
            System.out.println("Choice outside of range.  Please choose again.");
        }}
        while(choice < 0 || choice > 3);
        return choice;
}
    private void doAction(int choice){
    switch(choice){
        case 0:
            exit = true;
            System.out.println("Have a good day.  Goodbye!");
            break;
        case 1: 
            newGame();
            
        break;
        case 2:
             savedGame();
        break;
        case 3:
             helpMenu();
            break;
        default:
            System.out.println("\nAn unknown error has occured.");
    }
    }
    private void newGame(){
       
    System.out.println("\nCongratulations! You have been elected as the leader for"
                       + "\nthe City of Aaron. In this game, you will have 10 "
                       + "\nyears to build a prosperous city. "
                       + "\nYour currency is wheat. Each year you will be given "
                       + "\noptions to buy land, sell land, how much wheat to "
                       + "\nset aside to feed the city, how many acres of land "
                       + "\nis to be planted with wheat, and how much wheat will be"
                       + "\npaid in tithes and offerings. You may encounter "
                       + "\nchallenges along the way. However, if you are devout,"
                       + "\nI’m sure you could mitigate these problems.");
    }
    private void savedGame(){
    
    }
    private void helpMenu(){
        newHelpMenuView;
    }
   }


 