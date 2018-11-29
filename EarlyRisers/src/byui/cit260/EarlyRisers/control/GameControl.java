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
import byui.cit260.EarlyRisers.model.Scene;
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
    public static EarlyRisers Game;

    public static void startNewGame(Player player) {
        double returnValue = GameControl.createNewGame(Game.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create new game.");
        }
    }

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
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
        return 1;
    }

    //savePlayer(name): Player  
//BEGIN  
//if name is null OR length of name is < 1 THEN   
//RETURN null 
    public static void createTools() {
        ArrayList<InventoryItem> tools = new ArrayList<>();
        tools.add(new InventoryItem("Plows", 1));
        tools.add(new InventoryItem("", 0));
        tools.add(new InventoryItem("Shovel", 2));
        tools.add(new InventoryItem("Scythe", 1));
        tools.add(new InventoryItem("", 3));

        EarlyRisers.getCurrentGame().setInventory(tools);
       
    }

    public static void createWheat() {
        ArrayList<InventoryItem> wheat = new ArrayList<>();
        wheat.add(new InventoryItem("Wheat Bushels", 3000));
        EarlyRisers.getCurrentGame().addToInventory(wheat);
    }

    public static void createAnimals() {
        ArrayList<InventoryItem> animals = new ArrayList<>();
        animals.add(new InventoryItem("Rats", 50));
        animals.add(new InventoryItem("Oxs", 0));
        animals.add(new InventoryItem("Horses", 0));
        EarlyRisers.getCurrentGame().addToInventory(animals);
    }

    public static void createPopulation() {
        ArrayList<InventoryItem> population = new ArrayList<>();
        population.add(1, new InventoryItem("Population", 100));
        EarlyRisers.getCurrentGame().addToInventory(population);
    }

    public static void createTithing() {
        ArrayList<InventoryItem> tithing = new ArrayList<>();
        tithing.add(new InventoryItem("Tithing", 0));
        EarlyRisers.getCurrentGame().addToInventory(tithing);
    }

    public static void createLand() {
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
    public static void createScenes() {
        ArrayList<Scene> scenes = new ArrayList<>();
    scenes.add(new Scene("Your wheat fields."));
    scenes.add(new Scene("Ask a question."));
    scenes.add(new Scene("Harvest time"));
    scenes.add(new Scene("Church"));
      
    }
}
