/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

//import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.model.Player;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
//public class StartProgramView{
public class StartProgramViewNew {

    /**
     *
     */
    public StartProgramViewNew() {

    }

    /**
     *
     */
    public void display() {

        this.printHeader();
        this.getPlayer();
        MainMenuView menu = new MainMenuView();
        menu.display();

    }

    //Welcome Screen
    private void printHeader() {
        System.out.println("+-------------------------------------------+");
        System.out.println("|                                           |");
        System.out.println("|              Welcome to the               |");
        System.out.println("|               City of Aaron               |");
        System.out.println("|                                           |");
        System.out.println("+-------------------------------------------+");

    }   //Get name of player from user

    /**
     *
     *
     * @return
     */
    public void getPlayer() {
        boolean done = false;
        do {
            System.out.print("\nPlease enter your name.\n");
            Scanner keyboard = new Scanner(System.in);
            String playerName = keyboard.nextLine();
            if (playerName.isEmpty()) {
                System.out.println("Could not create the Player." + "Please try again.");
            } else {
                System.out.println("Welcome " + playerName + " to the City of Aaron.");
                //todo: save player here
                done = true;
            }

        } while (!done);

    }
}
