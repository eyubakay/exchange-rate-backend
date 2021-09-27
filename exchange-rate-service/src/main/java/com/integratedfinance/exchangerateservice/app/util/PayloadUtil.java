package com.integratedfinance.exchangerateservice.app.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author Eyüp Akay
 */
@Slf4j
public final class PayloadUtil {

    private static final String BASE_PATH = "src/main/resources/data/";

    private PayloadUtil() {
        throw new IllegalStateException("PayloadUtil is a Utility class");
    }

    public static String readFileFromPath(String filePath, String fileName) {
        String jsonData = null;
        try ( Stream<String> stream = Files.lines(Paths.get(filePath + fileName))) {
            jsonData = stream
                    .map(String::trim)
                    .collect(Collectors.joining());
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return jsonData;
    }

    public static <T> T jsonToObject(String json, Class<T> clazz) {

        try {
            return objectMapper().readValue(json, clazz);
        } catch (JsonProcessingException ex) {
            log.error("JsonProcessingException while reading json file " + json, ex);
        }
        return null;
    }

    public static String objectToJson(Object obj ) {

        try {
            return objectMapper().writeValueAsString(obj);
        } catch (JsonProcessingException ex) {
            log.error("JsonProcessingException while reading json file " + obj, ex);
        }
        return null;
    }

    public static void savePayload(String payload) throws IOException {
        final FileWriter writer =  new FileWriter(BASE_PATH + "base_eur_" + LocalDate.now() + ".json");
        writer.write(payload);
        writer.flush();
        writer.close();
    }

    public static void savePayload(ExchangeRateDto payload) throws IOException {
        Gson gson = new GsonBuilder().create();

        FileWriter writer =  new FileWriter(BASE_PATH + "base_eur_" + LocalDate.now() + ".json");
        gson.toJson(payload.toString(), writer);
        writer.flush();
        writer.close();
    }

    private static ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(df);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }

}
