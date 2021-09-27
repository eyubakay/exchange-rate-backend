package com.integratedfinance.exchangerateservice.app.util;

import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

/**
 * @author Eyüp Akay
 */
class PayloadUtilTests {

    private static final String BASE_PATH = "src/test/resources/data/";
    private static final String FILE_NAME = "base_eur.json";

    @Test
    void test_readFileFromPath_success() {
        String context = PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME);
        Assertions.assertNotNull(context);
    }

    @Test
    void test_jsonToObject_success() {
        ExchangeRateDto exchangeRate = PayloadUtil.jsonToObject(PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME), ExchangeRateDto.class);
        Assertions.assertNotNull(exchangeRate);
    }

    @Test
    void test_savePayload_success() throws IOException {
        PayloadUtil.savePayload(PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME));
        String savedPayload = PayloadUtil.readFileFromPath(BASE_PATH, "base_eur_" + LocalDate.now() + ".json" );
        ExchangeRateDto savedDto = PayloadUtil.jsonToObject(savedPayload, ExchangeRateDto.class);
        Assertions.assertNotNull(savedDto);
        Assertions.assertNotNull(savedDto.getBaseCurrency());
        Assertions.assertNotNull(savedDto.getDate());
        Assertions.assertNotNull(savedDto.getTimestamp());
        Assertions.assertNotNull(savedDto.getRates());
        Assertions.assertNotNull(savedDto.getRates().getEur());
    }

    @Test
    @Disabled
    void test_savePayloadObject_success() throws IOException {
        PayloadUtil.savePayload(PayloadUtil.jsonToObject(PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME), ExchangeRateDto.class));
        String savedPayload = PayloadUtil.readFileFromPath(BASE_PATH, "base_eur_" + LocalDate.now() + ".json" );
        ExchangeRateDto savedDto = PayloadUtil.jsonToObject(savedPayload, ExchangeRateDto.class);
        Assertions.assertNotNull(savedDto);
    }

}
