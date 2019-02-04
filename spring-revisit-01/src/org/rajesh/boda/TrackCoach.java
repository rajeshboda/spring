package org.rajesh.boda;

public class TrackCoach implements Coach {
	
	public TrackCoach() {
		System.out.println("I'm an empty constructor");
	}

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("I'm injected constructor");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "I'm your track coach, run daily 5k";
	}

	@Override
	public String getDailyFortuneService() {
		
		return "Track coach!" + fortuneService.getFortune();
	}
	
	public void startUpStuff(){
		System.out.println("This is init method");
	}

	public void cleanUpStuff(){
		System.out.println("This is destory method");
	}
}
