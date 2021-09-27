package com.finance.exchangerateservice.app.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.finance.exchangerateservice.app.entity.ExchangeRate;

/**
 * @author Eyüp Akay
 */
public final class CurrencyConverterUtil {

    private CurrencyConverterUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static Double calculate(String source, String target, ExchangeRate exchangeRate) {

        JsonNode jsonNode = objectMapper().convertValue(ModelToModelParser.parseFrom(exchangeRate).getRates(), JsonNode.class);

        JsonNode sourceNode = jsonNode.get(source);
        JsonNode targetNode = jsonNode.get(target);

        Double sourceAmount = sourceNode.doubleValue();
        Double targetAmount = targetNode.doubleValue();

        return targetAmount /sourceAmount ;
    }

    private static ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }
}
