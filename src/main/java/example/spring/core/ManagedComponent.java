package example.spring.core;

import org.springframework.stereotype.Component;

@Component //Marks this class as a managed component so the spring can managed
public class ManagedComponent {
	
	
	public void doWork()
	{
		System.out.println("Manged Componet works ");
	}

}
