package com.finance.exchangerateservice.app.service;

import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.entity.ExchangeRate;

import java.time.LocalDate;

/**
 * @author Eyüp Akay
 */
public interface ExchangeRepositoryService {

    ExchangeRate save(ExchangeRate exchangeRate);

    ExchangeRate save(ExchangeRateDto exchangeRateDto);

    ExchangeRate getLatest();

    ExchangeRate getExchangeByDate(LocalDate date);

}
