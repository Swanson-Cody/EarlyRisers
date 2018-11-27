/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.view.StartProgramViewNew;
import byui.cit260.EarlyRisers.main.Game;
import byui.cit260.EarlyRisers.model.CreateNewGame;
import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.control.MapControl;
import byui.cit260.EarlyRisers.model.Map;
import java.util.ArrayList;
/**
 *
 * @author Heather
 */


public class GameControl {

    public Player savePlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        return player;

    }

    public static CreateNewGame saveGame(String currentGame) {
        CreateNewGame game = new CreateNewGame();
        game.setGame(currentGame);
        return game;
    }

    public static Map saveMap(int currentMap) {
        Map newMap = new createMap();
        Map.setMap(currentMap);
        return newMap;
    }

    private static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        CreateNewGame game = new CreateNewGame();
        Player thePlayer = new Player();
        String name = null;
        thePlayer.setName(name);
        game.setThePlayer(thePlayer);

    }

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
    public static void createPopulation(){
    ArrayList<InventoryItem> population = new ArrayList<InventoryItem>();
        population.add(new InventoryItem ("Population", 100));
        }
public static void createTithing(){
    ArrayList<InventoryItem> tithing = new ArrayList<InventoryItem>();
        tithing.add(new InventoryItem ("Tithing", 0));
        }
public static void createLand(){
    ArrayList<InventoryItem> land = new ArrayList<InventoryItem>();
        land.add(new InventoryItem ("Land", 1000));
        }
 public static void createCropData() {
            CropData theCrops = new CropData();
           
            
            theCrops.setYear(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            theCrops.setAcresPlanted(1000);
            
            //save the cropData in the Game object
            Game.setCropData(theCrops); 
        }
    
}
//savePlayer(name): Player  
//BEGIN  
//if name is null OR length of name is < 1 THEN   
//RETURN null  
//ENDIF  player = new Player object  
//save the name in the player object  
//save the player in the main class of the project  
//RETURN player END
//   private static Game currentGame = null;
 //   private static Player player = null;
