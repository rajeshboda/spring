package org.rajesh.boda;

import org.springframework.stereotype.Component;

@Component
public class TennisCoachBro implements Coach {
	
	
	public TennisCoachBro() {
		System.out.println("TennisCoachBro Default Constructor");
	}

	@Override
	public String getDailyWorkOut() {
		return "Tennis Coach-> Practise tennis for 30 minutes";
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Bro!!";
	}

	}
