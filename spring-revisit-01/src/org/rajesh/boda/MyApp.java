package org.rajesh.boda;

public class MyApp {

	public static void main(String[] args) {
		//Coach theCoach = new BaseBallCoach();
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkOut());

	}

}
