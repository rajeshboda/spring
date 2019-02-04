package com.rajesh.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Good Luck in HappyFortuneService ";
	}

}
