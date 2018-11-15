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
public class MainMenuView extends View {

    public MainMenuView() {
    }
    
    //Get number input from user 
    @Override
    public String[] getInputs(){
        String[] inputs = new String[10];
        String selection = this.getInput(
        "+-------------------------------------------+" +
        "\n|                                           |" +
        "\n|              Welcome to the               |" +
        "\n|              City of Aaron                |" +
        "\n|                                           |" +
        "\n+-------------------------------------------+\n" +
        "\nN: Start a New Game" +
        "\nS: Load a Saved Game" +
        "\nH: Load a Help Menu" +
        "\nT: Supplies" +
        "\nP: Tool Shop" +
        "\nG: Game Menu" +
        "\nQ: Quit"
        );
        
        inputs[0] = selection;
        return inputs;
}
    
    @Override
    public boolean doAction(String[] input){
        String choice = input[0].toUpperCase();
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
            case "T":
                suppliesMenu();
                break;
            case "P":
                 toolShop ();
            case "H":
                 helpMenu();
                break;
            case "G":
                 gameMenu();
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
        System.out.println("This will display available saved games eligible to load.");
    }
    
    private void helpMenu(){
       HelpMenuView menu = new HelpMenuView();
       menu.display();
    }
    
    private void suppliesMenu(){
       SuppliesView supplies = new SuppliesView();
       supplies.display();
    }
    
    private void toolShop(){ 
        ToolShop tools = new ToolShop();
        tools.display();
    }
    
    private void gameMenu(){
        GameMenuView game = new GameMenuView();
        game.display();
    }
}
