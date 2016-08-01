package xyz.jeetendra.springhibernate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")	
	private FortuneService fortuneService;
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService ){
		this.fortuneService = fortuneService;
	}	
	*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	@Autowired
	public void doSomethingCrazy(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}*/

	public String getDailyWorkout(){
		return "Practice your backhand volley";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
