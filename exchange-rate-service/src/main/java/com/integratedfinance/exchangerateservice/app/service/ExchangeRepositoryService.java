package com.integratedfinance.exchangerateservice.app.service;

import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import com.integratedfinance.exchangerateservice.app.entity.ExchangeRate;

/**
 * @author Eyüp Akay
 */
public interface ExchangeRepositoryService {

    ExchangeRate save(ExchangeRate exchangeRate);

    ExchangeRate save(ExchangeRateDto exchangeRateDto);

    ExchangeRate getLatest();

}
