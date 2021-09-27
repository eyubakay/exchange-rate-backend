package com.finance.exchangerateservice.app.controller;

import com.finance.exchangerateservice.app.model.ExchangeRateRequest;
import com.finance.exchangerateservice.app.model.ExchangeRateResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author Eyüp Akay
 */
@SpringBootTest
@Disabled //TODO
class ExchangeApiControllerIT {
    private static final String BASE_URL = "http://localhost:8081/exchange-rate-app/api/v1";

    @Test
    void test_retrieve_exchange_amount() {

        String source = "TRY";
        String target = "USD";

        HttpHeaders headers = new HttpHeaders();

        ExchangeRateRequest requestModel = new ExchangeRateRequest();
        requestModel.setSourceCurrency(source);
        requestModel.setTargetCurrency(target);

        HttpEntity<String> request = new HttpEntity<String>(requestModel.toString(), headers);
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<ExchangeRateResponse> response = restTemplate.exchange(
                BASE_URL + "/exchange/rate",
                HttpMethod.GET,
                request,
                ExchangeRateResponse.class);

        Assertions.assertNotNull(response);
    }
}
