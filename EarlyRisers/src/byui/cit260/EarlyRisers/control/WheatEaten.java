/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

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

    public WheatEaten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

/**
 *
 * @author rache
 */

}
