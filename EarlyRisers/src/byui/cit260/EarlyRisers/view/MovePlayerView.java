/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.MapControl;
import byui.cit260.EarlyRisers.exceptions.MapControlException;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;
import java.util.Scanner;

/**
 *
 * @author rache
 */
public class MovePlayerView extends View {

    //Get number input from user 

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|       How to move around the Game         |"
                + "\n+-------------------------------------------+"
                + "\nPlease make a menu selection: "
                + "\n1: Move to the right"
                + "\n2: Move to the left"
                + "\n3: Move up"
                + "\n4: Move down"
                + "\n5: Exit out of the move menu");
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        Game game = EarlyRisers.getCurrentGame();
        Map map = game.getMap();
        int moves = game.getMoves();
        switch (choice) {

            case "1": //Right
                try {
                    if (map.getCurrentLocation().getColumn() < map.getColCount() - 1) {
                        MapControl.movePlayer(map, map.getCurrentLocation().getRow(), map.getCurrentLocation().getColumn() + 1);
                        moves++;
                        game.setMoves(moves);
                        return true;
                    }
                } catch (MapControlException e) {
                    ErrorView.display(this.getClass().getName(), "You can't move any further to the right.");
                }
                break;
            case "2": //Left
                try {
                    if (map.getCurrentLocation().getColumn() > 0) {
                        MapControl.movePlayer(map, map.getCurrentLocation().getRow(), map.getCurrentLocation().getColumn() - 1);
                        moves++;
                        game.setMoves(moves);
                        return true;
                    }
                } catch (MapControlException e) {
                    ErrorView.display(this.getClass().getName(), "You can't move any further to the left.");
                }

                break;
            case "3": //Up
                try {
                    if (map.getCurrentLocation().getRow() > 0) {
                        MapControl.movePlayer(map, map.getCurrentLocation().getRow() - 1, map.getCurrentLocation().getColumn());
                        moves++;
                        game.setMoves(moves);
                        return true;
                    }
                } catch (MapControlException e) {
                    ErrorView.display(this.getClass().getName(), "You can't move any further up.");
                }
                break;
            case "4": //Down
                try {
                    if (map.getCurrentLocation().getRow() < map.getRowCount() - 1) {
                        MapControl.movePlayer(map, map.getCurrentLocation().getRow() + 1, map.getCurrentLocation().getColumn());
                        moves++;
                        game.setMoves(moves);
                        return true;
                    }
                } catch (MapControlException e) {
                    ErrorView.display(this.getClass().getName(), "You can't move any further to the right.");
                }
                break;

            case "5":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");

        }

        while(game.getYear() != 10){
        if (moves % 3 == 0) {
            game.setYear(game.getYear()+1);
            this.console.println("Congratulation you have made it to year " + game.getYear());
        }
        }
        if (game.getYear() == 10){
            this.console.println("You made it to the end of the game. Congratulations!!!");
        }
            return false;

        }

    }
