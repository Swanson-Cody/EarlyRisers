/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Heather
 */
public class PopulationException extends Exception {

    public PopulationException() {
    }

    public PopulationException(String message) {
        super(message);
    }

    public PopulationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PopulationException(Throwable cause) {
        super(cause);
    }

    public PopulationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
