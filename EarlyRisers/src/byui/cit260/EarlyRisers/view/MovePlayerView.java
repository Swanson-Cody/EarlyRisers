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
                + "|                                           |"
                + "|       How to move around the Game         |"
                + "|                                           |"
                + "|                                           |"
                + "+-------------------------------------------+"
                + "\nPlease make a menu selection: "
                + "\n1: Move to the right"
                + "\n2: Move to the left"
                + "\n3: Move backwards"
                + "\n4: Move forwards"
                + "\n5: Inspect something or take a closer look"
                + "\n6: pick up an item"
                + "\n7: Do a happy dance just because you can!"
                + "\n8: Exit out of  the move menu");
        inputs[0] = selection;
        return inputs;
    }
    


    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        Map map = EarlyRisers.getCurrentGame().getMap();
        switch (choice) {

            case "1":
                if(map.getCurrentLocation().getRow() < map.getRowCount() - 1){
                    MapControl.movePlayer(map, map.getCurrentLocation().getRow() + 1, map.getCurrentLocation().getColumn());
                } else {
                    System.out.println("You can't move any further to the right.");
                }
                return true;
            case "2":
                System.out.println("You have moved to the left");
                break;
            case "3":
                System.out.println("You have moved to the backwards");
                break;
            case "4":
                System.out.println("You have moved forwards");
                break;
            case "5":
                System.out.println("Inspect something or take a closer look.");
                break;
            case "6":
                System.out.println("Pick up an item.");
                break;
            case "7":
                System.out.println("Do a happy dance just because you can!");
                break;
            case "8":
                System.out.println("Exit out of the move menu. Have fun with the game!");
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                break;
            default:
                System.out.println("\nInvalid input.");

        }
        return false;
    }
}
