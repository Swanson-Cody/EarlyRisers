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
                + "\n2: Load a saved game"
                + "\n3: Save current game"
                + "\n4: Display the Help Menu"
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
                this.console.println("Have a good day.  Goodbye!");
                System.exit(0);
            case "1":
                newGame();
                break;
            case "2":
                startExistingGame();
                break;
            case "3":
                saveGameView();
                break;    
            case "4":
                helpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }
        return false;
    }

    private void newGame() {

        this.console.println("\nCongratulations! You have been elected as the leader for"
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
        } catch (GameControlException | MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            //          Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //        Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);

        GameMenuView menu = new GameMenuView();
        menu.display();
    }

    private void startExistingGame() {
        StartSavedGameView loadGame = new StartSavedGameView();
        loadGame.display();
        
    }
 private void saveGameView() {
        SaveGameView save = new SaveGameView();
        save.display();
    }
    private void helpMenu() {
        HelpMenuView menu = new HelpMenuView();
        menu.display();
    }
}
