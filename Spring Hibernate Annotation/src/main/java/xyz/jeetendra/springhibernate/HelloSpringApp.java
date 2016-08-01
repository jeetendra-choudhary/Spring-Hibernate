package xyz.jeetendra.springhibernate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main (String args[]){
		//Load Spring Configuration file
		//XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);	
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());	
		// close the context
		context.close();
	}
}
