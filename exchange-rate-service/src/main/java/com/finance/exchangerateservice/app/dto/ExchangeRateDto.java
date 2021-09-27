package com.finance.exchangerateservice.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.finance.exchangerateservice.app.model.Rates;
import lombok.Data;
import lombok.ToString;


/**
 * @author Eyüp Akay
 */
@Data
@ToString
public class ExchangeRateDto {

    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("base")
    private String baseCurrency;
    @JsonProperty("date")
    private String date;
    @JsonProperty("rates")
    private Rates rates;

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}
