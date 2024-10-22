package com.gmv.training.spring.ai.example.aspects;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("@annotation(com.gmv.training.spring.ai.example.aspects.LogMethodAnnotation)")
    public void logExecutionTime(JoinPoint joinPoint) throws Throwable {
        System.out.println("Ejecutando metodo " + joinPoint.getSignature());
    }
}
