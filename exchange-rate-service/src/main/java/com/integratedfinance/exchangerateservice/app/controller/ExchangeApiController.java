package com.integratedfinance.exchangerateservice.app.controller;

import com.integratedfinance.exchangerateservice.app.aop.annotation.DailyExchange;
import com.integratedfinance.exchangerateservice.app.api.ExchangeApi;
import com.integratedfinance.exchangerateservice.app.entity.ExchangeRate;
import com.integratedfinance.exchangerateservice.app.model.ExchangeRateRequest;
import com.integratedfinance.exchangerateservice.app.model.ExchangeRateResponse;
import com.integratedfinance.exchangerateservice.app.service.ExchangeRepositoryService;
import com.integratedfinance.exchangerateservice.app.util.CurrencyConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author Eyüp Akay
 */
@RestController
public class ExchangeApiController implements ExchangeApi {

    @Autowired
    ExchangeRepositoryService exchangeRepositoryService;

    @Override
    @DailyExchange
    public ResponseEntity<ExchangeRateResponse> getExchangeRate(ExchangeRateRequest request) {
        ExchangeRate latestRate = exchangeRepositoryService.getLatest();

        if (Objects.isNull(latestRate) || Objects.isNull(request.getSourceCurrency()) || Objects.isNull(request.getTargetCurrency())) {
            throw new RuntimeException(); //TODO
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
