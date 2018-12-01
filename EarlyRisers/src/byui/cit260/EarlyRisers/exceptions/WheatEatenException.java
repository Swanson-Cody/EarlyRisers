/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.exceptions;

/**
 *
 * @author Heather
 */
public class WheatEatenException extends Exception {

    public WheatEatenException() {
    }

    public WheatEatenException(String message) {
        super(message);
    }

    public WheatEatenException(String message, Throwable cause) {
        super(message, cause);
    }

    public WheatEatenException(Throwable cause) {
        super(cause);
    }

    public WheatEatenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
