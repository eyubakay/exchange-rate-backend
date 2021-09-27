package com.integratedfinance.exchangerateservice.app.service;

import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;

/**
 * @author Eyüp Akay
 */
public interface ExchangeRateProviderService {
    ExchangeRateDto getExchangeRate();
    String getExchangeRateJson();
}
