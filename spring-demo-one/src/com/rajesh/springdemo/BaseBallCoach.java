package com.rajesh.springdemo;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseBallCoach() {
		// TODO Auto-generated constructor stub
	}

	public BaseBallCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Daily Practise Java from BaseBallCoach\n";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	public void doStartUp() {
		System.out.println("In start up");
	}
	
	public void doCleanUp() {
		System.out.println("In clean up");
	}

}
