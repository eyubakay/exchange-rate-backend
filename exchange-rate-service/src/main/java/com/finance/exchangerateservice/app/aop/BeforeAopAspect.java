package com.finance.exchangerateservice.app.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * @author Eyup Akay
 */

@Aspect
@Configuration
@Slf4j
public class BeforeAopAspect {

    @Before("execution(* com.finance.exchangerateservice.app.controller.*.*(..)) " +
            "|| execution(* com.finance.exchangerateservice.app.repository.*.*(..))" +
            "|| execution(* com.finance.exchangerateservice.app.service.impl.*.*(..))")
    public void before(JoinPoint joinPoint) {
//       TODO log.info(" Check for user access ");
        log.info(joinPoint.getSignature().getDeclaringTypeName() + " -> " + joinPoint.getSignature().getName());
    }
}
