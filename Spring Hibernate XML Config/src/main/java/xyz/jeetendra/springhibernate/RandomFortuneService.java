package xyz.jeetendra.springhibernate;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
	Random newRandom = new Random();
	String data[] = {
		"Today is your lucky day",
		"Arvind purohit is Guru",
		"Jeet will learn whole world"
	};

	public String getFortune(){
		int index = newRandom.nextInt(data.length);
		return data[index];
	}
}
