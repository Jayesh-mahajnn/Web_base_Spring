package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import first.FirstComponent;
import second.SecondComponent;
import second.child.SecondChildComponent;

public class PureAnnotationBasedConfugurationMain {

	public static void main(String[] args) {
	
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
	    ManagedComponent mgComp = appContext.getBean(ManagedComponent.class);
	   mgComp.doWork(); 
		
		FirstComponent firstComp = appContext.getBean(FirstComponent.class);
		firstComp.doWork(); 
	   
		SecondComponent secondComp = appContext.getBean(SecondComponent.class);
		secondComp.doWork();
		
	/*	SecondChildComponent secondChildComp = appContext.getBean(SecondChildComponent.class);
		secondChildComp.doWork(); */
		
		Object obj =  appContext.getBean("second_child");
	    SecondChildComponent secondChildComp = (SecondChildComponent)obj;
	    secondChildComp.doWork();
	}

}
