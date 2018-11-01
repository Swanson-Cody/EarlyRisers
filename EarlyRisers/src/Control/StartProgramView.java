/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static java.time.Clock.system;
import java.util.Scanner; // This will import just the Scanner class.
import java.util.*;
/**
 *
 * @author rache
 */
public class StartProgramView {
    boolean player = false;
/**
 *
 * @author rache
 */
public static void startProgramVeiw(String[] args){
    StartProgramView start = new StartProgramView();
    start.runStartProgramView();
}
    
    
    public void runMainMenu(){
        while(!player){
            System.out.println("Congratulations! Yo have been elected as the leader for the City of Aaron. In this game, you will have 10 years to build a prosperous city. "
               + "Your currency is wheat. Each year you will be given options to buy land, sell land, how much wheat to set aside to feed the city, how many acres of land is to be planted with wheat, "
               + "how much wheat will be paid in tithes and offerings. You may encounter challenges along the way. However, if you are devout, I’m sure you could mitigate these problems.");
        System.out.println("\nAre you ready to play?");

            char choice = getInput();
            performAction(choice);
        }
    }
    
    private char getInput(){
        Scanner kb = new Scanner(System.in);
        char choice = 'z';
        while (choice != 'Y' || choice != 'y' || choice != 'N' || choice != 'n'){
            try{
                System.out.print("Please enter your choice:");
                choice = Character.valueOf(choice);
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection, Please try again.");
            }
    }
        return choice;
}
    private String getPlayerName(){
        Scanner kb = new Scanner(System.in);
        String playerName = "name";
        while (playerName.equals("name")){
            try{
                System.out.println("Please enter your name:");
                playerName = playerName;
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input, please try again.");
            }
        }
        return playerName;
    }
    
    private void performAction(char choice){
        switch(choice){
            case 'Y':
                startNewGame();
                break;
            case 'y':
                startNewGame();
                break;
            case 'N':
                System.out.println("Come back soon");
                break;
            case 'n':
                System.out.println("Come back soon");
                break;
            default:
                System.out.println("An unknown error has occured");
        }
    }
    
    private void startNewGame(){
        String playerName = "name";
        System.out.println("Please enter your name:");
        playerName = getPlayerName();
 
       
    }

    
    
//    public char getInputProgramStart(){
//        char input = 0;
//        boolean test = false;
//        
//        //Scanner userInputScanner = new Scanner(System.in);
//        switch (input) {
//            case 'y':
//                test = true;
//                break;
//            case 'Y':
//                test = true;
//                break;
//            default:
//                test = false;
//                break;
//        }
//         return input;
//     }
//    
//    public StartProgramView(){
//        
//        System.out.println("Congratulations! Yo have been elected as the leader for the City of Aaron. In this game, you will have 10 years to build a prosperous city. "
//                + "Your currency is wheat. Each year you will be given options to buy land, sell land, how much wheat to set aside to feed the city, how many acres of land is to be planted with wheat, "
//                + "how much wheat will be paid in tithes and offerings. You may encounter challenges along the way. However, if you are devout, I’m sure you could mitigate these problems.");
//        //do(System.out.println("\nAre you ready to play?");)
//        //System.out.println("\nAre you ready to play?");
//        char input = getInputProgramStart();
//        
//        do{ 
//            System.out.println("\nAre you ready to play?");
//        while(input == 'y' || input == 'Y'){
//            //prompt to enter the users name
//            System.out.println("\nPlease enter name:");
//            
//             System.out.println("Congratulations! Yo have been elected as the leader for the City of Aaron. In this game, you will have 10 years to build a prosperous city. "
//                + "Your currency is wheat. Each year you will be given options to buy land, sell land, how much wheat to set aside to feed the city, how many acres of land is to be planted with wheat, "
//                + "and how much wheat will be paid in tithes and offerings. You may encounter challenges along the way. However, if you are devout, I’m sure you could mitigate these problems.");
//        
//             //create input file
//             Scanner inFile;
//             inFile = new Scanner(System.in);
//             
//             //get the players name
//            String playerName = inFile.nextLine();
//        }
//    }

    private void runStartProgramView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
