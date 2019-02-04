package org.rajesh.boda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myFirstBean")
public class TennisCoach implements Coach {

	@Autowired
	/*public TennisCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	
*/	@Qualifier("dataBaseFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		return "Practice Tennis 30 minutes daily";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
