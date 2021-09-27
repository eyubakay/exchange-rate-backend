package com.finance.exchangerateservice.app.util;

import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Eyüp Akay
 */
class CurrencyConverterUtilTests {

    private static final String BASE_PATH = "src/test/resources/data/";
    private static final String FILE_NAME = "base_eur.json";

    @Test
    void test_converter() {
        ExchangeRateDto dto = PayloadUtil.jsonToObject(PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME), ExchangeRateDto.class);
        ExchangeRate rate = ModelToModelParser.parseFrom(dto);
        Double amount = CurrencyConverterUtil.calculate("USD", "TRY", rate);

        Assertions.assertNotNull(amount);
    }
}
