package com.integratedfinance.exchangerateservice.app.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Eyüp Akay
 */
@Data
public class ExchangeRateResponse implements Serializable {
    private String sourceCurrency;
    private String targetCurrency;
    private Double exchangeRateAmount;
    private LocalDate exchangeRateDate;

}
