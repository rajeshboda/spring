package com.rajesh.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Before("execution(* * addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("===> beforeAddAccountAdvice");
	}
}
