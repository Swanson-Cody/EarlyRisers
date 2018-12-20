/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.exceptions.BuyLandException;
import byui.cit260.EarlyRisers.exceptions.GameControlException;
import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.view.FeedPeopleView;

/**
 *
 * @author rache
 */
public class FeedPeople {

//    public static int feedPeople() throws GameControlException, BuyLandException {
//        InventoryItem wheat = GameControl.getInventoryItemByName("Wheat Bushels");
//        InventoryItem population = GameControl.getInventoryItemByName("Population");
//        FeedPeopleView feedPeople = new FeedPeopleView();
//        feedPeople.getInputs(Integer.parseInt(inputs[0]));
//        int wheatNeeded;
//        int starved;
//        int percentStarved;
////feedPeople input from FeedPeopleView
////peopleFed = the input from the FeedPeopleView divided by the 20 bushels needed per person to equal people fed. 
//
//        wheatNeeded = population.getQuantity() * 20;
//
//        int peopleFed = feedPeople / 20;
//        if (peopleFed >= population.getQuantity()) {
//            starved = 0;
//            percentStarved = 0;
//            System.out.println("Your people are well fed and happy.");
//        } else {
//            starved = population.getQuantity() - peopleFed;
//            System.out.println(starved + " people starved to death.");
//            percentStarved = (100 * starved) / population.getQuantity();
//            population = population.getQuantity() - starved;
//        }
//    }
//
//    private void countStarvedPeople() {
//        int peopleFed = grainFedToPeople / 20;
//        if (peopleFed >= population.getQuantity()) {
//            starved = 0;
//            percentStarved = 0;
//            System.out.println("Your people are well fed and happy.");
//        } else {
//            starved = population - peopleFed;
//            System.out.println(starved + " people starved to death.");
//            percentStarved = (100 * starved) / population;
//            population = population - starved;
//        }
//    }
//
//    if (feedPeople < 0)
//    {
//            throw new BuyLandException("You cannot feed people a negative amount of food");
//    }
//    else if (wheatNeeded
//
//    > wheat.getQuantity () 
//        )
//        {
//            throw new BuyLandException("You do not have enough wheat in storage.");
//    }
//    return wheatRemaining ;
}

