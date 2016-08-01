package xyz.jeetendra.springhibernate;

import static java.lang.System.out;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {
	public static void main(String args[]){
		//Load Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// Retrieve bean from container
		Coach myCoach = context.getBean("myCoach",Coach.class);
		// Invoke Methods on bean 
		out.println(myCoach.getDailyWorkout());
		out.println(myCoach.getDailyFortune());

		// Be Nice to Container and close the context
		context.close();
	}
}
