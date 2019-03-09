package com.rajesh.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajesh.aop.demo.dao.AccountDao;

/***
 * 
 * @author I336121
 *
 */
public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDao theAccountDao = ctx.getBean("accountDao", AccountDao.class);

		theAccountDao.addAccount();

		ctx.close();

	}

}
