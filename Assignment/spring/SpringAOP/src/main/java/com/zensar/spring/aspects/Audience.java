package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

	@Pointcut("execution(* *.perform(..))")						// execution() is a function name
																// .. indicates 0-many parameters
																// * indicates that perform() may belong to any method
																// *(space) indicates that perform may return any type of data  

//	@Pointcut("execution(void *.perform(..))")					// returns only void in this case
	
//	@Pointcut("execution(void com.zensar.spring.performers.Juggler.perform(..))")		// returns void and specifies that perform only belongs to Juggler class in the specified package.
	
//  @Pointcut("execution(public void com.zensar.spring.performers.Juggler.perform(..))")		// here perform() must be a public method.
	public void performancePointcut() {
		
	}
	
	// @Before(value = "performancePointcut()")
	@Before(value = "execution(* *.perform(..))")
	public void takeSeats()
	{
		System.out.println("Audience is taking their seats.");
	}
	
	@Before(value = "performancePointcut()")
	public void switchOffCellphones()
	{
		System.out.println("Audience is switching off cellphones.");
	}
	
	@AfterReturning(value = "performancePointcut()")
	public void applaud () {
		System.out.println("CLAP CLAP CLAP!");
	}
	
	@AfterThrowing(value = "performancePointcut()")
	public void demandRefund () {
		System.out.println("Give me my money back!");
	}

}
