package com.integratedfinance.exchangerateservice.app.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Eyüp Akay
 */
@Data
public class ExchangeRateRequest implements Serializable {
    private String sourceCurrency;
    private String targetCurrency;
}
