/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Family
 */
public class BuyLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inFile = new Scanner(System.in);
        System.out.println("How many acres do you have?");
        int acres = inFile.nextInt();
        
        System.out.println("What percentage of your harvest do you want to give to tithes and offerings?");
        //add validation to make sure a number was entered. this will throw an exception if they enter a non-number character
        int percent = inFile.nextInt();
        
        while (percent < 0 || percent > 100)
        {
            if (percent < 0) {
                //tell user value entered was too low and ask for new value
                System.out.println("Value is too low. Enter a value greater than 0 but not greater than 100.");
                percent = inFile.nextInt();
            } 
            else {
                //tell user value entered was too high and ask for new value
                System.out.println("Value is too high. Enter a value greater than 0 but not greater than 100.");
                percent = inFile.nextInt();
            }
        }

        
        System.out.println("Your offering is " + percent);
        
        int foo = calcHarvest(percent, acres);
        
        System.out.println("Your total yield is " + foo);

    }
    
    public static int calcHarvest(int percent, int acresToHarvest) {
        Random rnd = new Random();
        int highTithesYieldPerAcre = rnd.nextInt(4) + 2;
        System.out.println("highTithesYieldPerAcre: " + highTithesYieldPerAcre);

        int medTithesYieldPerAcre = rnd.nextInt(3) + 2;
        System.out.println("medTithesYieldPerAcre: " + medTithesYieldPerAcre);

        int lowTithesYieldPerAcre = rnd.nextInt(3) + 1;
        System.out.println("lowTithesYieldPerAcre: " + lowTithesYieldPerAcre);


	int bushelsPerAcre = 0;
        if (percent > 12) {
                bushelsPerAcre = highTithesYieldPerAcre;
        } else if (percent >= 8){
                bushelsPerAcre = medTithesYieldPerAcre;
        } else {
                bushelsPerAcre = lowTithesYieldPerAcre;
        }
    
            return acresToHarvest * bushelsPerAcre;
    }
}

