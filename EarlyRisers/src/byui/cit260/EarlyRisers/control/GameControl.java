/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;
import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.view.StartProgramViewNew;
import byui.cit260.EarlyRisers.main.game;
import byui.cit260.EarlyRisers.model.Game;
/**
 *
 * @author Heather
 */
public class GameControl {
    
    public static Player savePlayer(String playerName) {
       Player player = new Player();
       
       player.setName(playerName);
       game.setPlayer(player);
     return player; 
     
      }
     public static Game saveGame(String currentGame){
       Game game = new Game();
       game.setGame(currentGame);
     return game;
     }
    
         private static int createNewGame(Player player){
        if (player == null){
            return -1;
       }
        
        Game game = new Game();
        Player thePlayer = new Player();
        String name = null;
        thePlayer.setName(name);
        game.setThePlayer(thePlayer);
        
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