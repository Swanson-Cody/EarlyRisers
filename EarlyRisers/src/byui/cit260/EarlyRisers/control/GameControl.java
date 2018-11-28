/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.main.Game;
import byui.cit260.EarlyRisers.model.InventoryItem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *
 */
public class GameControl {

    Scanner keyboard = new Scanner(System.in);
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    // reference to a Game object
    public static Game CreateNewGame;
    private static Game Player;

    public static int createNewGame(Player player) {
        double returnValue = GameControl.createNewGame(CreateNewGame.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create new game.");
            return -1;
        }//create game object
        CreateNewGame = new Game();
        //create player object
        CreateNewGame.setPlayer(player);
      //create the Map ojbect
//    Map map = new createMap();
//    theGame.setMap(newMap);

        createTools();
        createWheat();
        createAnimals();
        createPopulation();
        createTithing();
        createLand();
        createCropData();
return 1;

    }

    //savePlayer(name): Player  
//BEGIN  
//if name is null OR length of name is < 1 THEN   
//RETURN null 

    

    public static void createTools() {
        
        ArrayList<InventoryItem> tools = new ArrayList<InventoryItem>();
        tools.add(new InventoryItem("Plows", 1));
        tools.add(new InventoryItem("", 0));
        tools.add(new InventoryItem("Shovel", 2));
        tools.add(new InventoryItem("Scythe", 1));
        tools.add(new InventoryItem("", 3));
       
    }

    public static void createWheat() {
        ArrayList<InventoryItem> wheat = new ArrayList<InventoryItem>();
        wheat.add(new InventoryItem("Wheat Bushels", 3000));

    }

    public static void createAnimals() {
        ArrayList<InventoryItem> animals = new ArrayList<InventoryItem>();
        animals.add(new InventoryItem("Rats", 50));
        animals.add(new InventoryItem("Oxs", 0));
        animals.add(new InventoryItem("Horses", 0));

    }

    public static void createPopulation() {
        ArrayList<InventoryItem> population = new ArrayList<InventoryItem>();
        population.add(new InventoryItem("Population", 100));
    }

    public static void createTithing() {
        ArrayList<InventoryItem> tithing = new ArrayList<InventoryItem>();
        tithing.add(new InventoryItem("Tithing", 0));
    }

    public static void createLand() {
        ArrayList<InventoryItem> land = new ArrayList<InventoryItem>();
        land.add(new InventoryItem("Land", 1000));
    }

    public static void createCropData() {
        ArrayList<InventoryItem> cropData = new ArrayList<InventoryItem>();
        cropData.add(new InventoryItem("Year", 0));
        cropData.add(new InventoryItem("CropYield", 0));
        cropData.add(new InventoryItem("Dead", 0));
        cropData.add(new InventoryItem("Acres Planted", 0));
    }
}
