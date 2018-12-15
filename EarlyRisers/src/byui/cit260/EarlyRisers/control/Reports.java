/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import static byui.cit260.EarlyRisers.control.GameControl.Game;
import byui.cit260.EarlyRisers.exceptions.ReportsException;
import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.view.ErrorView;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;

/**
 *
 * @author Heather
 */
public class Reports {

    public static void printReport(String outputLocation, String reportString) throws ReportsException {
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println(reportString);

        } catch (IOException ex) {
            throw new ReportsException("Error printing report: " + ex.getMessage());
        }

    }

    public static String getInventoryReport(String type) {
        Game game = EarlyRisers.getCurrentGame();
        ArrayList<InventoryItem> inventoryItems = game.getInventory();
        String reportString;

        reportString = "\r\n          " + type + " Inventory Report             ";
        reportString += String.format("\r%n%-20s%-10s%-10s", "Type", "Quantity", "Name");
        reportString += String.format("\r%n%-20s%-10s%-10s", "----", "--------", "----");
        for (InventoryItem item : inventoryItems) {
            if (type.equals("") || (type.equals(item.getItemType()))) {
                reportString += String.format("\r%n%-20s%-10s%-10s", item.getItemType(),
                        item.getQuantity(),
                        item.getName());
            }
        }

        return reportString;
    }
    
    public static String getPointReport(){
        Game game = EarlyRisers.getCurrentGame();
        String reportString = "\r\n         Points Report           \r\n";
        reportString += "Points Earned: " + game.getTotalPoints();
        return reportString;
    }

//    public static String endYearReport(String name) {
//        Game game = EarlyRisers.getCurrentGame();
//        ArrayList<InventoryItem> inventoryItems = game.getInventory();
//        String endYearReport;
//        endYearReport = "\r\n         Year Inventory Report             ";
//        endYearReport += String.format("\r%n%-10s%-10s", "Name", "Quantity");
//        endYearReport += String.format("\r%n%-10s%-10s", "----", "--------");
//        for (InventoryItem item : inventoryItems) {
//            if (name.equals("") || (name.equals(item.getItemType()))) {
//                endYearReport += String.format("\r%n%-10s%-10s",
//                        item.getName(),
//                        item.getQuantity());
//            }
//
//        }return endYearReport;
//    }
//}
public static String endYearReport(String name) {
        Game game = EarlyRisers.getCurrentGame();
        ArrayList<InventoryItem> inventoryItems = game.getInventory();
        String endYearReport;
        endYearReport = "\r\n         Year Inventory Report             ";
        endYearReport += String.format("\r%n%-10s%-10s", "Name", "Quantity");
        endYearReport += String.format("\r%n%-10s%-10s", "Year ", "1");
        endYearReport += String.format("\r%n%-10s%-10s", "Starved ", "0");
        endYearReport += String.format("\r%n%-10s%-10s", "Added people ", "5");
        endYearReport += String.format("\r%n%-10s%-10s", "Population ", "100");
        endYearReport += String.format("\r%n%-10s%-10s", "Acres ", "1000");
        endYearReport += String.format("\r%n%-10s%-10s", "Bushels per acre ", "3");
        endYearReport += String.format("\r%n%-10s%-10s", "Tithes paid ", "300");
        endYearReport += String.format("\r%n%-10s%-10s", "Rats Ate ", "200");
        endYearReport += String.format("\r%n%-10s%-10s", "Total Wheat ", "2800");
 
        for (InventoryItem item : inventoryItems){
if (name.equals("") || (name.equals(item.getItemType()))) {
                endYearReport += String.format("\r%n%-10s%-10s",
                        item.getName(),
                        item.getQuantity());
}
}return endYearReport;
}
}
        
//The year number  "Year"
//
//How many people starved "Dead"
//
//How many people came to the city "CalcGrowth" + "CalcGrowthTithes" 
//
//The current population "Population" + "CalcGrowth" + "CalcGrowthTithes" 
//
//The number of acres of crop land owned by the city "Land"
//
//The number of bushels per acre in this years harvest "CropYield"
//
//The total number of bushels of wheat harvested "Cropyield" + "Wheat"
//
//The number of bushels paid in tithes and offerings "Tithing"
//
//The number of bushels of wheat eaten by rats "Rats"
//
//The number of bushels of wheat in store (2700)