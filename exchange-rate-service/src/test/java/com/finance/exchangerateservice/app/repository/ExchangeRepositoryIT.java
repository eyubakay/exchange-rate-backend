package com.finance.exchangerateservice.app.repository;

import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
import com.finance.exchangerateservice.app.util.ModelToModelParser;
import com.finance.exchangerateservice.app.util.PayloadUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Eyüp Akay
 */
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ExchangeRepositoryIT {
    private static final String BASE_PATH = "src/test/resources/data/";
    private static final String FILE_NAME = "base_eur.json";

    @Autowired
    ExchangeRepository repository;

    @BeforeEach
    void setUp() {
        repository.deleteAll();
    }

    @Test
    void test_repository_persist(){

        ExchangeRateDto dto = PayloadUtil.jsonToObject(getPayload(), ExchangeRateDto.class);
        assert dto != null;
        repository.save(ModelToModelParser.parseFrom(dto));
        List<ExchangeRate> result = repository.findAll();
        Assertions.assertNotNull(result);
    }

    private String getPayload() {
        return PayloadUtil.readFileFromPath(BASE_PATH, FILE_NAME);
    }

}
