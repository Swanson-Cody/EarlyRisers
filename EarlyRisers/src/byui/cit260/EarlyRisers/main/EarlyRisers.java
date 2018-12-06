/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Testing
 */
package byui.cit260.EarlyRisers.main;
//import Model.*;

import byui.cit260.EarlyRisers.view.StartProgramViewNew;
import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Heather
 */
public class EarlyRisers {

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static Game currentGame = null;

    private static Player player = null;

//    private static double totalTime;
//    private static ArrayList<InventoryItem> inventory;
    
    private static PrintWriter logFile = null;

    
    public static void main(String[] args) {

        try {
            EarlyRisers.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            EarlyRisers.outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
            StartProgramViewNew menu = new StartProgramViewNew();
            menu.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();

        } finally {
            try {
                if (EarlyRisers.inFile != null) {
                    EarlyRisers.inFile.close();
                }
                if (EarlyRisers.outFile != null) {
                    EarlyRisers.outFile.close();
                }
                if(logFile != null){
                    logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Invalid input/output "
                        + "whichever the ccase may be");
                return;
            }
        }

    }

//
//    public void setTotalTime(double totalTime) {
//        EarlyRisers.totalTime = totalTime;
//    }
//
//    public static void setTheMap(Map theMap) {
//        EarlyRisers.theMap = theMap;
//    }
//
//    public void setInventory(ArrayList<InventoryItem> inventory) {
//        EarlyRisers.inventory = inventory;
//    }
//    
//    public void addToInventory(ArrayList<InventoryItem> inventory){
//        for(int i = 0; i < inventory.size(); i++){
//            EarlyRisers.inventory.add(inventory.get(i));
//        }
//    }
//    public static double getTotalTime() {
//        return totalTime;
//    }
//
//    public static Map getTheMap() {
//        return theMap;
//    }
//
//    public static ArrayList<InventoryItem> getInventory() {
//        return inventory;
//    }
    /**
     *
     * @param args
     */
//    public static void main(String []args){
//       
//        StartProgramViewNew menu = new StartProgramViewNew();
//        menu.display();
//    }
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EarlyRisers.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        EarlyRisers.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        EarlyRisers.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        EarlyRisers.inFile = inFile;
    }
    
        
    public static PrintWriter getLogFile(){
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile){
        EarlyRisers.logFile = logFile;
    }
    

//    public static Map getMap() {
//        return EarlyRisers.theMap;
//    }
//
//    public static void setMap(Map map) {
//        EarlyRisers.theMap = map;
//    }
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

