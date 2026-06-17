package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringExampleMain {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new  AnnotationConfigApplicationContext(SpringConfig.class);
		
		Object carObj =appContext.getBean("myCar");
		System.out.println(carObj);
	}

}
