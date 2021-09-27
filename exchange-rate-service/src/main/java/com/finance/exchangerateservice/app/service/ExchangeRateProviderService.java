package com.finance.exchangerateservice.app.service;

import com.finance.exchangerateservice.app.dto.ExchangeRateDto;

/**
 * @author Eyüp Akay
 */
public interface ExchangeRateProviderService {
    ExchangeRateDto getExchangeRate();
    String getExchangeRateJson();
}
