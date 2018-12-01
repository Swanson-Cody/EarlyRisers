/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.GameControl;
import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.exceptions.MapControlException;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.view.GameMenuView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Heather
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }

    //Get number input from user 
    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "+-------------------------------------------+"
                + "\n|                                           |"
                + "\n|              Welcome to the               |"
                + "\n|              City of Aaron                |"
                + "\n|                                           |"
                + "\n+-------------------------------------------+\n"
                + "\n1: Start a new game"
                + "\n2: Start a saved game"
                + "\n3: Display the Help Menu"
                + "\n4: Save Game"
                + "\nQ: Quit"
        );

        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        switch (choice) {
            case "Q":
                System.out.println("Have a good day.  Goodbye!");
                return true;
            case "1":
                newGame();
                break;
            case "2":
                startExistingGame();
                break;
            case "3":
                helpMenu();
                break;
            case "4":
                saveGame();
            default:
                System.out.println("\nInvalid selection.");
        }
        return false;
    }

    private void newGame() {

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

        try {
            GameControl.createNewGame(EarlyRisers.getPlayer());
        } catch (GameControlException ex) {
            System.out.println(ex.getMessage());
            //          Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
            //        Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        GameMenuView menu = new GameMenuView();
        menu.display();
    }

    private void startExistingGame() {
        System.out.println("This will display available saved games eligible to load.");
    }

    private void helpMenu() {
        HelpMenuView menu = new HelpMenuView();
        menu.display();
    }

    private void saveGame() {

    }

}
