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
public class StartProgramView {
    public StartProgramView(){  
        displayStartProgramView();
    }
    private static boolean displayStartProgramView(){
        System.out.println("Congratulations! Yo have been elected as the leader for the City of Aaron. In this game, you will have 10 years to build a prosperous city. "
                + "Your currency is wheat. Each year you will be given options to buy land, sell land, how much wheat to set aside to feed the city, how many acres of land is to be planted with wheat, "
                + "how much wheat will be paid in tithes and offerings. You may encounter challenges along the way. However, if you are devout, I’m sure you could mitigate these problems.");
        do(System.out.println("\nAre you ready to play?");) {
        
        } while () {
            
        
        //prompt to enter the users name
        System.out.println("\nPlease enter name:");
        
        //create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        //read the value of the next line typed in the console
        String playerName = inFile.nextLine();
        
        
        
        
        
        
        endOfView = false;
        doAction(){
                input = getInput();
                IF no inputs were entered OR the first input is Q
                    RETURN
        ENDIF
        endOfView = doAction (inputs)
        WHILE endOfView != true
        } while ();
    }
   
        
    }
}
