/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
//import byui.cit260.EarlyRisers.model.Player;

import byui.cit260.EarlyRisers.model.Question;
import byui.cit260.EarlyRisers.main.EarlyRisers;
import byui.cit260.EarlyRisers.model.Game;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import byui.cit260.EarlyRisers.model.InventoryItem;

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
                + "\n1) Display Map"
                + "\n2) Move Player"
                + "\n3) Admire God's Creations"
                + "\n4) Save the Game"
                + "\n5) Return to Main Menu");
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();

        switch (choice) {
            case "1":
//                reportsMenuView();
                displayMap();
                break;
            case "2":
                movePlayer();
                break;
            case "3":
//                tithes();
                admireCreations();
                break;
            case "4":
//                getManageCropsView();
                saveGameView();
                break;
            case "5":
//                goToFields();
                goToMainMenu();
//                break;
//            case "6":
//                admireCreations();
//                break;
//            case "7":
//                displayMap();
//                break;
//            case "8":
//                suppliesView();
//                break;
//            case "9":
//                saveGameView();
//                break;
//            case "10":
//                goToMainMenu();
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

    private void suppliesView() {
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
        this.console.println("This will take us to the church to pay tithing.");
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
        Question question;
        Game game = EarlyRisers.getCurrentGame();
        // Build the heading of the map
        this.console.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            // print col numbers to side of map
            this.console.print("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            this.console.print(row + " "); // print row numbers to side of map
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
                this.console.print("|"); // start map with a |
                if (locations[row][column] == null) {
                    // No scene assigned here so use ?? for the symbol
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator
                            + locations[row][column].getSymbol()
                            + rightIndicator);
                }
            }
            this.console.println("|");
        }
        Location currentLocation = map.getCurrentLocation();
        this.console.println("You are currently at " + currentLocation.getDescription());
        
            if (map.getCurrentLocation().isLocVisited()) {
                return;
            }
            do {
            if (currentLocation.getItem() != null) {
                this.console.println("There is a " + currentLocation.getItem().getItemType() + " at this location.");
            }
            if (currentLocation.getQuestion() != null) {
                question = currentLocation.getQuestion();
                this.console.println("I have a question for you.");
                this.console.println(question.getQuestionText());
                this.console.println(question.getAnswer1());
                this.console.println(question.getAnswer2());
                this.console.println(question.getAnswer3());
                this.console.println(question.getAnswer4());
                Scanner scanner = new Scanner(System.in);
                this.console.println("Enter the correct answer 1-4.");
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);
                
                if (number != (currentLocation.getQuestion().getCorrectAnswer())) {
                    int numWrong = game.getTotalWrongAnswers();
                    this.console.println("That is not correct!  The answer is " + currentLocation.getQuestion().getCorrectAnswer());
                    game.setTotalWrongAnswers(numWrong + 1);
                    numWrong = game.getTotalWrongAnswers();
                    this.console.println("***Careful, you have gotten " + numWrong + " wrong answer(s) so far. If you get " + (4 - numWrong) + " more you will lose the game.***");

                    if (numWrong > 3){
                        this.console.println("I am sorry.  You have failed the game due to getting more than 3 questions wrong.  Please try again.");
                        System.exit(0);
                    }
                }
                if (number <= 0) {
                    this.console.println("That is not a valid number");
                }
                if (number >= 5) {
                    this.console.println("That is not a valid number");
                } 
                else if (number == (currentLocation.getQuestion().getCorrectAnswer())) {
                    map.getCurrentLocation().setVisited(true);
                    int tp = game.getTotalPoints();
                    int pt = question.getPoints();
                    this.console.println("That is the correct answer! You have earned " + pt + " points.");
                    
                    tp = tp + pt;
                    game.setTotalPoints(tp);
                    currentLocation.setQuestion(null);
                    if (tp >= 80) {
                        this.console.println("Congrats!  You are smart and know the history of the City of Aaron."
                                + "Please come back and play again ");
                        ReportsMenuView reports = new ReportsMenuView();
                        reports.viewReports();
                        reports.viewPoints();
                        System.exit(0);
                    }
                }
            }

        } while (map.getCurrentLocation().isVisited() != true);
    }

    public void newLocation() {
        String row = getInput("Enter Row (Q to quit); ");
        if (row.toUpperCase().trim().equals("Q")) {
            this.console.println("Quitting");
            return;
        }
        String col = getInput("Enter Col (Q to quit); ");
        if (row.toUpperCase().trim().equals("Q")) {
            this.console.println("Quitting");
            return;
        }
        int iRow = -1;
        int iCol = -1;
        try {
            iRow = Integer.parseInt(row);
            iCol = Integer.parseInt(col);
        } catch (NumberFormatException e) {
            this.console.println("Invalid entry, must be a number.");
            return;
        }
    }

    private void saveGameView() {
        SaveGameView save = new SaveGameView();
        save.display();
    }
    
    private void goToMainMenu(){
        MainMenuView menu = new MainMenuView();
        menu.display();
    }
}
