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

    public static void setMap(int currentMap) {
        System.out.println("Your Map is being created");
    }
    
    public static void theCurrentMap(int currentMap) {
        System.out.println("Your Map is being created");
    }


    private Location [][] locations;
    private Location currentLocation;
    private int rowCount;
    private int colCount;
    private int currentRow = 0;
    private int currentColumn = 0;

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

    public Map(int MAX_ROW, int MAX_COL) {
        MAX_ROW = 5;
        MAX_COL = 5;

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
 public void setLocation(int i, int i0, Location loc) {
        
    }

    public Object getLocation(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Location getCurrentLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}