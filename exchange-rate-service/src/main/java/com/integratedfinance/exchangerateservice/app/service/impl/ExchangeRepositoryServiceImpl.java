package com.integratedfinance.exchangerateservice.app.service.impl;

import com.integratedfinance.exchangerateservice.app.aop.annotation.Loggable;
import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import com.integratedfinance.exchangerateservice.app.entity.ExchangeRate;
import com.integratedfinance.exchangerateservice.app.repository.ExchangeRepository;
import com.integratedfinance.exchangerateservice.app.service.ExchangeRepositoryService;
import com.integratedfinance.exchangerateservice.app.util.ModelToModelParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author Eyüp Akay
 */
@Service
@Loggable
public class ExchangeRepositoryServiceImpl implements ExchangeRepositoryService {

    @Autowired
    ExchangeRepository repository;

    @Override
    public ExchangeRate save(ExchangeRate exchangeRate) {
        return repository.save(exchangeRate);
    }

    @Override
    public ExchangeRate save(ExchangeRateDto exchangeRateDto) {
        return repository.save(ModelToModelParser.parseFrom(exchangeRateDto));
    }

    @Override
    public ExchangeRate getLatest() {
        return repository.getLatest(LocalDate.now());
    }
}
