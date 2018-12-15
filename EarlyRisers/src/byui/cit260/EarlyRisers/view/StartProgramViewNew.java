/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

//import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.control.GameControl;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class StartProgramViewNew extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "+-------------------------------------------+" +
                "\n|                                           |" +
                "\n|              Welcome to the               |" +
                "\n|               City of Aaron               |" +
                "\n|                                           |" +
                "\n+-------------------------------------------+" +
                "\n\nPlease enter your name."
        );
        inputs[0] = selection;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String name = inputs[0]; 
        this.console.println("\n\nWelcome " + name + " to the City of Aaron.");
        Player player = new Player();
        player.setName(name);
        EarlyRisers.setPlayer(player);
        MainMenuView menu = new MainMenuView();
        menu.display();
        
        return true;
    }
}
