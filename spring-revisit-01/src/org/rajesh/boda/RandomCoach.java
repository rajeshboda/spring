package org.rajesh.boda;

public class RandomCoach implements Coach {

	private FortuneService randomFortune;

	public RandomCoach(FortuneService randomCoachService) {
		this.randomFortune = randomCoachService;
	}

	@Override
	public String getDailyWorkOut() {
		return "I'm your Random coach";
	}

	@Override
	public String getDailyFortuneService() {

		return "RandomCoach ::" + randomFortune.getFortune();
	}

}
