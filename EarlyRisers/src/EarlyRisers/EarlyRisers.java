/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EarlyRisers;

import Model.*;

/**
 *
 * @author Heather
 */
public class EarlyRisers  {
    
    /**
    / * @param args the command line arguments
     */
    public static void testTeamClasses(){
       InventoryItem inventoryItem = new InventoryItem();
       inventoryItem.setAnimals("Rats");
       inventoryItem.setItemType("Animal");
       inventoryItem.setProvisions("Shovel");
       inventoryItem.setTithing(100);
       System.out.println(inventoryItem.toString());
       Game game = new Game(); 
       game.setAcresOwned(5);
       game.setInventoryItem(inventoryItem);
       game.setWheatStorage(100);
       System.out.println(game.toString());
    }
    
    
    public static void testHeatherClasses(){
    }
    public static void testRachelClasses(){
    }
    public static void testCodyClasses(){
    }
        // TODO code application logic here
    public static void main(String[] args){
        testTeamClasses();  
        testHeatherClasses();
        testRachelClasses();
        testCodyClasses();
    }
    
   
    
}
