package com.marcuschiu.aspectorientedprogramming.config;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * In Spring Boot projects, we don't have to explicitly use the @EnableAspectJAutoProxy.
 * There's a dedicated AopAutoConfiguration (link below) that enables Spring's AOP support if the
 * Aspect or Advice is on the classpath
 * SpringBoot's AopAutoConfiguration - https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/aop/AopAutoConfiguration.html
 *
 * Spring AOP either uses:
 * - JDK dynamic proxies (default: @EnableAspectJAutoProxy)
 * - CGLIB based proxies (explicit: @EnableAspectJAutoProxy(proxyTargetClass=false))
 *
 * Also, you could make a "target-proxy" for a specific component/bean by using:
 * - proxyMode=ScopedProxyMode.TARGET_CLASS
 * For example:
 *   @Controller
 *   @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
 *   public class DefaultController { ... }
 */
@EnableAspectJAutoProxy(proxyTargetClass=false)
public class AOPConfig {
}
