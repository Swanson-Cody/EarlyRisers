/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.model;

import byui.cit260.EarlyRisers.main.Game;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Cody
 */
public class DisplayMap implements Serializable {
    
   private int currentRow = 0;
   private int currentColumn = 0;
   private Location currentLocation;
   private Boolean visited;

    public static void setCurrentLocation(Location location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setCurrentRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setCurrentColumn(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DisplayMap(int MAX_ROW, int MAX_COL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void displayMap() {
  String leftIndicator;
  String rightIndicator;
  CreateNewGame game = Game.getCurrentGame(); // retreive the game
  DisplayMap map = game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    System.out.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      System.out.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
    System.out.println();
    for( int row = 0; row < locations.length; row++){
     System.out.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
        // set default indicators as blanks
        leftIndicator = " ";
        rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].isVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       System.out.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             System.out.print(leftIndicator + "??" + rightIndicator);
        }
        else
          System.out.print(leftIndicator
             + locations[row][column].getScene().getMapSymbol()
             + rightIndicator);
      }
     System.out.println("|");
    }
 }

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location getCurrentLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//    private Location [][] locations;
//    private Location currentLocation;
//    private int rowCount;
//    private int colCount;
//    private int currentRow = 0;
//    private int currentColumn = 0;
//
//    public void setCurrentLocation(Location currentLocation) {
//        this.currentLocation = currentLocation;
//    }
//
//    public void setCurrentRow(int currentRow) {
//        this.currentRow = currentRow;
//    }
//
//    public void setCurrentColumn(int currentColumn) {
//        this.currentColumn = currentColumn;
//    }
//
//    public void setVisited(Boolean visited) {
//        this.visited = visited;
//    }
//
//    private Boolean visited;
//
//    public Map(int MAX_ROW, int MAX_COL) {
//        MAX_ROW = 5;
//        MAX_COL = 5;
//
//    }
//
//    /**
//     * Get the value of locations
//     *
//     * @return the value of locations
//     */
//    public Location[][] getLocations() {
//        return locations;
//    }
//
//    /**
//     * Set the value of locations
//     *
//     * @param locations new value of locations
//     */
//    public void setLocations(Location[][] locations) {
//        this.locations = locations;
//    }
//
//      public int getRowCount() {
//        return rowCount;
//    }
//
//    public int getColCount() {
//        return colCount;
//    }
//
//    public void setRowCount(int rowCount) {
//        this.rowCount = rowCount;
//    }
//
//    public void setColCount(int colCount) {
//        this.colCount = colCount;
//    }
// public void setLocation(int i, int i0, Location loc) {
//        
//    }
//
//    public Object getLocation(int i, int j) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 79 * hash + Objects.hashCode(this.locations);
//        hash = 79 * hash + Objects.hashCode(this.currentLocation);
//        hash = 79 * hash + this.rowCount;
//        hash = 79 * hash + this.colCount;
//        hash = 79 * hash + this.currentRow;
//        hash = 79 * hash + this.currentColumn;
//        hash = 79 * hash + Objects.hashCode(this.visited);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Map other = (Map) obj;
//        if (this.rowCount != other.rowCount) {
//            return false;
//        }
//        if (this.colCount != other.colCount) {
//            return false;
//        }
//        if (this.currentRow != other.currentRow) {
//            return false;
//        }
//        if (this.currentColumn != other.currentColumn) {
//            return false;
//        }
//        if (!Objects.equals(this.locations, other.locations)) {
//            return false;
//        }
//        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
//            return false;
//        }
//        if (!Objects.equals(this.visited, other.visited)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Map{" + "locations=" + locations + ", currentLocation=" + currentLocation + ", rowCount=" + rowCount + ", colCount=" + colCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", visited=" + visited + '}';
//    }
//
//    public Location getCurrentLocation() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//}