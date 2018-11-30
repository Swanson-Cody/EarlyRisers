/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
import byui.cit260.EarlyRisers.control.MapControl;
import byui.cit260.EarlyRisers.main.EarlyRisers;
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
                "+-------------------------------------------+"
                + "|       How to move around the Game         |"
                + "+-------------------------------------------+"
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
        Map map = EarlyRisers.getCurrentGame().getMap();
        switch (choice) {

            case "1": //Right
                if(map.getCurrentLocation().getColumn() < map.getColCount() - 1){
                    MapControl.movePlayer(map, map.getCurrentLocation().getRow(), map.getCurrentLocation().getColumn() + 1);
                    return true;
                } else {
                    System.out.println("You can't move any further to the right.");
                }
                break;
            case "2": //Left
                 if(map.getCurrentLocation().getColumn() > 0){
                    MapControl.movePlayer(map, map.getCurrentLocation().getRow(), map.getCurrentLocation().getColumn()-1);
                    return true;
                } else {
                    System.out.println("You can't move any further to the left.");
                }
                
                break;
            case "3": //Up
                  if(map.getCurrentLocation().getRow() > 0){
                    MapControl.movePlayer(map, map.getCurrentLocation().getRow() -1, map.getCurrentLocation().getColumn());
                    return true;
                } else {
                    System.out.println("You can't move any further up.");
                }
                break;
            case "4": //Down
               if(map.getCurrentLocation().getRow() < map.getRowCount() - 1){
                    MapControl.movePlayer(map, map.getCurrentLocation().getRow() +1 , map.getCurrentLocation().getColumn());
                    return true;
                } else {
                    System.out.println("You can't move any further down.");
                }
                break;
                      
            case "5":
                return true;
            default:
                System.out.println("\nInvalid input.");

        }
        return false;
    }
}
