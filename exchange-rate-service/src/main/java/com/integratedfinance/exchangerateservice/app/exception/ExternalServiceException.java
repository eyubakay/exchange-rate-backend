package com.integratedfinance.exchangerateservice.app.exception;

/**
 * @author Eyüp Akay
 */
public class ExternalServiceException extends RuntimeException {

    public ExternalServiceException(String message) {
        super(message);
    }
}
