package org.rajesh.boda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sports.properties")
public class TennisCoach implements Coach {
	
	private String email;
	private String team;
	
	
	public String getEmail() {
		return email;
	}

	@Autowired
	@Value("${email}")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	@Autowired
	@Value("${team}")
	public void setTeam(String team) {
		this.team = team;
	}

	/*@Autowired
	@Qualifier("randomFortuneService")
	*/
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach Default Constructor");
	}

	/*@Autowired
	
	public TennisCoach(@Qualifier("RESTFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	

	@Override
	public String getDailyWorkOut() {
		return "Tennis Coach-> Practise tennis for 30 minutes";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/*@Autowired
	@Qualifier("dataBaseFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("This is setter in Tennis Coach");
		this.fortuneService = fortuneService;
	}*/
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void doCrazyInjection(FortuneService fortuneService) {
		System.out.println("This is doCrazyInjection");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
