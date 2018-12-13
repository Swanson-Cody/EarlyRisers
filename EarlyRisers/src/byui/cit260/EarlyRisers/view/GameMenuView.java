/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
//import byui.cit260.EarlyRisers.model.Player;

import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;

import java.util.Scanner;

/**
 *
 *
 */
public class GameMenuView extends View {
    //Menu options 
    //Get number input from user 

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|                Welcome to                 |"
                + "\n|         Game of the City of Aaron         |"
                + "\n+-------------------------------------------+"
                + "\n\nPlease make a game selection: "
                + "\n1) Reports Menu"
                + "\n2) Move Player"
                + "\n3) Pay tithing"
                + "\n4) Manage Crops"
                + "\n5) Go to fields"
                + "\n6) Admire God's Creations"
                + "\n7) Display Map"
                + "\n8) Supplies View"
                + "\n9) Save the Game"
                + "\n10) Return to Main Menu");
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();

        switch (choice) {
            case "1":
                reportsMenuView();
                break;
            case "2":
                movePlayer();
                break;
            case "3":
                tithes();
                break;
            case "4":
                getManageCropsView();
                break;
            case "5":
                goToFields();
                break;
            case "6":
                admireCreations();
                break;
            case "7":
                displayMap();
                break;
            case "8":
                suppliesView();
            case "9":
                saveGameView();
                break;
            case "10":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }
        return false;
    }
//scene of the church where you have the option to pay tithing

    private void reportsMenuView() {
        ReportsMenuView reports = new ReportsMenuView();
        reports.display();
    }
//scene of the warehouse where you can buy and sell wheat and extra supplies
//are stored
private void suppliesView(){
            SuppliesView view = new SuppliesView();
            view.display();
}      
    private void movePlayer() {
        MovePlayerView move = new MovePlayerView();
        move.display();
        displayMap();
    }
//scene of the field where you harvest and plant next years crops

    private void tithes() {
        ChurchView church = new ChurchView();
        church.display();
        System.out.println("This will take us to the church to pay tithing.");
    }
//scene of a tool shop to help you be able to plant and harvest crops    

    private void getManageCropsView() {
        ManageCropsView menu = new ManageCropsView();
        menu.display();
    }

    private void goToFields() {
        WheatFieldsView fields = new WheatFieldsView();
        fields.display();
    }
//home where the year ends and you start the next phase
//Scene for admiring God's Creations.

    private void admireCreations() {
        ForTheBeautyOfTheEarthView menu = new ForTheBeautyOfTheEarthView();
        menu.display();
    }

    public void displayMap() {
        String leftIndicator;
        String rightIndicator;
//  CreateNewGame game = GameControl.CreateNewGame.getCurrentGame(); // retreive the game
        Map map = EarlyRisers.getCurrentGame().getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        // Build the heading of the map
        System.out.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            // print col numbers to side of map
            System.out.print("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (locations[row][column] == null) {
                    // No scene assigned here so use ?? for the symbol
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator
                            + locations[row][column].getSymbol()
                            + rightIndicator);
                }
            }
            System.out.println("|");
        }
        Location currentLocation = map.getCurrentLocation();
        System.out.println("You are currently at " + currentLocation.getDescription());
        if (currentLocation.getItem() != null) {
            System.out.println("There is a " + currentLocation.getItem().getItemType() + " at this location.");
        }
        if (currentLocation.getQuestion() != null) {
            System.out.println("I have a question for you.");
            System.out.println(currentLocation.getQuestion().getQuestionText());
            System.out.println(currentLocation.getQuestion().getAnswer1());
            System.out.println(currentLocation.getQuestion().getAnswer2());
            System.out.println(currentLocation.getQuestion().getAnswer3());
            System.out.println(currentLocation.getQuestion().getAnswer4());
            System.out.println("Enter the correct answer 1-4.");
           int choice = Integer.parseInt(System.console().readLine());
          
            
        }
    }

    public void newLocation() {
        String row = getInput("Enter Row (Q to quit); ");
        if (row.toUpperCase().trim().equals("Q")) {
            System.out.println("Quitting");
            return;
        }
        String col = getInput("Enter Col (Q to quit); ");
        if (row.toUpperCase().trim().equals("Q")) {
            System.out.println("Quitting");
            return;
        }
        int iRow = -1;
        int iCol = -1;
        try {
            iRow = Integer.parseInt(row);
            iCol = Integer.parseInt(col);
        } catch (NumberFormatException e) {
            System.out.println("Invalid entry, must be a number.");
            return;
        }
    }
    
    private void saveGameView() {
        SaveGameView save = new SaveGameView();
        save.display();
    }
}
