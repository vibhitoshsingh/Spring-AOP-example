package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
//ProceedingJoinPoint==>It allows you to continue with the execution of method.
@Aspect
@Configuration

public class MethodExecutionCalculationAspect {


	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("com.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime=System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		
		//startTime=x
		//Allow execution of method
		//end Time=y
		logger.info(" Time taken by {} is {}",joinPoint,timeTaken);
		
	}
}
