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
public class MovePlayerView {
    boolean exit;
    
    public void display(){
        printMovePlayerHeader();
        while (!exit){
            printMovePlayerMenu();
            String choice = getInput();
            doActions(choice);
        }
    }
    
    private void printMovePlayerHeader(){
            System.out.println("+-------------------------------------------+");
	    System.out.println("|                                           |");
	    System.out.println("|       How to move around the Game         |");
	    System.out.println("|                                           |");
	    System.out.println("|                                           |");
	    System.out.println("+-------------------------------------------+");
	    }
    
    private void printMovePlayerMenu(){
            System.out.println("\nPlease make a menu selection: ");
	    System.out.println("R: Move to the right");
	    System.out.println("L: Move to the left");
	    System.out.println("B: Move backwards");
	    System.out.println("F: Move forwards");
	    System.out.println("I: Inspect something or take a closer look");
            System.out.println("P: pick up an item");
	    System.out.println("D: Do a happy dance just because you can!");
            System.out.println("E: Exit out of  the move menu");
    }
    
    //Get the input from the user
    private String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private void doActions(String choice){
        switch(choice){
	        case "E":
                    System.out.println("Have fun playing the game");
                    exit = true;
                case "R":
                    System.out.println("You have moved to the right");
                    break;
                case "L":
                    System.out.println("You have moved to the right");
                    break;
                case "B":
                    System.out.println("You have moved backwards");
                    break;
                case "F":
                    System.out.println("You are moving forwards");
                    break;
                case "D":
                    System.out.println("That was a awesome dance!");
                    break;
                default:
                    System.out.println("\nInvalid input.");
  
    }
    }
    }

