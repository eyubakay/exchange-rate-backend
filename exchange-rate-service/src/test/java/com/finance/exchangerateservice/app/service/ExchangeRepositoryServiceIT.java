package com.finance.exchangerateservice.app.service;

import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
import com.finance.exchangerateservice.app.repository.ExchangeRepository;
import com.finance.exchangerateservice.app.util.ModelToModelParser;
import com.finance.exchangerateservice.app.util.PayloadUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

/**
 * @author Eyüp Akay
 */
@SpringBootTest
class ExchangeRepositoryServiceIT {

    private static final String BASE_PATH = "src/test/resources/data/";
    private static final String FILE_NAME = "base_eur.json";

    @Autowired
    ExchangeRepositoryService service;

    @Autowired
    ExchangeRepository repository;

    @BeforeEach
    void setUp() {
        repository.deleteAll();
    }

    @Test
    void test_getLatest_success() {
        ExchangeRate exchangeRate = getExchangeRate();
        service.save(exchangeRate);
        ExchangeRate rate = service.getExchangeByDate(exchangeRate.getDate());
        Assertions.assertNotNull(rate);
        Assertions.assertNotNull(rate.getBaseCurrency());
        Assertions.assertNotNull(rate.getEur());
    }

    private ExchangeRate getExchangeRate() {
        return ModelToModelParser.parseFrom(
                Objects.requireNonNull(
                        PayloadUtil.jsonToObject(
                                PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME), ExchangeRateDto.class)));
    }
}
