package com.finance.exchangerateservice.app.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Eyüp Akay
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "exchange-rate")
public class ApiProperties {

    private String currencyLayerApiUrl;
    private String currencyLayerApiAccessKey;
    private String fixerApiUrl;
    private String fixerApiAccessKey;

}
