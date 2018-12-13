/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Heather
 */
public class Game implements Serializable {
      private Player player;
      private Map map;
//      private InventoryItem inventoryItem;
      private int acresOwned;
      private int wheatStorage;
      private int tithing;
      private double totalTime;
      private ArrayList<InventoryItem> inventory;
      private int moves = 0;
      private int year = 1;

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
      

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<InventoryItem> inventory) {
        this.inventory = inventory;
    }
    
    
    public void addToInventory(ArrayList<InventoryItem> inventory){
        for(int i = 0; i < inventory.size(); i++){
            this.inventory.add(inventory.get(i));
        }
    }
      
//      public static void testTeamClasses(){
//       Game game = new Game();
//       game.setAcresOwned(100);
//       game.setWheatStorage(3000);
//       game.setAcresOwned(5);
//       game.setWheatStorage(100);
//       game.setTithing(0);
//       System.out.println(game.toString());
//      }

    public int getTithing() {
        return tithing;
    }

    public void setTithing(int tithing) {
        this.tithing = tithing;
    }
      
    /**
     * Get the value of player
     *
     * @return the value of player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Set the value of player
     *
     * @param player new value of player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }


    /**
     * Get the value of theMap
     *
     * @return the value of theMap
     */
    public Map getMap() {
        return map;
    }

    /**
     * Set the value of theMap
     *
     * @param map new value of theMap
     */
    public void setMap(Map map) {
        this.map = map;
    }

   

    /**
     * Get the value of inventoryItem
     *
     * @return the value of inventoryItem
     */
//    public InventoryItem getInventoryItem() {
//        return inventoryItem;
//    }

    /**
     * Set the value of inventoryItem
     *
     * @param inventoryItem new value of inventoryItem
     */
//    public void setInventoryItem(InventoryItem inventoryItem) {
//        this.inventoryItem = inventoryItem;
//    }

    

    /**
     * Get the value of acresOwned
     *
     * @return the value of acresOwned
     */
    public int getAcresOwned() {
        return acresOwned;
    }

    /**
     * Set the value of acresOwned
     *
     * @param acresOwned new value of acresOwned
     */
    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    

    /**
     * Get the value of wheatStorage
     *
     * @return the value of wheatStorage
     */
    public int getWheatStorage() {
        return wheatStorage;
    }

    /**
     * Set the value of wheatStorage
     *
     * @param wheatStorage new value of wheatStorage
     */
    public void setWheatStorage(int wheatStorage) {
        this.wheatStorage = wheatStorage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.player);
        hash = 83 * hash + Objects.hashCode(this.map);
//        hash = 83 * hash + Objects.hashCode(this.inventoryItem);
        hash = 83 * hash + this.acresOwned;
        hash = 83 * hash + this.wheatStorage;
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
        final Game other = (Game) obj;
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatStorage != other.wheatStorage) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
       
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + player + ", map=" + map + ", acresOwned=" + acresOwned + ", wheatStorage=" + wheatStorage +  '}';
    }
  
}
