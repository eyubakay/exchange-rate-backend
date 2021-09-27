package com.finance.exchangerateservice.app.controller;

import com.finance.exchangerateservice.app.aop.annotation.DailyExchange;
import com.finance.exchangerateservice.app.aop.annotation.Loggable;
import com.finance.exchangerateservice.app.api.ExchangeApi;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
import com.finance.exchangerateservice.app.exception.RecordNotFoundException;
import com.finance.exchangerateservice.app.model.ExchangeRateRequest;
import com.finance.exchangerateservice.app.model.ExchangeRateResponse;
import com.finance.exchangerateservice.app.service.ExchangeRepositoryService;
import com.finance.exchangerateservice.app.util.CurrencyConverterUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author Eyüp Akay
 */
@RestController
@Slf4j
public class ExchangeApiController implements ExchangeApi {

    @Autowired
    ExchangeRepositoryService exchangeRepositoryService;

    @Override
    @DailyExchange
    @Loggable
    public ResponseEntity<ExchangeRateResponse> getExchangeRate(ExchangeRateRequest request) {
        ExchangeRate latestRate = exchangeRepositoryService.getLatest();

        if (Objects.isNull(request.getSourceCurrency()) || Objects.isNull(request.getTargetCurrency())) {
            log.info("PARAMETERS CANNOT BE EMPTY");
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        if (Objects.isNull(latestRate)) {
            throw new RecordNotFoundException("Unexpectedly failed due to cannot find exchange rate record");
        }
        ExchangeRateResponse response = new ExchangeRateResponse();
        response.setExchangeRateDate(latestRate.getDate());
        response.setSourceCurrency(request.getSourceCurrency());
        response.setTargetCurrency(request.getTargetCurrency());
        response.setExchangeRateDate(latestRate.getDate());
        response.setExchangeRateAmount(CurrencyConverterUtil.calculate(request.getSourceCurrency(), request.getTargetCurrency(), latestRate));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
