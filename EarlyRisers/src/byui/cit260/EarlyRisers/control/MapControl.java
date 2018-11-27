/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.main.Game;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;

/**
 *
 * public static Map createMap( Game game, int noOfRows, int noOfColumns)
 */
public class MapControl {

    public static Map createMap(Game game) {
        int MAX_ROW = 5;
        int MAX_COL = 5;

// check for invalid inputs
//if game is null noOfRows < 0 OR numOfColumns < 0
// return null
//endif   
      
        // check for invalid inputs
        if (game == null) {
            System.out.println("Game not created.");
        }
        if (MAX_ROW < 0) {
            System.out.println("Invalid Location.");
        }
        if (MAX_COL < 0) {
            System.out.println("Invalid Location.");
// create the map object and assign values to it
//map = a new Map object       }      
            Map theMap = new Map(MAX_ROW, MAX_COL);
// call setter to assign value to description in map
//call setter to assign value to noOfRows in the map
//call setter to assign value to noOfColumns in map
//call setter to save the map in game object   
// create the map object and assign values to it
//locations = createLocations(noOfRows, noOfColumns)
//if (locations is null) then
// return null
//endif
//public static Location[][] createLocations(int rows, int columns)
//Create the fields


//call setter to save a locations array in the map object

//success = assignIemsToLocations(locations)
//private static int assignItemsToLocations(
//Location[][] locations,
//InventoryItem[] itemsInGame)
//if (success < 0) then
// return null
//endif
        return null;
    }
        return null;
}
}

// Assign all other types objects to locations (e.g., questions, spells)

