/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Cody
 */
public class Map implements Serializable {

    /**
     *
     * @param currentMap
     * @return 
     */
    
//        public static Scene getScene() {
//        Scene scene = new Scene();
//        return scene;   
//    }
//        
//    private Scene map;
//    
    
    public void setMap(int currentMap) {
        System.out.println("Your Map is being created");
    }

    private Location [][] locations;
    private Location currentLocation;
    private int rowCount;
    private int colCount;
    private int currentRow = 0;
    private int currentColumn = 0;

    public Map() {
    
    }
    
    public Location getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    private Boolean visited;

    public Map(int maxRow, int maxCol) {
        this.rowCount = maxRow;
        this.colCount = maxCol;

    }

    /**
     * Get the value of locations
     *
     * @return the value of locations
     */
    public Location[][] getLocations() {
        return locations;
    }

    /**
     * Set the value of locations
     *
     * @param locations new value of locations
     */
    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

      public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }
    
    public void setLocation(int row, int column, Location loc) {
        locations[row][column] = loc;
        loc.setRow(row);
        loc.setColumn(column);
    }

    public Object getLocation(int i, int j) {
        return locations[i][j];
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.locations);
        hash = 79 * hash + Objects.hashCode(this.currentLocation);
        hash = 79 * hash + this.rowCount;
        hash = 79 * hash + this.colCount;
        hash = 79 * hash + this.currentRow;
        hash = 79 * hash + this.currentColumn;
        hash = 79 * hash + Objects.hashCode(this.visited);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + ", currentLocation=" + currentLocation + ", rowCount=" + rowCount + ", colCount=" + colCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", visited=" + visited + '}';
    }


//    public static class createMap extends Map {
//
//        public createMap() {
//            System.out.println("Your Map is being created");
//        }
//    }
}
 
