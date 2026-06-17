package second.child;

import org.springframework.stereotype.Component;

@Component("second_child") //Assigning an id to this bean
public class SecondChildComponent {
	
	
	public void doWork()
	{
		System.out.println("Second Child Works...");
	}

}
