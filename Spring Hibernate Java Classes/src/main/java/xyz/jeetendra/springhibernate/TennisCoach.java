package xyz.jeetendra.springhibernate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static java.lang.System.out;
import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
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

	@PostConstruct
	public void init(){
		out.println(">> Inside Tennis Coach:: init()");	
	}

	@PreDestroy
	public void cleanup(){
		out.println(">> Inside Tennis Coach:: cleanup()");	
	}

	public String getDailyWorkout(){
		return "Practice your backhand volley";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
