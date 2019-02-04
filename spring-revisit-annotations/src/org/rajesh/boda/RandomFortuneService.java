package org.rajesh.boda;

import org.springframework.stereotype.Component;

@Component

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RandomFortuneService --> Today is your lucky day!";
	}

}
