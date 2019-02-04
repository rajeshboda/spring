package org.rajesh.boda;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "I'm your baseball coach, run daily 5k";
	}

	@Override
	public String getDailyFortuneService() {
		
		return "BaseBallCoach"+fortuneService.getFortune();
	}

}
