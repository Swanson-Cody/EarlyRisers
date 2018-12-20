/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.GameControl;
import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cody
 */
public class StartSavedGameView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|       Please enter the file name        |"
                + "\n|           of your saved game.           |"
                + "\n+-------------------------------------------+");
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String fileName = inputs[0];
        Game game;
        try {
            game = GameControl.getGame(fileName + ".dat");
        } catch (GameControlException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(StartSavedGameView.class.getName()).log(Level.SEVERE, null, ex);
        }return true;
    }
   
    
}
