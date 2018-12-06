/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

import java.util.Scanner;

/**
 *
 * @author EarlyRisers
 */
public abstract class View implements ViewInterface {
    
    protected final BufferedReader keyboard = EarlyRisers.getInFile();
    protected final PrintWriter console = EarlyRisers.getOutFile();
    @Override
    public void display() {
        boolean endView = false;
                
        do{
            String[] inputs = getInputs();
            
            if (inputs[0] == null || inputs[0] == "Q"){
                return;
            }
           try{ 
            endView = doAction(inputs);
           } catch (NumberFormatException e){
           System.out.println("Unacceptable Value. Try again.");}
        } while(endView != true);
    }

    @Override
    public String getInput(String promptMessage) {
        System.out.println(promptMessage);
        boolean valid = false;
        String input = "";
        
        while (!valid){
            input = this.keyboard.readLine();
            input = keyboard.nextLine().trim();
            
            if(input.length() < 1){
                System.out.println("You must enter a value.");
                continue;
            }
            
            valid = true;
        }
        
        return input;
    }
}
