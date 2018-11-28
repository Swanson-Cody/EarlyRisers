/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;
import java.util.Random;

/**
 *
 * @author rache
 */
public class WheatEaten {

     public static double calcGrowth(int[] ratsEatWheat, double tithing, double wheatStorage) {
         Random random = new Random();
         int ran = random.nextInt(5);
         ran++;
         int total = 0;
         
         if(tithing > 12){
             wheatStorage = wheatStorage - ran;
         } else if(tithing >= 8 && tithing <= 12){
             wheatStorage = wheatStorage - ran;
         } else if (tithing >=0 && tithing < 8){
             wheatStorage = wheatStorage - ran;
         
             
             for(int eatWheat: ratsEatWheat){
                 total = eatWheat - ran;
             }
             System.out.println("The rats have eaten " + total + " in total.");
       
         
     }
            return wheatStorage;
     }
}
/**
 *
 * @author rache
 */

