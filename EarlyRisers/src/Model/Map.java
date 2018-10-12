/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Heather
 */
public class Map {
 
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

}
