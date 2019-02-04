package org.rajesh.boda;

import org.springframework.stereotype.Component;

@Component

public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RestFortuneService --> Today is your lucky day!";
	}

}
