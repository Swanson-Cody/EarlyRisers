/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.GameControl;
import java.util.Scanner;
import byui.cit260.EarlyRisers.view.SuppliesView;
import byui.cit260.EarlyRisers.model.Scene;

/**
 *
 * @author Heather
 */
public class SceneMenuView extends View {

    public SceneMenuView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "+-------------------------------------------+"
                + "|                                           |"
                + "|                Welcome to                 |"
                + "|              Scene Selection              |"
                + "|                                           |"
                + "+-------------------------------------------+"
                + "\nPlease make a scene selection: "
                + "1) Go to the Church"
                + "2) Go to the Warehouse"
                + "3) Go to the Fields"
                + "4) Buy tools from the shop"
                + "5) Go home"
        );
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        switch (choice) {

            case "1":
                church();
                break;
            case "2":
                warehouse();
                break;
            case "3":
                fields();
                break;
            case "4":
                tools();
                break;
            case "5":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }
        return false;
    }
//scene of the church where you have the option to pay tithing

    private void church() {
            this.console.println("\nYou have chosen to visit the Church.  It is beautiful."
                + "\nYour church leader explained they would appreciate your paying"
                + "\nyour tithes. Would you like to pay your tithing today?"
                + "\nPlease enter 'y' for yes and 'n' for no.");
    }

//scene of the warehouse where you can buy and sell wheat and extra supplies
//are stored
    private void warehouse() {
        SuppliesView menu = new SuppliesView();
        menu.display();

    }
//scene of the field where you harvest and plant next years crops

    private void fields() {
        this.console.println("\nYou have a lot of beautiful land. You have chosen"
                + "\nto visit your fields.  They are already to harvest/plant.  What"
                + "\nwould you like to do today?");
    }
//scene of a tool shop to help you be able to plant and harvest crops    

    private void tools() {
        this.console.println("\nThis will take us to the tool Shop. The blacksmith is "
                + "\nready to assist you. What would you like to do today?  Buy tools,"
                + "\nsell tools, or exit. ");
    }

}
