package org.rajesh.boda;

import org.springframework.stereotype.Component;

@Component

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "HappyFortuneService --> Today is your lucky day!";
	}

}
