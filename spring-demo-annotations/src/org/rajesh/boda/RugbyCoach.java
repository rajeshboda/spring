package org.rajesh.boda;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {
	private FortuneService theFortuneService;

	@Override
	public String getDailyWorkOut() {

		return "Rugby Rocks!!";
	}

	@Override
	public String getDailyFortune() {

		return theFortuneService.getFortune();
	}

}
