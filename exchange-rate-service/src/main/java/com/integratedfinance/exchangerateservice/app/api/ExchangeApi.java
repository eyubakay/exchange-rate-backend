package com.integratedfinance.exchangerateservice.app.api;

import com.integratedfinance.exchangerateservice.app.model.ExchangeRateRequest;
import com.integratedfinance.exchangerateservice.app.model.ExchangeRateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Eyüp Akay
 */
@RequestMapping("/exchange")
public interface ExchangeApi {

    @GetMapping(value = "/rate")
    ResponseEntity<ExchangeRateResponse> getExchangeRate(@RequestBody ExchangeRateRequest request);

}
