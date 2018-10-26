/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
//import java.util.Random;

import java.util.Random;


/**
 *
 * @author Heather
 */
public class Population {

    public static double calcGrowth(int population, int w) {

        population = 100;
        w = 5;
        //Get random number 1-5 for percent of population increase

        //   Random percent = new Random();
        //   int w = percent.nextInt(5);
        //   ++w;
        //   System.out.println(w); 
//Define invalid variables
        if (population <= 0) {
            return -1;
        }
        if (population > 300) {
            return -2;
        }
        if (w <= 0) {
            return -3;
        }
        if (w > 5) {
            return -4;
        }
        //Calculate population by taking the beginning population number and taking the 
//random percent times it by 100 times the population and adding that number to 
//the total. 
        double populationTotal = population + ((w / 100) * population);
        return Math.round(populationTotal);

    }

    public static double calcGrowthTithing(int tithing, int populationTithes) {
        populationTithes = calcGrowth();
        
        if (populationTithes <= 0) {
            return -1;
        }
        if (populationTithes > 300) {
            return -2;
        }
        
//Get random number 2-5 for tithing paid above 12%
    Random rnd1 = new Random();
        int x = rnd1.nextInt(5);
        ++x;
        if (x == 1){
        ++x;
     if (x <= 0) {
            return -3;
        }
        if (x > 5) {
            return -4;
        }
        System.out.println(x);}
        else {
    System.out.println(x);
            }
       
//Get random number 2-4 for tithing paid above 8%
    Random rnd2 = new Random();
        int y = rnd2.nextInt(4);
        ++y;
        if (y == 1) {
        ++y;
        if (y < 2) {
            return -3;
        }
        if (y > 8) {
            return -4;
        }
    System.out.println(y);
        
        }
        else {
    System.out.println(y);
            }

//Get random number 1-8 for tithing paid lower than 8%
    Random rnd3 = new Random();
        int z = rnd3.nextInt(8);
        ++z;
        if (x <= 0) {
            return -3;
        }
        if (x > 8) {
            return -4;
        }
    System.out.println(z);
    
    
    
    }
}
