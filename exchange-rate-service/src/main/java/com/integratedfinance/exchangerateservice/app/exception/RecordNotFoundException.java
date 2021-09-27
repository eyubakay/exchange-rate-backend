package com.integratedfinance.exchangerateservice.app.exception;

/**
 * @author Eyüp Akay
 */
public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String message) {
        super(message);
    }
}
