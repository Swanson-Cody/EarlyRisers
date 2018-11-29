/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Testing
 */
package byui.cit260.EarlyRisers.main;
//import Model.*;

import byui.cit260.EarlyRisers.view.StartProgramViewNew;
import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.model.CreateNewGame;
import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.model.Map;
import byui.cit260.EarlyRisers.model.Scene;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Heather
 */
public class Game implements Serializable {

    private static CreateNewGame currentGame = null;
    private static Player player = null;

    private static double totalTime;
    private static Map theMap;
    private static ArrayList<InventoryItem> inventory;

    public static void main(String[] args) {
        StartProgramViewNew menu = new StartProgramViewNew();
        menu.display();
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", inventory=" + inventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
//        hash = 43 * hash + ArrayList<InventoryItem>.deepHashCode(this.inventory);
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
        return true;
    }

    public void setTotalTime(double totalTime) {
        Game.totalTime = totalTime;
    }

    public static void setTheMap(Map theMap) {
        Game.theMap = theMap;
    }

    public void setInventory(ArrayList<InventoryItem> inventory) {
        Game.inventory = inventory;
    }
    
    public void addToInventory(ArrayList<InventoryItem> inventory){
        for(int i = 0; i < inventory.size(); i++){
            Game.inventory.add(inventory.get(i));
        }
    }

    public static double getTotalTime() {
        return totalTime;
    }

    public static Map getTheMap() {
        return theMap;
    }

    public static ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    /**
     *
     * @param args
     */
//    public static void main(String []args){
//       
//        StartProgramViewNew menu = new StartProgramViewNew();
//        menu.display();
//    }
    public static CreateNewGame getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(CreateNewGame currentGame) {
        Game.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Game.player = player;
    }

    public static Map getMap() {
        return Game.theMap;
    }

    public static void setMap(Map map) {
        Game.theMap = map;
    }

}

/**
 *
 * / * @param args the command line arguments
 */
//    public static void testTeamClasses(){
//       InventoryItem inventoryItem = new InventoryItem();
//       inventoryItem.setAnimals("Rats");
//       inventoryItem.setItemType("Animal");
//       inventoryItem.setProvisions("Shovel");
//       inventoryItem.setTithing(100);
//       System.out.println(inventoryItem.toString());
//       Game game = new Game(); 
//       game.setAcresOwned(5);
//       game.setInventoryItem(inventoryItem);
//       game.setWheatStorage(100);
//       System.out.println(game.toString());
//    }
//    
//    
//    public static void testHeatherClasses(){
//        
//       Question question = new Question();
//       question.setQuestionText("What shall we do now?");
//       question.setAnswer1("I don't know");
//       question.setAnswer2("Turn Right");
//       question.setAnswer3("Turn Left");
//       question.setAnswer4("Stay here");
//       question.setCorrectAnswer(2);
//       System.out.println(question.toString());
//       Scene scene =new Scene();
//        scene.setName("Field");
//        scene.setDescription("Wheat Field");
//        scene.setItem("Hammer");
//        scene.setQuestion(question);
//        System.out.println(scene.toString());
//        
//    }    
//       
//    public static void testCodyClasses(){
//        
//    Location location = new Location();
//    location.setVisited(false);
//    location.setRow(2);
//    location.setColumn(4);
//    System.out.println(location.toString());
//    Provision provision = new Provision();
//    provision.setPerishable(false);
//    provision.setName("Player");
//    System.out.println(provision.toString());
//       
//    
//    }
//    public static void testRachelClasses(){
//    Player player =new Player();
//    player.setName("Player Name");
//    System.out.println(player.toString());
//    Point point = new Point();
//    point.setRow(3);
//    point.setColumn(2);
//    System.out.println(point.toString());
//    Map map =new Map();
//    map.setCurrentLocation(5);
//    map.setLocations("Field");
//     System.out.println(map.toString());
//    
//    
//    
//    }
//    private String name;
//        // TODO code application logic here

