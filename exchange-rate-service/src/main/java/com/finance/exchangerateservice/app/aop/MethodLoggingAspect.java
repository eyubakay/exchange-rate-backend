package com.finance.exchangerateservice.app.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;


/**
 * @author Eyup Akay
 */
@Aspect
@Configuration
@Slf4j
public class MethodLoggingAspect {

    @Around(value = "@within(com.finance.exchangerateservice.app.aop.annotation.Loggable) || @annotation(com.finance.exchangerateservice.app.aop.annotation.Loggable)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] signatureArgs = joinPoint.getArgs();
        Object proceed = joinPoint.proceed();
        if(signatureArgs == null){
            return proceed;
        }
        for (int i = 0; i < signatureArgs.length; i++) {
            log.info(joinPoint.getSignature().getDeclaringTypeName() + " -> " + joinPoint.getSignature().getName() + "() ::: ARG[" + i + "]=" + signatureArgs[i]);
        }
        return proceed;
    }
}
