/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import byui.cit260.EarlyRisers.control.BuyLand;
import byui.cit260.EarlyRisers.control.WheatEaten;
import java.util.Scanner;

/**
 *
 * @author rache
 */
public class BuyLandView {
    
    boolean exit;

    private static void wheatEatenwheatEaten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayBuyLandHeader() {
        System.out.println("You currently have ");
        System.out.println("How much land would you like to buy?");

    }
    
    public void runBuyLandMenu(){
        displayBuyLandHeader();
        while(!exit){
            printBuyLandMenu();
            String choice = getInput();
            doAction(choice);
        }
    }

    private static BuyLand goToBuyLand() {
        BuyLand buyTheLand = new BuyLand();
        buyTheLand.buyLand();
        return buyTheLand;
    }
    
    private static WheatEaten goToWheatEaten(){
        WheatEaten wheatEaten = new WheatEaten();
        wheatEatenwheatEaten();
        return wheatEaten;
    }

    private void printBuyLandMenu() {
        boolean done = false;

        do {
            System.out.println("B: Buy more Land");
            System.out.println("C: Check how much land you already have");
            System.out.println("R: Check how much wheat was eaten by rats");
            System.out.println("G: Go back to game menu");

            String input = getInput();
            done = doAction(input);
        } while (!done);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "G":
                System.out.println("If you don't buy land your people might die.");
                return true;
            case "B":
                goToBuyLand();
                break;
            case "C":
                System.out.println("You currently have ");
                break;
            case "R":
                goToWheatEaten();
                break;
            default:
                System.out.println("/nInvalid selection.");
                
        }
        return false;
    }
}
