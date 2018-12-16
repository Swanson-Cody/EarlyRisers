/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
import byui.cit260.EarlyRisers.control.FeedPeople;

/**
 *
 * @author Rache
 */
public class FeedPeopleView extends View {

    private static FeedPeople goToFeedPeople() {
        FeedPeople feedPeople = new FeedPeople();
        
//        buyTheLand.buyLand();
        return feedPeople;
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput("How much would you like to feed the people?");
        inputs[0] = selection;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        // this.console.println("This is where we'll validate the input and call the buy land function in the controller.");
        goToFeedPeople();

        ManageCropsView view = new ManageCropsView();
        view.display();

        return false;
    }
}
