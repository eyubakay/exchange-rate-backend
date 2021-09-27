package com.finance.exchangerateservice.app.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Eyüp Akay
 */
@SpringBootTest
class ApiPropertiesTests {

    @Autowired
    ApiProperties apiProperties;

    @Test
    void test_properties_config_should_success(){
        Assertions.assertNotNull(apiProperties.getCurrencyLayerApiUrl());
        Assertions.assertNotNull(apiProperties.getCurrencyLayerApiAccessKey());
        Assertions.assertNotNull(apiProperties.getFixerApiUrl());
        Assertions.assertNotNull(apiProperties.getFixerApiAccessKey());
    }
}
