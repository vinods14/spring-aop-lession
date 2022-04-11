package com.aop.springaoplession.logmonitoring;

import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class ApplicationLog {


    @Before("execution(* com.aop.springaoplession.controller.*.*(..))")
    public void beforeLog(JoinPoint joinPoint) {
        log(joinPoint, "Before ");
    }

    @After("execution(* com.aop.springaoplession.controller.*.*(..))")
    public void afterLog(JoinPoint joinPoint) {
        log(joinPoint, "After ");
    }

    private void log(JoinPoint joinPoint, String state) {
        String name = joinPoint.getSignature().getName();
        String simpleName = joinPoint.getSignature().getDeclaringType().getSimpleName();
        log.info(state + simpleName + " Method :: "+ name);
    }


}
