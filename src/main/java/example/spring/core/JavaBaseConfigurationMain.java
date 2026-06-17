package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBaseConfigurationMain {

	public static void main(String[] args) {
		
		Class<SpringConfig> configClass = SpringConfig.class;
		ApplicationContext appContext = new  AnnotationConfigApplicationContext(configClass);
		
	    Object obj =appContext.getBean("myBean");
	    Object obj1 =appContext.getBean("myBean");
	    Object obj2 =appContext.getBean("myBean");
	    
	    System.out.println(obj == obj1);
	    System.out.println(obj == obj2);
	    
	    
	    /*GreetingService gs = (GreetingService)obj;
	    String reply = gs.sayGreeting();
	    System.out.println(reply);*/
	    
	   
		
	}

}

