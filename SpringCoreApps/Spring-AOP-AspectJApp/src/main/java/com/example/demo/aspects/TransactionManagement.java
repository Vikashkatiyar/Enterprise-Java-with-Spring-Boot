package com.example.demo.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {
    
	@Pointcut("execution(public * com.example.demo.dao.EmployeeDao.saveEmployee())")
	public void p1() {
		
	}
	
	
	
	@Before("p1()")  //JoinPoint
	public void beginTransaction() {
		System.out.println("Transaction Begin");
	}
	
	@AfterReturning("p1()") //JoinPoint
	public void commitTransaction() {
		System.out.println("Transaction Committed");
	}
	
	@AfterThrowing(value = "p1()", throwing = "obj")
	public void rollBack(Throwable obj) {
		System.out.println("Transaction rollbacked..");
	}
	
	@After("p1()")
	public void emailSetUpCredentials() {
		System.out.println("***Email Setup is done***");
	}
	
}
