package com.rajesh.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	public void addAccount() {
		System.out.println(getClass() +"Doing some DB work!!" );
	}
}
