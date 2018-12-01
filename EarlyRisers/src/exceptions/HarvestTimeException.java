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
public class HarvestTimeException extends Exception {

    public HarvestTimeException() {
    }

    public HarvestTimeException(String message) {
        super(message);
    }

    public HarvestTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HarvestTimeException(Throwable cause) {
        super(cause);
    }

    public HarvestTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
