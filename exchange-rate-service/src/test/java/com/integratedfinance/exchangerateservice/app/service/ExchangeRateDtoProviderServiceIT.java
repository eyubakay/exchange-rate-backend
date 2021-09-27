package com.integratedfinance.exchangerateservice.app.service;

import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Eyüp Akay
 */
@SpringBootTest
class ExchangeRateDtoProviderServiceIT {

    @Autowired
    ExchangeRateProviderService service;

    @Test
    void test_getExchangeRate_should_return_response(){
        ExchangeRateDto exchangeRate = service.getExchangeRate();
        Assertions.assertNotNull(exchangeRate);
    }
}
