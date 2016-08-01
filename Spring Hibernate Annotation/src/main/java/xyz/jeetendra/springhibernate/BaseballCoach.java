package xyz.jeetendra.springhibernate;


public class BaseballCoach implements Coach{
	//Define a private field for dependency
	private FortuneService fortuneService;

	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout(){
		return "Spend 5hr in Batting practice";
	}

	public String getDailyFortune(){
		return fortuneService.getFortune();
	}
}
