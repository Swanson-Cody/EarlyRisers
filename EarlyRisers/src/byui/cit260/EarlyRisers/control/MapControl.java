/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.exceptions.MapControlException;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;
import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.model.Question;
import byui.cit260.EarlyRisers.model.Scene;
import java.util.logging.Level;
import java.util.logging.Logger;
import byui.cit260.EarlyRisers.exceptions.MapControlException;


/**
 *
 * public static Map createMap( Game game, int noOfRows, int noOfColumns)
 */
public class MapControl {

    public static Map createMap() throws MapControlException {
        int MAX_ROW = 5;
        int MAX_COL = 5;

        Map map = new Map(MAX_ROW, MAX_COL);
        
        
        Location[][] locations = new Location[MAX_ROW][MAX_COL];
        map.setLocations(locations);
        
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
        for (int row = 0; row < MAX_ROW; row++) {
            Location loc1 = new Location();
            loc1.setDescription("Wheat Field " + (row + 1));
            loc1.setSymbol("W" + (row + 1));
            map.setLocation(row, 1, loc1);
            
        }
        Location loc = map.getLocations()[0][1];
        InventoryItem item = new InventoryItem("potato", 3);
        loc.setItem(item);
        Question question = new Question();
        question.setQuestionText("Who is the mayor of this town?");
        question.setAnswer1("Moroni!");
        question.setAnswer2("Aaron");
        question.setAnswer3("Ether");
        question.setAnswer4("Esther");
        question.setCorrectAnswer(2);
        question.setPoints(5);
        loc.setQuestion(question);
        
        loc = map.getLocations()[1][1];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Who is the mayor of this town?");
        question.setAnswer1("Moroni!");
        question.setAnswer2("Aaron");
        question.setAnswer3("Ether");
        question.setAnswer4("Esther");
        question.setCorrectAnswer(2);
        question.setPoints(5);
        loc.setQuestion(question);
//Create the Church       
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc2 = new Location();
            loc2.setDescription("Church" + (i + 1));
            loc2.setSymbol("C" + (i + 1));
            map.setLocation(i, 2, loc2);
           
        }

//Create the Tool Shop        
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc3 = new Location();
            loc3.setDescription("Tool Shop" + (i + 1));
            loc3.setSymbol("T" + (i + 1));
            map.setLocation(i, 3, loc3);
        }

//Create the beauty of the Earth        
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc4 = new Location();
            loc4.setDescription("For the Beauty of the Earth" + (i + 1));
            loc4.setSymbol("B" + (i + 1));
            map.setLocation(i, 4, loc4);
          
        }
//Create the inventory shop
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc0 = new Location();
            loc0.setDescription("Inventory" + (i + 1));
            loc0.setSymbol("I" + (i + 1));
            map.setLocation(i, 0, loc0);
        }
        movePlayerToStartingLocation(map);
        return map;
    }

    public static void movePlayerToStartingLocation(Map map) throws MapControlException {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) throws MapControlException {
        
        Player player = new Player();
        if (player == null){
            throw new MapControlException("You must have a player");
        }
            
        
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
        map.getCurrentLocation().setVisited(true);
    }
}