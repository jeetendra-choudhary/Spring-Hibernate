
package xyz.jeetendra.springhibernate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String args[]){
		// Load spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


		// Retrive the bean

		CricketCoach myCoach = context.getBean("myCricketCoach",CricketCoach.class);

		System.out.println(myCoach.getTeam());
		System.out.println(myCoach.getEmailAddress());

		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());

		context.close();
	}
}
