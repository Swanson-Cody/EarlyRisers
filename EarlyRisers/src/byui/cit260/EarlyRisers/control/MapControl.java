/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;

import byui.cit260.EarlyRisers.model.Map;

/**
 *
 *
 */
public class MapControl {
    //public static Map createMap( Game game,
    // int noOfRows,
    // int noOfColumns) 

    public static void createMap() {
        int MAX_ROW = 5;
        int MAX_COL = 5;
//map = a new Map object 
        Map theMap = new Map(MAX_ROW, MAX_COL);

        //public static Map createMap( Game game,
// {
// check for invalid inputs
//if game is null noOfRows < 0 OR numOfColumns < 0
// return null
//        GameControl game = new GameControl();
//        if (MAX_ROW <= 0) {
//            return null;
//        } else if (MAX_COL <= 0) {
//            return null;
//        } else if (game == null) {
//            return null;
//        } else {
//            return null;
//        }

//endif
//
//// create the map object and assign values to it
//locations = createLocations(noOfRows, noOfColumns)
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc = new Location();
            loc.setDescription("Wheat Fields");
            loc.setSymbol("WH");
            theMap.setLocation(i, 3, loc);
        }
        
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc = new Location();
            loc.setDescription("Church");
            loc.setSymbol("CH");
            theMap.setLocation(i, 2, loc);
        }
        
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc = new Location();
            loc.setDescription("Tool Shop");
            loc.setSymbol("TS");
            theMap.setLocation(i, 1, loc);
        }
        
        for (int i = 0; i < MAX_ROW; i++) {
            Location loc = new Location();
            loc.setDescription("For the Beauty of the Earth");
            loc.setSymbol("BE");
            theMap.setLocation(i, 4, loc);
            
        }


    public void displayMap(){
        Map theMap = theGame.getMap();
        
        for(int i = 0; i < 4; i++){
        for(int j = 0; j < 8; j++){
            System.out.print(theMap.getLocation(i, j).getSymbol() + " ");
        }
        System.out.println();
    }

//    public static void createLocations(int rows, int columns) {
//    }
//call setter to assign value to description in map

     
   // this.currentLocation  = currentLocation;
//call setter to assign value to noOfRows in the map

     
   // this.rowCount  = rowCount;
//call setter to assign value to noOfColumns in map

     
  //  this.colCount  = colCount;
//call setter to save the map in game object
//// create a two-dimensional array of locations and assign array to the map

//if (locations is null) then
// return null
//endif
//call setter to save a locations array in the map object
//// assign actors and items to locations
//success = assignActorsToLocations(locations)
//if (success < 0) then
// return null
//endif
//success = assignIemsToLocations(locations)
   // private static int assignItemsToLocations(Location[][] locations,
   //         InventoryItem[] itemsInGame);
//if (success < 0) then
// return null
//endif
//// Assign all other types objects to locations (e.g., questions, spells)
//…
//return map
//}

//Year Report - symbol ###
    loc.setDescription (home);

    loc.setSymbol (
            
    "###");
    for(int i = 0;
    i< MAX_ROW ;
    i

    
        ++) {
                theMap.setLocation(i, 0, loc);
    }

//Tool Shop - symbol $$$
    loc.setDescription (home);

    loc.setSymbol (
            
    "$$$");
    for(int i = 0;
    i< MAX_ROW ;
    i

    
        ++) {
                theMap.setLocation(i, 1, loc);
    }

//Church - symbol !!!
    loc.setDescription (home);

    loc.setSymbol (
            
    "!!!");
    for(int i = 0;
    i< MAX_ROW ;
    i

    
        ++) {
                theMap.setLocation(i, 2, loc);
    }

// Fields - symbol ///
    loc.setDescription (home);

    loc.setSymbol (
            
    "///");
    for(int i = 0;
    i< MAX_ROW ;
    i

    
        ++) {
                theMap.setLocation(i, 3, loc);
    }

// Storehouse - ...
    loc.setDescription (home);

    loc.setSymbol (
            
    "...");
    for(int i = 0;
    i< MAX_ROW ;
    i

    
        ++) {
                theMap.setLocation(i, 4, loc);
    }

    int returnValue = GameControl.saveGame(currentGame);

    if (assignItemsToLocations

    
    

== null) {
        }
    }


}
}

