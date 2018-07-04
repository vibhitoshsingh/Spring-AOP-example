package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration


//@Aspect==>It is a combination of Point-cut and advice

//This is call advice

		/*logger.info("Check for user access");
		logger.info("Allowed execution for - {}",joinPoint);*/
//advice ends here

//joint-point==>it is a specific interception of a method call

//weaving==>the process of implementing AOP around your method 

//WEAVER==>THE frame work which performs weaving.

//terminology-1
	//This complete expression call point cuts
	/*("execution(* com.spring.aop.springaop.business.*.*(..))")*/
	//terminology-1 ends here

@Aspect


@Configuration
public class UserAccessAspect {


	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
	
	/*@Before("execution(* com.spring.aop.springaop.business.*.*(..))")
	 public void before(JoinPoint joinPoint) {
			logger.info("Intercepted Method Calls - {}",joinPoint);
		}*/
	
	
	//for calling data method
	
	@Before(" com.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	//for calling data method ends
	
    public void before(JoinPoint joinPoint) {
		
		//This is call advice
		
		logger.info("Check for user access");
		logger.info("Allowed execution for - {}",joinPoint);
		 
		//advice ends here
		
		
	}
	
	
	
	
	//for point cut
	/*@Before("execution(* com.spring.aop.springaop..*.*(..))")
	
	 public void before(JoinPoint joinPoint) {
	
	logger.info("Check for user access");
	logger.info("Allowed execution for - {}",joinPoint);
	
	
	
}*/
	//for point cut ends
	
	
}
