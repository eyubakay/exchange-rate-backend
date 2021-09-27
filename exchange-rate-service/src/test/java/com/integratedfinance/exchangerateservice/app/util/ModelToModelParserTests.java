package com.integratedfinance.exchangerateservice.app.util;

import com.integratedfinance.exchangerateservice.app.entity.ExchangeRate;
import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import com.integratedfinance.exchangerateservice.app.service.ExchangeRepositoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Eyüp Akay
 */
@ExtendWith(MockitoExtension.class)
class ModelToModelParserTests {

    private static final String BASE_PATH = "src/main/resources/data/";
    private static final String FILE_NAME = "base_eur.json";

    @Mock
    ExchangeRepositoryService exchangeRepositoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void test_parse_to_dto() {

        ExchangeRateDto dto = PayloadUtil.jsonToObject(PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME), ExchangeRateDto.class);

        assert dto != null;
        ExchangeRate rate = ModelToModelParser.parseFrom(dto);
        Assertions.assertNotNull(dto);
        Assertions.assertNotNull(rate);
        Assertions.assertNotNull(rate.getTimestamp());
        Assertions.assertNotNull(rate.getDate());
        Assertions.assertNotNull(rate.getBaseCurrency());
        Assertions.assertEquals(rate.getBaseCurrency(), dto.getBaseCurrency());

    }

    @Test
    void test_parse_dto_to_entity() {

        ExchangeRateDto dto = PayloadUtil.jsonToObject(PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME), ExchangeRateDto.class);
        ExchangeRate mockRate = ModelToModelParser.parseFrom(dto);
        Mockito.when(exchangeRepositoryService.getLatest()).thenReturn(mockRate);

        ExchangeRate entity = exchangeRepositoryService.getLatest();

        ExchangeRateDto rate = ModelToModelParser.parseFrom(entity);
        Assertions.assertNotNull(entity);
        Assertions.assertNotNull(rate);
        Assertions.assertNotNull(rate.getTimestamp());
        Assertions.assertNotNull(rate.getDate());
        Assertions.assertNotNull(rate.getBaseCurrency());

    }
}
