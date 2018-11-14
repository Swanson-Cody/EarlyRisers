/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package byui.cit260.EarlyRisers.view;
	      
	import java.util.Scanner;
	
	/**
	 *
	 * @author Heather
	 */
	public class HelpMenuView {
	    boolean exit;
            
	    
	    public HelpMenuView()  {               
	    }
            
	    public void display() {
	        printHeader();
	        while (!exit){
	            printMenu();
	            int choice = getInput();
	            doAction(choice);
	        }
	}
	   
	    //Welcome Screen
	    private void printHeader(){
	    System.out.println("+-------------------------------------------+");
	    System.out.println("|                                           |");
	    System.out.println("|              Welcome to the               |");
	    System.out.println("|                 Help Menu                 |");
	    System.out.println("|                                           |");
	    System.out.println("+-------------------------------------------+");
	    }
	    //Menu options 
	    private void printMenu(){
	    System.out.println("\nPlease make a menu selection: ");
	    System.out.println("1) Learn more about Wheat");
	    System.out.println("2) Learn more about Tithing");
	    System.out.println("3) Learn more about Land");
	    System.out.println("4) Learn more about Game Play");
	    System.out.println("5) Learn more about Scenes");
	    System.out.println("0) Exit Menu");
	    }
	    //Get number input from user 
	    private int getInput(){
	        Scanner keyboard = new Scanner(System.in);
	        int choice = -1; 
	        do{
	            System.out.print("\nEnter a Number: ");
	        try {
	            choice = Integer.parseInt(keyboard.nextLine());
	    }
	        catch (NumberFormatException e)  {
	        System.out.println("Invalid selection. Please try again.");
	    }
	        if(choice< 0 || choice > 5) {
	            System.out.println("Choice outside of range.  Please choose again.");
	        }}
	        while(choice < 0 || choice > 5);
	        return choice;
	}
	    private void doAction(int choice){
	    switch(choice){
	        case 0:
	            exit = true;
	            System.out.println("Have a good day.  Goodbye!");
	            break;
	        case 1: 
	            
	            System.out.println("\nWheat Information \nYou will start the game with an allotment of wheat."
	                + "\nEach turn you will be given the option to use wheat to feed "
	                + "\nthe people of the city and use wheat to plant crops for a fall"
	                + "\nharvest. You will also be given the opportunity to pay your"
	                + "\ntithing using your wheat. Use this resource wisely.  If you"
	                + "\ndon't feed your people enough they will starve.");
	        break;
	        case 2:
	            System.out.println("\nTithing Information \nYou will be given the opportunity each turn to "
	                + "\npay your tithing. This is not required of you, however, "
	                + "\npaying your tithing will return blessings upon you.");
	            break;
	        case 3:
	            System.out.println("\nLand Information\nYou will be given land to start the game.  "
	                + "\nYou will also be given the opportunity to purchase or sell "
	                + "\nland each round. The price of the purchase or sell will vary "
	                + "\non the round."); 
	            break;
	        case 4:
	           System.out.println("\nGame Play\nThis game will be played in 5 rounds with "
	                + "\noptional scenes that may help you along the way.  ");
	                
	            break;
	        case 5:
	             System.out.println("\nScene Information\nThis game has a total of 25 scenes and 5 rounds"
	                + " \nof play. Use your resources wisely to complete the game.");
	                
	            break;
	        default:
	            System.out.println("\nAn unknown error has occured.");
	    }
	    }
	   }
	

	
