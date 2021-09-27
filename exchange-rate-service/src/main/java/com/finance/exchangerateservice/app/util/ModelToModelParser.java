package com.finance.exchangerateservice.app.util;

import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
import com.finance.exchangerateservice.app.model.Rates;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

/**
 * @author Eyüp Akay
 */
@Slf4j
public final class ModelToModelParser {

    private ModelToModelParser() {
        throw new IllegalStateException("Utility class");
    }

    public static ExchangeRate parseFrom(ExchangeRateDto exchangeRate) {

        String rates = PayloadUtil.objectToJson(exchangeRate.getRates());

        ExchangeRate result = PayloadUtil.jsonToObject(rates, ExchangeRate.class);

        result.setBaseCurrency(exchangeRate.getBaseCurrency());
        result.setTimestamp(exchangeRate.getTimestamp());
        result.setDate(LocalDate.parse(exchangeRate.getDate()));

        return result;
    }

    public static ExchangeRateDto parseFrom(ExchangeRate exchangeRate) {
        String exc = PayloadUtil.objectToJson(exchangeRate);

        Rates rates = PayloadUtil.jsonToObject(exc, Rates.class);
        ExchangeRateDto result = new ExchangeRateDto();
        result.setRates(rates);
        result.setBaseCurrency(exchangeRate.getBaseCurrency());
        result.setTimestamp(exchangeRate.getTimestamp());
        result.setDate(exchangeRate.getDate().toString());

        return result;
    }

}
