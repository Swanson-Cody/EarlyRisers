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
 * @author Heather
 */
public class CreateNewGame implements Serializable {
      public Player thePlayer;
      public Map theMap;
      public InventoryItem inventoryItem;
      public int acresOwned;
      public int wheatStorage;
      public int tithing;
      
      public static void testTeamClasses(){
       CreateNewGame game = new CreateNewGame();
       game.setAcresOwned(100);
       game.setWheatStorage(3000);
       game.setAcresOwned(5);
       game.setWheatStorage(100);
       game.setTithing(0);
       System.out.println(game.toString());
      }

    public int getTithing() {
        return tithing;
    }

    public void setTithing(int tithing) {
        this.tithing = tithing;
    }
      
    /**
     * Get the value of thePlayer
     *
     * @return the value of thePlayer
     */
    public Player getThePlayer() {
        return thePlayer;
    }

    /**
     * Set the value of thePlayer
     *
     * @param thePlayer new value of thePlayer
     */
    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }


    /**
     * Get the value of theMap
     *
     * @return the value of theMap
     */
    public Map getTheMap() {
        return theMap;
    }

    /**
     * Set the value of theMap
     *
     * @param theMap new value of theMap
     */
    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

   

    /**
     * Get the value of inventoryItem
     *
     * @return the value of inventoryItem
     */
    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    /**
     * Set the value of inventoryItem
     *
     * @param inventoryItem new value of inventoryItem
     */
    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    

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
        hash = 83 * hash + Objects.hashCode(this.thePlayer);
        hash = 83 * hash + Objects.hashCode(this.theMap);
        hash = 83 * hash + Objects.hashCode(this.inventoryItem);
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
        final CreateNewGame other = (CreateNewGame) obj;
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatStorage != other.wheatStorage) {
            return false;
        }
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
       
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + ", theMap=" + theMap + ", inventoryItem=" + inventoryItem + ", acresOwned=" + acresOwned + ", wheatStorage=" + wheatStorage +  '}';
    }

    public void setGame(String currentGame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
