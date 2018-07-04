package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration

//@AfterReturning==>it is called when a method is executed successfully.
//@AfterThrowing==>it is called when a method throws an exception.
//@After==>it is called in both the scenario either throwing exception or returning value.

@Aspect
@Configuration

public class AfterAopAspect {


	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(
			value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning="result")
	
    public void afterReturning(JoinPoint joinPoint,Object result) {
		logger.info(" {} returned with value {}",joinPoint,result);
		
	}
	

	@After(value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")		
    public void after(JoinPoint joinPoint) {
		
		logger.info(" after execution of {}",joinPoint);
		
	}
	
}
