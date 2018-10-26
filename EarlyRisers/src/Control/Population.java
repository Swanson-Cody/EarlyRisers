/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
//import java.util.Random;

//import java.util.Random;


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
        else if (population > 300) {
            return -2;
        }
        else if (w <= 0) {
            return -3;
        }
        else if (w > 5) {
            return -4;
        }
        //Calculate population by taking the beginning population number and taking the 
//random percent times it by 100 times the population and adding that number to 
//the total. 
        else {double populationTotal = population + ((w / 100) * population);
        return Math.round(populationTotal); }

    }

}