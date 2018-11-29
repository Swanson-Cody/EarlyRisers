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
        InventoryItem location = new InventoryItem();
        ArrayList<InventoryItem> tools = new ArrayList<InventoryItem>();
        tools.add(new InventoryItem("Plows", 0));
        tools.add(new InventoryItem("", 0));
        tools.add(new InventoryItem("Shovel", 0));
        tools.add(new InventoryItem("Scythe", 0));
        tools.add(new InventoryItem("", 0));

        location.setItems(tools);
    }

    public static void createWheat() {
        InventoryItem location = new InventoryItem();
        ArrayList<InventoryItem> wheat = new ArrayList<InventoryItem>();
        wheat.add(new InventoryItem("Wheat Bushels", 3000));
        location.setItems(wheat);
    }

    public static void createAnimals() {
       InventoryItem location = new InventoryItem();
        ArrayList<InventoryItem> animals = new ArrayList<InventoryItem>();
        animals.add(new InventoryItem("Rats", 50));
        animals.add(new InventoryItem("Oxs", 0));
        animals.add(new InventoryItem("Horses", 0));
        location.setItems(animals);
    }

    public static void createPopulation() {
        InventoryItem location = new InventoryItem();
        ArrayList<InventoryItem> population = new ArrayList<InventoryItem>();
        population.add(new InventoryItem("Population", 100));
        location.setItems(population);
    }

    public static void createTithing() {
        InventoryItem location = new InventoryItem();
        ArrayList<InventoryItem> tithing = new ArrayList<InventoryItem>();
        tithing.add(new InventoryItem("Tithing", 0));
        location.setItems(tithing);
    }

    public static void createLand() {
        InventoryItem location = new InventoryItem();
        ArrayList<InventoryItem> land = new ArrayList<InventoryItem>();
        land.add(new InventoryItem("Land", 1000));
        location.setItems(land);
    }

    public static void createCropData() {
        InventoryItem location = new InventoryItem();
        ArrayList<InventoryItem> cropData = new ArrayList<InventoryItem>();
        cropData.add(new InventoryItem("Year", 0));
        cropData.add(new InventoryItem("CropYield", 0));
        cropData.add(new InventoryItem("Dead", 0));
        cropData.add(new InventoryItem("Acres Planted", 0));
        location.setItems(cropData);
    }
}
