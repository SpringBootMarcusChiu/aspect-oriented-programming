package com.marcuschiu.aspectorientedprogramming.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component // or @Configuration
public class ExampleAspect {

    @Before("execution(* *.methodOne(..))")
    public void before(JoinPoint jp) {
        System.out.println("ExampleAspect.before()");
    }

    @After("execution(* *.methodOne(..))")
    public void after(JoinPoint jp) {
        System.out.println("ExampleAspect.after()");
    }

    @AfterReturning("execution(* *.methodOne(..))")
    public void afterReturning(JoinPoint jp) {
        System.out.println("ExampleAspect.afterReturning()");
    }

    @AfterThrowing("execution(* *.methodOne(..))")
    public void afterThrowing(JoinPoint jp) {
        System.out.println("ExampleAspect.afterThrowing()");
    }

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}