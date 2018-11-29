/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.main.Game;
import byui.cit260.EarlyRisers.model.CreateNewGame;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;
import java.util.Scanner;
import java.util.*;
import java.lang.String;

/**
 *
 * public static Map createMap( Game game, int noOfRows, int noOfColumns)
 */
public class MapControl {

    public static Map createMap(Game game) {
        int MAX_ROW = 5;
        int MAX_COL = 5;
        if (game == null) {
            System.out.println("Game not created.");
        }
        if (MAX_ROW < 0) {
            System.out.println("Invalid Location.");
        }
        if (MAX_COL < 0) {
            System.out.println("Invalid Location.");
            return null;
          }
//    }
//
//    public static void showMap(String[][] map) {
//
//        for (int r = 0; r < map.length; r++) {
//            for (int c = 0; c < map[0].length; c++) {
//
//            }
//        }
//    Location[][] locations = Map.getLocations();
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc1 = new Location();
            loc1.setDescription("Wheat Fields");
            loc1.setSymbol("WH");
            Map.setLocation(i, 3, loc1);
        }
        
//Create the Church       
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc2 = new Location();
            loc2.setDescription("Church");
            loc2.setSymbol("CH");
            Map.setLocation(i, 2, loc2);
        }
        
//Create the Tool Shop        
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc3 = new Location();
            loc3.setDescription("Tool Shop");
            loc3.setSymbol("TS");
            Map.setLocation(i, 1, loc3);
        }
        
//Create the beauty of the Earth        
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc4 = new Location();
            loc4.setDescription("For the Beauty of the Earth");
            loc4.setSymbol("BE");
            Map.setLocation(i, 4, loc4);
        }
//Create the inventory shop
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc5 = new Location();
            loc5.setDescription("Inventory");
            loc5.setSymbol("IN");
            Map.setLocation(i, 5, loc5);
        }
            
        return new Map();
    }
}
//

//// call setter to assign value to description in map
////call setter to assign value to noOfRows in the map
////call setter to assign value to noOfColumns in map
////call setter to save the map in game object   
//// create the map object and assign values to it
////locations = createLocations(noOfRows, noOfColumns)
////if (locations is null) then
//// return null
////endif
////public static Location[][] createLocations(int rows, int columns)
////Create the fields
//
////call setter to save a locations array in the map object
//
////success = assignIemsToLocations(locations)
////private static int assignItemsToLocations(
////Location[][] locations,
////InventoryItem[] itemsInGame)
////if (success < 0) then
//// return null
////endif
//        return null;
//    }
//        return null;
//}
//}
// Assign all other types objects to locations (e.g., questions, spells)
//public static void CreateMap (String [][] map, int rows, int colums)
//String[][] map = new String [5][5]
//createMap (map);
//linkLocations (map);
//public static void createBoard (String [][] board) {
//for (int r=0; r< map.length; r++)
//{
//for (int c=0; c < map0.length; c++)
//{
//board [r][c] = "*";

