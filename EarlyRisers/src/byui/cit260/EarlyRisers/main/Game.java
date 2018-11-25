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
import byui.cit260.EarlyRisers.model.Map;
import java.io.Serializable;
/**
 *
 * @author Heather
 */
public class Game implements Serializable {
    private double totalTime;
    private Map theMap;
    
    /**
     *
     * @param args
     */
    private static CreateNewGame currentGame = null;
    private static Player player = null;
    
//    public static void main(String []args){
//       
//        StartProgramViewNew menu = new StartProgramViewNew();
//        menu.display();
//    }
    public static void main(String []args){
        StartProgramViewNew menu = new StartProgramViewNew();
        menu.display();    

    }
  public static CreateNewGame getCurrentGame() {
        return currentGame;
    }
    public static void setCurrentGame(CreateNewGame currentGame) {
        Game.currentGame = currentGame;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Map getMap() {
        return this.theMap;
    }
    
    public void setMap(Map map) {
        this.theMap = map;
    }


    
    
}
   

    /**
     * 
    / * @param args the command line arguments
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

