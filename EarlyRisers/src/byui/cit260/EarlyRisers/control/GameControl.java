/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.model.Map;
import java.util.ArrayList;
import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.exceptions.MapControlException;
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
    public static EarlyRisers Game;

      public static void createNewGame(Player player) throws GameControlException, MapControlException{
        if (player == null) {
            throw new GameControlException ("You must have a player.");
        }

        //create game object
//        Game = new EarlyRisers();
        Game game = new Game();
        //create player object
        game.setPlayer(player);

        EarlyRisers.setCurrentGame(game);
        //set actor?

//      create the Map object
        Map map = MapControl.createMap();
        game.setMap(map);
        createTools();
        createWheat();
        createAnimals();
        createPopulation();
        createTithing();
        createLand();
        createCropData();
       
    }

    //savePlayer(name): Player  
//BEGIN  
//if name is null OR length of name is < 1 THEN   
//RETURN null 
    
    public static InventoryItem getInventoryItemByName(String name) throws GameControlException{
        ArrayList<InventoryItem> items = EarlyRisers.getCurrentGame().getInventory();
        for (InventoryItem item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public static ArrayList<InventoryItem> getInventoryItemsByType(String type) throws GameControlException{
        ArrayList<InventoryItem> items = EarlyRisers.getCurrentGame().getInventory();
        ArrayList<InventoryItem> itemsByType = new ArrayList<>();
        boolean found = false;
        for (InventoryItem item : items) {
            if (item.getItemType().equals(type)) {
                found = true;
                itemsByType.add(item);
            }
        }
        if (found) {
            return itemsByType;
        } else {
            return null;
        }
    }
public static void createTools() throws GameControlException{
        ArrayList<InventoryItem> tools = new ArrayList<>();
        tools.add(new InventoryItem("Tools", "Plows", 1));
        tools.add(new InventoryItem("Tools", "", 0));
        tools.add(new InventoryItem("Tools", "Shovel", 2));
        tools.add(new InventoryItem("Tools", "Scythe", 1));
        tools.add(new InventoryItem("Tools", "", 3));

        EarlyRisers.getCurrentGame().setInventory(tools);

    }

    public static void createWheat() throws GameControlException{
        ArrayList<InventoryItem> wheat = new ArrayList<>();
        wheat.add(new InventoryItem("Wheat", "Wheat Bushels", 3000));
        EarlyRisers.getCurrentGame().addToInventory(wheat);
    }

    public static void createAnimals() throws GameControlException{
        ArrayList<InventoryItem> animals = new ArrayList<>();
        animals.add(new InventoryItem("Animal", "Rat", 50));
        animals.add(new InventoryItem("Animal", "Ox", 0));
        animals.add(new InventoryItem("Animal", "Horse", 0));
        EarlyRisers.getCurrentGame().addToInventory(animals);
    }

    public static void createPopulation() throws GameControlException{
        ArrayList<InventoryItem> population = new ArrayList<>();
        population.add(new InventoryItem("Utility", "Population", 100));
        EarlyRisers.getCurrentGame().addToInventory(population);
    }

    public static void createTithing() throws GameControlException{
        ArrayList<InventoryItem> tithing = new ArrayList<>();
        tithing.add(new InventoryItem("Tithing", 0));
        EarlyRisers.getCurrentGame().addToInventory(tithing);
    }

    public static void createLand() throws GameControlException{
        ArrayList<InventoryItem> land = new ArrayList<>();
        land.add(new InventoryItem("Land", 1000));
        EarlyRisers.getCurrentGame().addToInventory(land);
    }

    public static void createCropData() {
        ArrayList<InventoryItem> cropData = new ArrayList<>();
        cropData.add(new InventoryItem("Year", 0));
        cropData.add(new InventoryItem("CropYield", 0));
        cropData.add(new InventoryItem("Dead", 0));
        cropData.add(new InventoryItem("Acres Planted", 0));
        EarlyRisers.getCurrentGame().addToInventory(cropData);
    }

}
