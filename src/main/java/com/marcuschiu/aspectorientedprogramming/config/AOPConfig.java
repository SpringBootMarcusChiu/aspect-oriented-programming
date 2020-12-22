package com.marcuschiu.aspectorientedprogramming.config;

/**
 * In Spring Boot projects, we don't have to explicitly use the @EnableAspectJAutoProxy.
 * There's a dedicated AopAutoConfiguration (link below) that enables Spring's AOP support if the
 * Aspect or Advice is on the classpath
 * SpringBoot's AopAutoConfiguration - https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/aop/AopAutoConfiguration.html
 */
//@EnableAspectJAutoProxy
public class AOPConfig {
}
