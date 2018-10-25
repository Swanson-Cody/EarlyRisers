/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.util.Random;
/**
 *
 * @author Heather
 */
public class Population {
       public static double calcGrowth (int population){
     population = 100;    
//Get random number 1-5 for percent of population increase
        
    Random percent = new Random();
        int w = percent.nextInt(5);
        ++w;
        System.out.println(w);
  
        population = (population+(w/100*population));
         
       System.out.println("Your population is now" + population);
    return population;}
}  
 

