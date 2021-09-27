package com.integratedfinance.exchangerateservice.app.aop;

import com.integratedfinance.exchangerateservice.app.dto.ExchangeRateDto;
import com.integratedfinance.exchangerateservice.app.entity.ExchangeRate;
import com.integratedfinance.exchangerateservice.app.service.ExchangeRateProviderService;
import com.integratedfinance.exchangerateservice.app.service.ExchangeRepositoryService;
import com.integratedfinance.exchangerateservice.app.util.PayloadUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

/**
 * @author Eyup Akay
 */
@Aspect
@Configuration
@Slf4j
public class DailyExchangeUpdateAspect {

    @Autowired
    ExchangeRepositoryService exchangeRepositoryService;

    @Autowired
    ExchangeRateProviderService exchangeRateProviderService;

    @Around("@annotation(com.integratedfinance.exchangerateservice.app.aop.annotation.DailyExchange)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        ExchangeRate latest = exchangeRepositoryService.getLatest();

        if (Objects.isNull(latest)) {
            String ratePayload = exchangeRateProviderService.getExchangeRateJson();
            exchangeRepositoryService.save(PayloadUtil.jsonToObject(ratePayload, ExchangeRateDto.class));
            PayloadUtil.savePayload(ratePayload);
        }
        Object proceed = joinPoint.proceed();
        log.info(proceed+" Exchange Rates Updated for Today {} ", joinPoint);
        return proceed;
    }

}