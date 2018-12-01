/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;
import java.util.Random;
import byui.cit260.EarlyRisers.exceptions.WheatEatenException;
/**
 *
 * @author rache
 */
public class WheatEaten {

     public static void calcGrowth(int[] ratsEatWheat, double tithing, double wheatStorage) extends WheatEatenException {
         Random random = new Random();
         int ran = random.nextInt(5);
         ran++;
         int total = 0;
           if (tithing < 0) { //if tithing is under 0
            throw new WheatEatenException ("Tithing can not be negative.");
        }
        if (wheatStorage < 0) {//if wheat storage is negative
            throw new WheatEatenException ("Wheat storage cannot be negative.");
        }
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
     }
          
     }
}
/**
 *
 * @author rache
 */

