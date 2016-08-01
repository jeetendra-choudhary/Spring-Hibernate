package xyz.jeetendra.springhibernate;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//create a no arg constructor
	public CricketCoach(){
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	public CricketCoach(FortuneService fortuneService){
		System.out.println("CricketCoach: inside constructor");
		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService){
		System.out.println("CricketCoach: inside Setter method");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress(){
		return emailAddress;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public String getTeam(){
		return team;
	}

	public String getDailyWorkout(){
		return "Ball 10 overs streight!";
	}

	public String getDailyFortune(){
		return fortuneService.getFortune();
	}
}
