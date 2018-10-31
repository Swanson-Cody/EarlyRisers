/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
      
/**
 *
 * @author Heather
 */
public class HelpMenuView {
    boolean exit;
    
    public static void main (String[]args)  {
        HelpMenuView menu = new HelpMenuView();
        menu.runMenu();
        
    }
    public void runMenu() {
        printHeader();
        while (!exit){
            printMenu();
            int choice = getInput();}
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
    System.out.println("#1) Learn more about Wheat");
    System.out.println("#2) Learn more about Tithing");
    System.out.println("#3) Learn more about Land");
    System.out.println("#4) Learn more about Game Play");
    System.out.println("#5) Learn more about Scenes");
    System.out.println("#0) Exit Menu");
    }
    
    private int getInput(){
        Scanner kb = new Scanner(System.in);
        int choice = -1; 
    while (choice <0 || choice >5){
    try {
        System.out.print ("\Enter your choice: ");
        choice = Interger.parseInt (kb.nextLine());
    }
    catch (NumberFormatException e)  {
    System.out.println("Invalid selection. Please try again.");
    }
    }
    return choice;
}
}
