package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		
		String configFilePath = "./src/main/resources/spring_config.xml";
		ApplicationContext appContext = new  FileSystemXmlApplicationContext(configFilePath);
		
	   Object obj = appContext.getBean("myBean");
	   
	   GreetingService gs = (GreetingService)obj;
	   String reply =  gs.sayGreeting();
       System.out.println(reply);
       
       
       System.out.println("===============================");
       
       GreetingService gs2 = new WelcomeService();
       String reply2 = gs2.sayGreeting();
       System.out.println(reply2);
	    
	}

}
