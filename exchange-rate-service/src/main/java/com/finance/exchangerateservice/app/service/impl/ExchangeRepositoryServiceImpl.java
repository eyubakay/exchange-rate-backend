package com.finance.exchangerateservice.app.service.impl;

import com.finance.exchangerateservice.app.aop.annotation.Loggable;
import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
import com.finance.exchangerateservice.app.repository.ExchangeRepository;
import com.finance.exchangerateservice.app.service.ExchangeRepositoryService;
import com.finance.exchangerateservice.app.util.ModelToModelParser;
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
        return repository.getExchangeRateByDate(LocalDate.now());
    }

    @Override
    public ExchangeRate getExchangeByDate(LocalDate date) {
        return repository.getExchangeRateByDate(date);
    }
}
