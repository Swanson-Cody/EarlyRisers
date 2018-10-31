/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author rache
 */
public class WheatEaten {

     public static double calcGrowth(double tithing, double random, double wheatStorage) {
         if(tithing > 12){
             wheatStorage = wheatStorage - random;
         } else if(tithing >= 8 && tithing <= 12){
             wheatStorage = wheatStorage - random;
         } else if (tithing >=0 && tithing < 8){
             wheatStorage = wheatStorage - random;
         }
       
         return wheatStorage;
     }

/**
 *
 * @author rache
 */

}
