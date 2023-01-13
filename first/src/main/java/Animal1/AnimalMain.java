package Animal1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("Animal1/animal.xml");
		
		Animal[] animals = new Animal[3];
		animals[0] = (Dog) factory.getBean("dog");
		animals[1] = (Cat) factory.getBean("cat");
		animals[2] = (Rabbit) factory.getBean("rabbit");
		
		for(Animal animal : animals) {
			animal.lunch();
			System.out.println("=============");
		}
	}

}
