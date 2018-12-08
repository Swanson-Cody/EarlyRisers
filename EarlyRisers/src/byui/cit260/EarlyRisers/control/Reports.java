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
            throw new ReportsException ("Error printing report: " +ex.getMessage());
        }

    }

    public static String getInventoryReport(String type) {
        Game game = EarlyRisers.getCurrentGame();
        ArrayList<InventoryItem> inventoryItems = game.getInventory();
        String reportString;

        reportString = "\r\n          "+ type +" Inventory Report             ";
        reportString += String.format("\r%n%-20s%-10s%-10s", "Type", "Quantity", "Name");
        reportString += String.format("\r%n%-20s%-10s%-10s", "----", "--------", "----");
        for (InventoryItem item : inventoryItems) {
            if (type.equals("") || (type.equals(item.getItemType())))
            reportString += String.format("\r%n%-20s%-10s%-10s", item.getItemType(),
                    item.getQuantity(),
                    item.getName());
        }

        return reportString;
    }
}
