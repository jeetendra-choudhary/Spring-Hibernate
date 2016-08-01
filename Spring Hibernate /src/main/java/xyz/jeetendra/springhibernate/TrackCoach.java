
package xyz.jeetendra.springhibernate;


public class TrackCoach implements Coach {
		

	//Define a private field for dependency
	private FortuneService fortuneService;

	// Define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
		public String getDailyWorkout(){
			return "Run a hard 5K";
		}
		
		
		public String getDailyFortune(){
			return fortuneService.getFortune();
		}

	// Add an init method
	public void doMyStartupStuff(){
		System.out.println("In Bean Init Method.");
	}
	// Add a destroy method
	public void doMyDestroyStuff(){
		System.out.println("In Bean Destroy Method.");
	}

}
