package org.rajesh.boda;

public class CricketCoach implements Coach {
	
	public CricketCoach() {
		System.out.println("Default constructor in CricketCoach");
	}

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In setters of CricketCoach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practise bowling for 15 minutes from CricketCoach";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return "Today is your lucky today! from CricketCoach" ;
	}

}
