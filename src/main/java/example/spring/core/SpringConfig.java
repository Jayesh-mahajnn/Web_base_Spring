package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration//Marks this class as configuration specific class
@ComponentScan(basePackages = {"first" , "second" , "example"}) //Enabling package scanning for picking @Component 
public class SpringConfig {
	
	@Bean("myBean") //Overriding the default ID;
	@Lazy //Making this bean Lazy
	@Scope("prototype")
	public GreetingService getWelcomeService()
	{
		return new WelcomeService();
	}
	
	@Bean               //by default bean id is method name
	public Address getAdderss()
	{
		return new Address("Mumbai" ,  422001);
	}
	
	
	@Bean               //by default bean id is method name
	public Address getAdderss2()
	{
		return new Address("New Delhi" ,  455001);
	}
		
	@Bean("cust")
	public Customer getCustomer() {
		
		Customer cst = new Customer();
		cst.setName("Jayesh");
		cst.setEmail("JayeshDm@gmail.com");
		cst.setCommAddress(getAdderss2());
		
		return cst;
		
	}
	
	@Bean("Petrol")
	@Primary
	public Engine getPetrolEngine()
	{
		return new Engine("Petrol");
	}
	
	@Bean("diesel")
	
	public Engine getDieselEngine()
	{
		return new Engine("diesel");
	}
	
	@Bean("myCar")
	public Car getMyCar()
	{
		Car  myCar = new Car();
		myCar.setMake("Toyota");
		myCar.setModel("Innove");
		return myCar;
		
		//Not setting engine because 
	}

}
