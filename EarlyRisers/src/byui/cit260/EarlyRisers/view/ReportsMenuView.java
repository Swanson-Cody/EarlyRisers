/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import static byui.cit260.EarlyRisers.control.GameControl.Game;
import byui.cit260.EarlyRisers.control.Reports;
import byui.cit260.EarlyRisers.exceptions.ReportsException;
import java.util.Scanner;
import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Family
 */
public class ReportsMenuView extends View {

    boolean exit;

    //Get number input from user 
    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|                Reports Menu               |"
                + "\n+-------------------------------------------+"
                + "\n1: View the animals in the storehouse"
                + "\n2: View the tools in the storehouse"
                + "\n3: View the wheat in the storehouse"
                + "\n4: View the acres of land owned"        
                + "\n5: View the authors of this game"
                + "\n6: View entire inventory report"
                + "\n7: Exit Reports Menu screen");
        inputs[0] = selection;
        return inputs;

    }

    private void viewAnimals() {

        String reportInventory = Reports.getInventoryReport("Animal");
        this.console.println(reportInventory);
        String response = getInput("Do you want to save this to a file? Y or N");
        if (response.equalsIgnoreCase("Y")) {
            response = getInput("Enter a file name.");
            if (response.isEmpty()){
            ErrorView.display(this.getClass().getName(), "You must enter a file name.");
            }
            try {
                Reports.printReport(response, reportInventory);
            } catch (ReportsException ex) {
                Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
            }
        }
    }
//  for (InventoryItem item : inventoryItems) {
//            if (type.equals("") || (type.equals(item.getItemType())))
    private void viewTools() {

        String reportInventory = Reports.getInventoryReport("Tools");
        this.console.println(reportInventory);
        String response = getInput("Do you want to save this to a file? Y or N");
        if (response.equalsIgnoreCase("Y")) {
            response = getInput("Enter a file name.");
            try {
                Reports.printReport(response, reportInventory);
            } catch (ReportsException ex) {
                Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
            }
        }
    }

    private void viewProvisions() {
        String reportInventory = Reports.getInventoryReport("Wheat");
        this.console.println(reportInventory);
        String response = getInput("Do you want to save this to a file? Y or N");
        if (response.equalsIgnoreCase("Y")) {
            response = getInput("Enter a file name.");
            try {
                Reports.printReport(response, reportInventory);
            } catch (ReportsException ex) {
                Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
            }
        }
    }
    
    private void viewLand() {
        String reportInventory = Reports.getInventoryReport("Land");
        this.console.println(reportInventory);
        String response = getInput("Do you want to save this to a file? Y or N");
        if (response.equalsIgnoreCase("Y")) {
            response = getInput("Enter a file name.");
            try {
                Reports.printReport(response, reportInventory);
            } catch (ReportsException ex) {
                Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void viewAuthors() {
                   
          String reportInventory = Reports.endYearReport("");
        this.console.println(reportInventory);
        String response = getInput("Do you want to save this to a file? Y or N");
        if (response.equalsIgnoreCase("Y")) {
            response = getInput("Enter a file name.");
            try {
                Reports.printReport(response, reportInventory);
            } catch (ReportsException ex) {
                Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void viewReports() {

        String reportInventory = Reports.getInventoryReport("");
        this.console.println(reportInventory);
        String response = getInput("Do you want to save this to a file? Y or N");
        if (response.equalsIgnoreCase("Y")) {
            response = getInput("Enter a file name.");
            try {
                Reports.printReport(response, reportInventory);
            } catch (ReportsException ex) {
                Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
            }
        }

    }

    private void goToGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        choice = choice.toUpperCase();

        if ("7".equals(choice)) {
            this.console.println("You have exited the Reports Menu. "
                    + "Have fun with the game!");
            goToGameMenu();
            return true;
        } else if ("1".equals(choice)) {
            viewAnimals();
        } else if ("2".equals(choice)) {
            viewTools();
        } else if ("3".equals(choice)) {
            viewProvisions();
        } else if ("4".equals(choice)) {
            viewLand();
        } else if ("5".equals(choice)) {
            viewAuthors();
        } else if ("6".equals(choice)) {
            viewReports();
        } else {
            ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }

        return false;
    }

}
