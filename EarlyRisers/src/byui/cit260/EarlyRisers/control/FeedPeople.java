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
