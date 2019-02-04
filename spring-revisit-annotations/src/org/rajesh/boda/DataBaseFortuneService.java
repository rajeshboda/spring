package org.rajesh.boda;

import org.springframework.stereotype.Component;

@Component

public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "DataBaseFortuneService --> Today is your lucky day!";
	}

}
