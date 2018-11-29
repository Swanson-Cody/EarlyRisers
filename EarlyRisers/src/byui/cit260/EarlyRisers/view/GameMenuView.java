/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;
//import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.control.GameControl;
import byui.cit260.EarlyRisers.control.MapControl;
import byui.cit260.EarlyRisers.control.BuyLand;
import byui.cit260.EarlyRisers.main.Game;
import byui.cit260.EarlyRisers.model.CreateNewGame;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;


import java.util.Scanner;

/**
 *
 * 
 */
public class GameMenuView extends View{
            //Menu options 
      //Get number input from user 
    @Override
    public String[] getInputs(){
        String[] inputs = new String[10];
        String selection = this.getInput(

    "\n+-------------------------------------------+" +
    "\n|                                           |" +
    "\n|                Welcome to                 |" +
    "\n|         Game of the City of Aaron         |" +
    "\n|                                           |" +
    "\n+-------------------------------------------+" +
	    
 "\nYou have been elected the leader of the City of Aaron." +
            "\nYou are starting the game with the population of 100 people." +
            "\nYou are the ruler and must make wise choices to provide for the" +
            "\nneeds of your people.  You will start the game with 2800 bushels" +
            "\nof wheat to feed your people, use as currency or plant the next" +
            "\nharvest. You will also have the opportunity to buy tools and pay" +
            "\ntithes to the church. Use all your resources well. " +
            "\nEach turn you will use the options below to complete the time" +
            "\nperiod." + 
           
    "\n\nPlease make a game selection: " +
    "\n1) Reports Menu" +
    "\n2) Buy/Sell Tools" +
    "\n3) Pay tithing" +
    "\n4) Manage Crops" +
    "\n5) Go to fields" +
    "\n6) Admire God's Creations" +
    "\n8) Display Map" +
    "\n9) Go home"); 
        inputs [0] = selection;
        return inputs;
    }
@Override
    public boolean doAction(String[] input){
        String choice = input[0].toUpperCase();

    switch(choice){
        case "1":
            getReportsMenuView();
            break;
        case "2":
            tools();
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
            home();
            break;
        default:
            System.out.println("\nInvalid selection.");
    }
    return false;
    }
//scene of the church where you have the option to pay tithing
    private void getReportsMenuView(){
        ReportsMenuView menu = new ReportsMenuView();
        menu.display();
    }
//scene of the warehouse where you can buy and sell wheat and extra supplies
//are stored
    private void tools(){
        GameMenuView game = new GameMenuView();
        game.display();  
      
    }
//scene of the field where you harvest and plant next years crops
    private void tithes(){
        ChurchView church = new ChurchView();
        church.display();
        System.out.println("This will take us to the church to pay tithing.");
    }
//scene of a tool shop to help you be able to plant and harvest crops    
    private void getManageCropsView(){
        ManageCropsView menu = new ManageCropsView();
        menu.display();
    }
    
    private void goToFields(){
        WheatFieldsView fields = new WheatFieldsView();
        fields.display();
}
//home where the year ends and you start the next phase
    private void home(){
       MainMenuView menu = new MainMenuView();
       menu.display();
               
    }
//Scene for admiring God's Creations.
    private void admireCreations(){
        ForTheBeautyOfTheEarthView menu = new ForTheBeautyOfTheEarthView();
        menu.display();
    }
    public void displayMap() {
  String leftIndicator;
  String rightIndicator;
//  CreateNewGame game = GameControl.CreateNewGame.getCurrentGame(); // retreive the game
  Map map = Game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    System.out.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      System.out.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
    System.out.println();
    for( int row = 0; row < locations.length; row++){
     System.out.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
        // set default indicators as blanks
        leftIndicator = " ";
        rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].isVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       System.out.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             System.out.print(leftIndicator + "??" + rightIndicator);
        }
        else
          System.out.print(leftIndicator
//             + locations[row][column].getScene().getMapSymbol()
             + rightIndicator);
      }
     System.out.println("|");
    }
 }
    public void newLocation(){
    String row = getInput("Enter Row (Q to quit); ");
    if (row.toUpperCase().trim().equals("Q")){
    System.out.println("Quitting");
    return;}
     String col = getInput("Enter Col (Q to quit); ");
    if (row.toUpperCase().trim().equals("Q")){
    System.out.println("Quitting");
    return;}
    int iRow = -1;
    int iCol = -1;
    try{
        iRow = Integer.parseInt(row);
        iCol = Integer.parseInt(col);}
    catch (NumberFormatException e){
    System.out.println("Invalid entry, must be a number.");
    return;
    }
    }
}
