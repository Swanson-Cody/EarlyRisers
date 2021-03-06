/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import java.util.Scanner;
import byui.cit260.EarlyRisers.control.GameControl;


/**
 *
 * @author Heather
 */
public class ToolShopView extends View {

    public ToolShopView() {
        double plow;
        double horse;
        double shovel;
        double scythe;
        double oxen;
    }
//      public void display() {
//        this.printHeader();
//        this.getPlayer();
//        MainMenuView menu = new MainMenuView();
//        menu.display();        
//}              
    //Menu options

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
                "\n+-------------------------------------------+"
                + "\n|                                           |"
                + "\n|              Welcome to the               |"
                + "\n|                 Tool Shop                 |"
                + "\n|                                           |"
                + "\n+-------------------------------------------+"
                + "\n\n1: Buy a Plow 20 wheat "
                + "\n2:Buy a Horse 100 wheat"
                + "\n3:Buy a Ox 120 wheat"
                + "\n4:Buy a Scythe 20 wheat"
                + "\n5:Buy a Shovel 5 wheat"
                + "\n6:Sell a Plow 5 wheat"
                + "\n7:Sell a Horse 20 wheat"
                + "\n8:Sell a Ox 30 wheat"
                + "\n9:Sell a Scythe 5 wheat"
                + "\n10:Sell a Shovel 1 wheat"
                + "\n11:Go to Main Menu");
        inputs[0] = selection;
        return inputs;
    }

    //Get number input from user 
    @Override
    public boolean doAction(String[] input) {
        String choice = input[0].toUpperCase();
        choice = choice.toUpperCase();
   
       switch (choice) {
           case "1":
                buyPlow();
                break;
          case "2":
               buyHorse();
              break;
          case "3":
              buyOx();
               break;
            case "4":
                buyScythe();
                break;
            case "5":
                buyShovel();
                break;
            case "6":
                sellPlow();
                break;
            case "7":
                sellHorse();
                break;
            case "8":
                sellOx();
                break;
            case "9":
                sellScythe();
                break;
            case "10":
                sellShovel();
                break;
            case "11":
               return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection");
        }
        return false;
    }

    private void buyPlow() {
        
        this.console.println("Congradulations.  You have purchased a plow to help "
                + "in your harvest.");
    }

    private void buyHorse() {
        this.console.println("Congradulations.  You have purchased a plow to help "
                + "in your fields.");
    }

    private void buyScythe() {
        this.console.println("Congradulations.  You have purchased a plow to help "
                + "in your harvest.");
    }

    private void buyShovel() {
        this.console.println("Congradulations.  You have purchased a plow to help "
                + "in your planting.");
    }

    private void buyOx() {
        this.console.println("Congradulations.  You have purchased a plow to help "
                + "in your fields.");
    }

    private void sellPlow() {
        this.console.println("You have successfully sold your Plow.");
    }

    private void sellHorse() {
        this.console.println("You have successfully sold your Horse.");
    }

    private void sellOx() {
        this.console.println("You have successfully sold your Ox.");
    }

    private void sellScythe() {
        this.console.println("You have successfully sold your Scythe.");
    }

    private void sellShovel() {
        this.console.println("You have successfully sold your Shovel.");
    }

}
