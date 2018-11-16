/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

//import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.control.GameControl;

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
        String choice = inputs[0];
        
        System.out.println("\n\nWelcome " + inputs[0] + " to the City of Aaron.");
        
        MainMenuView menu = new MainMenuView();
        menu.display();
        
        return true;
    }
}
