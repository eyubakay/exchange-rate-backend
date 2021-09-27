package com.finance.exchangerateservice.app.aop;

import com.finance.exchangerateservice.app.dto.ExchangeRateDto;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
import com.finance.exchangerateservice.app.service.ExchangeRateProviderService;
import com.finance.exchangerateservice.app.service.ExchangeRepositoryService;
import com.finance.exchangerateservice.app.util.PayloadUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
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

    private LocalDate exchangeDate;

    @Around("@annotation(com.finance.exchangerateservice.app.aop.annotation.DailyExchange)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        if (Objects.isNull(exchangeDate)) {
            ExchangeRate latest = exchangeRepositoryService.getLatest();
            if (Objects.isNull(latest)) {
                String ratePayload = exchangeRateProviderService.getExchangeRateJson();
                ExchangeRateDto dto = PayloadUtil.jsonToObject(ratePayload, ExchangeRateDto.class);
                exchangeRepositoryService.save(dto);
                PayloadUtil.savePayload(ratePayload);
                assert latest != null;
                exchangeDate = LocalDate.parse(dto.getDate());
            }
        }
        Object proceed = joinPoint.proceed();
        log.info(proceed+" Exchange Rates Updated for Today {} ", joinPoint);
        return proceed;
    }

}
