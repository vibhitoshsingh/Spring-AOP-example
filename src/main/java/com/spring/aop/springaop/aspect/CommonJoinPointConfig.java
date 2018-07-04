package com.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {
		
	}
	
	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {
		
	}
	@Pointcut("com.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {}

	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {	}
	
	@Pointcut("within(com.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {	}
	
	
	@Pointcut("@annotation(com.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {	}
}
