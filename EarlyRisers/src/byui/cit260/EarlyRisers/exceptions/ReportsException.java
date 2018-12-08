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
public class ReportsException extends Exception{

    public ReportsException() {
    }
     public ReportsException(String message) {
        super(message);
    }

    public ReportsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportsException(Throwable cause) {
        super(cause);
    }

    public ReportsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
