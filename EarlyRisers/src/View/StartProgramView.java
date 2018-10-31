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
public class StartProgramView {
    public StartProgramView(){
   displayStartProgramView() {
        endOfView = false
        DO
                input = getInput()
                IF no inputs were entered OR the first input is Q
                    RETURN
        ENDIF
        endOfView = doAction (inputs)
        WHILE endOfView != true
    }
   
        
    }
}
