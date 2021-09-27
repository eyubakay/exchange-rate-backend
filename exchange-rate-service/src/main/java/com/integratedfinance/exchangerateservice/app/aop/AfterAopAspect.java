package com.integratedfinance.exchangerateservice.app.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

/**
 * @author Eyup Akay
 */
@Aspect
@Configuration
@Slf4j
public class AfterAopAspect {

    @AfterReturning(value = "execution(* com.integratedfinance.exchangerateservice.app.controller.*.*(..)) " +
            "|| execution(* com.integratedfinance.exchangerateservice.app.repository.*.*(..))" +
            "|| execution(* com.integratedfinance.exchangerateservice.app.service.impl.*.*(..))"
            ,returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("{} returned with value {}", joinPoint, result);
    }

    @After("execution(* com.integratedfinance.exchangerateservice.app.controller.*.*(..)) " +
            "|| execution(* com.integratedfinance.exchangerateservice.app.repository.*.*(..))" +
            "|| execution(* com.integratedfinance.exchangerateservice.app.service.impl.*.*(..))")
    public void after(JoinPoint joinPoint) {
        log.info("after execution of {}", joinPoint);
        log.info(joinPoint.getSignature().getDeclaringTypeName() + " -> " + joinPoint.getSignature().getName() + "() END");
    }
}
