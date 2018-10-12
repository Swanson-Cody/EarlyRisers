/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Testing
 */
package EarlyRisers;

import Model.*;

/**
 *
 * @author Heather
 */
public class EarlyRisers  {
    
    /**
    / * @param args the command line arguments
     */
    public static void testTeamClasses(){
       InventoryItem inventoryItem = new InventoryItem();
       inventoryItem.setAnimals("Rats");
       inventoryItem.setItemType("Animal");
       inventoryItem.setProvisions("Shovel");
       inventoryItem.setTithing(100);
       System.out.println(inventoryItem.toString());
       Game game = new Game(); 
       game.setAcresOwned(5);
       game.setInventoryItem(inventoryItem);
       game.setWheatStorage(100);
       System.out.println(game.toString());
    }
    
    
    public static void testHeatherClasses(){
        
       Question question = new Question();
       question.setQuestionText("What shall we do now?");
       question.setAnswer1("I don't know");
       question.setAnswer2("Turn Right");
       question.setAnswer3("Turn Left");
       question.setAnswer4("Stay here");
       question.setCorrectAnswer(2);
       System.out.println(question.toString());
       Scene scene =new Scene();
        scene.setName("Field");
        scene.setDescription("Wheat Field");
        scene.setItem("Hammer");
        scene.setQuestion(question);
        System.out.println(scene.toString());
        
    }    
       
    public static void testCodyClasses(){
        
    Location location =new Location();
    location.setVisited(false);
    location.setRow(2);
    location.setColumn(4);
    System.out.println(location.toString());
    Provision provision =new Provision();
    provision.setPerishable(false);
    provision.setName("Player");
    System.out.println(provision.toString());
       
    
    }
    public static void testRachelClasses(){
    }
    
        // TODO code application logic here
    public static void main(String[] args){
        testTeamClasses();  
        testHeatherClasses();
        testRachelClasses();
        testCodyClasses();
    }
    
   
    
}
