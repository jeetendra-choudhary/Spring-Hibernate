package xyz.jeetendra.springhibernate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.out;


public class BeanScope {
	public static void main(String args[]){
		// Load the bean container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// Retrieve Bean from container
		Coach myCoach = context.getBean("myCoach",Coach.class);
		Coach myCoach1 = context.getBean("myCoach",Coach.class);

		// Invoke the methods on bean

		out.println("\n"+myCoach.getDailyWorkout());
		out.println("\n"+myCoach.getDailyFortune());

		out.println("\n: "+(myCoach==myCoach1));

		// Be nice close the context

		context.close();
	}
}
