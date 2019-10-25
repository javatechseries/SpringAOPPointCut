package com.explore.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
	
	
	
	@Pointcut("execution(* com.explore.spring.aop.dao.*.*(..))")
	public void forDaoPackage() {
		
	}
	
	@Before("forDaoPackage()")
	public void performLogging() {
	
		System.out.println(" ===> Performing Logging \n");
		
	}
	
	@Before("forDaoPackage()")
	public void performAPIAnalytics() {
		System.out.println(" ===> Performing API Analytics");
	}
	
	

}
