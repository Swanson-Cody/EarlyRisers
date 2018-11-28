/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Heather
 */
public class ToolPurchase {
    public static double calcToolPurchase (double wheat){
if (wheat <=0){
return -1;
buyItem();
sellItem();

}
public static buyItem(String, int){
List<BuyItem> items=new ArrayList<BuyItem>();
    items.add(new BuyItem("Plow",-20));
   items.add(new BuyItem("Horse",-100));
   items.add(new BuyItem("Ox",-120));
   items.add(new BuyItem("Scythe",-20));
   items.add(new BuyItem("Shovel",-5));}
   
  public static sellItem(String, int){ 
   List<SellItem> items=new ArrayList<SellItem>();
    items.add(new SellItem("Plow",-20));
   items.add(new SellItem("Horse",-100));
   items.add(new SellItem("Ox",-120));
   items.add(new SellItem("Scythe",-20));
   items.add(new SellItem("Shovel",-5));
  }
  1 = -20
2 = -100
3 = -120
4= -20
5 = -5
6 = 5
7 = 20
8 = 30
9 = 5
10 = 1
      
}

   
        private BuyItem(String ox, int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

