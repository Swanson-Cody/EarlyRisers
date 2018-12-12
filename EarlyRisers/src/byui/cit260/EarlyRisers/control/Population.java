/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Random;
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.exceptions.PopulationException;
import java.util.Random;

/**
 * @author Heather
 */
public class Population {
    /**
     *
     * @param population
     * @return
     */
    private static double calcGrowth(double population) throws PopulationException {

        /**
         * Set the value of itemType
         *
         * @param itemType new value of itemType
         */
//Get random number 1-5 for percent of population increase
        Random percent = new Random();
        int w = percent.nextInt(5);
        ++w;
        System.out.println(w);
//Define invalid variables
        if (population <= 0) { //if population is under 0
            throw new PopulationException("The population can not be negative.");
        }
        if (population > 300) {//if population grows bigger than 300
            throw new PopulationException("The population cannot be larger than 300.");
        }
        if (w <= 0) {//if percent is less than or equal to 0
            throw new PopulationException("The return percent cannot be less than 0.");
        }
        if (w > 5) {//if percent is greater than 5
            throw new PopulationException("The return percent cannot be larger than 5.");

        }
        //Calculate population by taking the beginning population number and taking the 
//random percent times it by 100 times the population and adding that number to 
//the total. 
        double result = population + ((w / 100) * population);
        Math.round(result);
        return result;
    }

    /**
     *
     * @param population
     * @param tithes
     * @param wheat
     * @throws PopulationException
     */
    private static double calcGrowthTithes(double population, double tithes, double wheat) throws PopulationException {
        double newPopulation = calcGrowth(population);
        double result = newPopulation;
        if (newPopulation <= 0) { //if population is under 0
            throw new PopulationException("The population can not be negative.");
        }
        if (newPopulation > 300) {//if population grows bigger than 300
            throw new PopulationException("The population cannot be larger than 300.");
        }

        if (tithes >= wheat * .10) {
            Random percent = new Random();
            int random = percent.nextInt(10);
            ++random;
            System.out.println(random);
            result = newPopulation + ((random / 100) * newPopulation);
            Math.round(result);
        }
        else if (tithes <= wheat * .06) {
            Random percent = new Random();
            int random = percent.nextInt(6);
            ++random;
            System.out.println(random);
            result = newPopulation + ((random / 100) * newPopulation);
            Math.round(result);
        } else if (tithes >= wheat * .04) {
            Random percent = new Random();
            int random = percent.nextInt(10);
            ++random;
            System.out.println(random);
            result = ((random / 100) * newPopulation)- newPopulation; 
            Math.round(result);
        }
        return result;
    }

}
