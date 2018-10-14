/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Cody
 */
public class Map implements Serializable{
 
    private String locations;
    private int currentLocation;

    /**
     * Get the value of locations
     *
     * @return the value of locations
     */
    public String getLocations() {
        return locations;
    }

    /**
     * Set the value of locations
     *
     * @param locations new value of locations
     */
    public void setLocations(String locations) {
        this.locations = locations;
    }
   
    

    /**
     * Get the value of currentLocation
     *
     * @return the value of currentLocation
     */
    public int getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Set the value of currentLocation
     *
     * @param currentLocation new value of currentLocation
     */
    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.locations);
        hash = 53 * hash + this.currentLocation;
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
        if (this.currentLocation != other.currentLocation) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + ", currentLocation=" + currentLocation + '}';
    }

}
