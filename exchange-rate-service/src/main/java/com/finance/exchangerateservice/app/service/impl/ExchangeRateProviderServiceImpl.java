package com.finance.exchangerateservice.app.service.impl;

import com.finance.exchangerateservice.app.aop.annotation.Loggable;
import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.config.ApiProperties;
import com.finance.exchangerateservice.app.exception.ExternalServiceException;
import com.finance.exchangerateservice.app.service.ExchangeRateProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Eyüp Akay
 */
@Service
@Loggable
public class ExchangeRateProviderServiceImpl implements ExchangeRateProviderService {

    private static final String ACCESS_KEY_PARAM = "access_key";

    @Autowired
    ApiProperties apiProperties;

    @Override
    public ExchangeRateDto getExchangeRate() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<ExchangeRateDto> response = restTemplate.exchange(
                getApiUrl(),
                HttpMethod.GET,
                entity,
                ExchangeRateDto.class);

        if ( Objects.isNull(response.getBody()) ) {
            //TODO get message
            throw new ExternalServiceException("message");
        }

        return response.getBody();
    }

    @Override
    public String getExchangeRateJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<String> response = restTemplate.exchange(
                getApiUrl(),
                HttpMethod.GET,
                entity,
                String.class);

        if ( Objects.isNull(response.getBody()) ) {
            //TODO get message
            throw new ExternalServiceException("message");
        }

        return response.getBody();
    }

    private String getApiUrl() {
        // the access key has 250 request for each api, this control is to increase the usage of both concurrently to 500..
        if (LocalDate.now().getDayOfMonth() % 2 == 1) {

            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(apiProperties.getFixerApiUrl())
                    .queryParam(ACCESS_KEY_PARAM, apiProperties.getFixerApiAccessKey());
            return builder.toUriString();
        }

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(apiProperties.getCurrencyLayerApiUrl())
                .queryParam(ACCESS_KEY_PARAM, apiProperties.getCurrencyLayerApiAccessKey());

        return builder.toUriString();
    }
}
