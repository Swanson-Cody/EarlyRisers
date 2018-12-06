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

/**
 *
 * @author Heather
 */
public class game {

    /**
     *
     * @param args
     */
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

//    public static void main(String []args){
//       
//        StartProgramViewNew menu = new StartProgramViewNew();
//        menu.display();
//    }
    public static void main(String[] args) {

        try {

            game.inFile
                    = new BufferedReader(new InputStreamReader(Systen.in));
            game.outFile = new PrintWriter(System.out, true);
            StartProgramViewNew menu = new StartProgramViewNew();
            menu.display();
        } catch (Throwable e) {
            System.out.println("Ecepetion: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();;
        } finally {
            try {
                if (game.inFile != null) {
                    game.inFile.close();
                }
                if (game.outFile != null) {
                    game.outFile.close();
                }

            } catch (IOExcepion ex) {
                System.out.println("Invalid input/output "
                        + "whichever the ccase may be");
                return;
            }
        }

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        game.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        game.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        game.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        game.inFile = inFile;
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

