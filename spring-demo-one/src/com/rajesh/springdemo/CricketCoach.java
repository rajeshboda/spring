package com.rajesh.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println("In no arg constructor of CricketCoach Class");
	}

	@Override
	public String getDailyWorkOut() {

		return "Practise bowling for 30 minutes";
	}

	@Override
	public String getDailyFortune() {

		return "You are lucky today again!";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In  setter demo FortuneService  of CricketCoach Class");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("In  setter demo emailAddress  of CricketCoach Class-->" + emailAddress);
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {

		System.out.println("In  setter demo team  of CricketCoach Class-->" + team);

		this.team = team;
	}

}
