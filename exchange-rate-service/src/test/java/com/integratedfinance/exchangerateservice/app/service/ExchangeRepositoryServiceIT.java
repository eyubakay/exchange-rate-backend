package com.integratedfinance.exchangerateservice.app.service;

import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import com.integratedfinance.exchangerateservice.app.entity.ExchangeRate;
import com.integratedfinance.exchangerateservice.app.util.ModelToModelParser;
import com.integratedfinance.exchangerateservice.app.util.PayloadUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

/**
 * @author Eyüp Akay
 */
@SpringBootTest
class ExchangeRepositoryServiceIT {

    private static final String BASE_PATH = "src/main/resources/data/";
    private static final String FILE_NAME = "base_eur.json";

    @Autowired
    ExchangeRepositoryService service;

    @Test
    void test_getLatest_success() {
        service.save(getEntity());
        ExchangeRate rate = service.getLatest();
        Assertions.assertNotNull(rate);
        Assertions.assertNotNull(rate.getBaseCurrency());
        Assertions.assertNotNull(rate.getEur());
    }

    private ExchangeRate getEntity() {
        return ModelToModelParser.parseFrom(
                Objects.requireNonNull(
                        PayloadUtil.jsonToObject(
                                PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME), ExchangeRateDto.class)));
    }
}
