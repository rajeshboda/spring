package org.rajesh.boda;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		Random r = new Random();
		int random = r.nextInt(30);
		System.out.println("Randon number ->"+ random);
		String message ="Noting to worry, all is well";
		if(random >= 0 && random <=10) {
			message = "First Fortune is good";
		}else if(random >0 && random <=20 ) {
			message = "Second fortune is good as well";
		}else {
			message = "Third fortune is good as well";
		}
		return message;
	}

}
