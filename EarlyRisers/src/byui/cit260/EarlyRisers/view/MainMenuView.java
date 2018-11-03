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
public class MainMenuView {

    public MainMenuView() {
    }
    
     //Menu options 
    public void display(){
        boolean done = false;
        do {
    System.out.println("=========================== ");
    System.out.println("         Main Menu         ");
    System.out.println("=========================== ");
    System.out.println("N: Start a New Game");
    System.out.println("S: Load a Saved Game");
    System.out.println("H: Load a Help Menu");
    System.out.println("Q: Quit");
    String input = getInput();
    done = doAction(input);
        } while(!done);
    }
 
    
    //Get number input from user 
    private String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
}
    private boolean doAction(String choice){
       choice = choice.toUpperCase();
    switch(choice){
        case "Q":
            System.out.println("Have a good day.  Goodbye!");
            return true;
        case "N": 
            newGame();
            
        break;
        case "S":
             savedGame();
        break;
        case "H":
             helpMenu();
            break;
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
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
 //      runMenu();
    }
}
