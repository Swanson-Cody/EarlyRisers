/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.exceptions.BuyLandException;

/**
 *
 * @author rache
 */
public class FeedPeople {
        public static int feedPeople()
        {
            write("amount to set aside for food (20 bushels feed 1 person)")
            input;
            store amout to set aside for food;
                    
            if (input[0] < 0)
	{
            throw new BuyLandException ("You cannot feed people a negative amount of food");
	}
        else if (wheatNeeded > wheatInStorage)
        {
            throw new BuyLandException ("You do not have enough wheat in storage.");
        }
        return wheatremaining;
        }
}

    private void countStarvedPeople() {
        int peopleFed = grainFedToPeople / 20;
        if (peopleFed >= population) {
            starved = 0;
            percentStarved = 0;
            System.out.println("Your people are well fed and happy.");
        } else {
            starved = population - peopleFed;
            System.out.println(starved + " people starved to death.");
            percentStarved = (100 * starved) / population;
            population = population - starved;
        }
    }




  int peopleFed = grainFedToPeople / 20;
        if (peopleFed >= population) {
            starved = 0;
            percentStarved = 0;
            System.out.println("Your people are well fed and happy.");
        } else {
            starved = population - peopleFed;
            System.out.println(starved + " people starved to death.");
            percentStarved = (100 * starved) / population;
            population = population - starved;
        }
    private void countImmigrants() {
        if (starved > 0) {
            immigrants = 0;
        } else {
            immigrants = (20 * acres + grain) / (100 * population) + 1;
            population += immigrants;
        }

    }
