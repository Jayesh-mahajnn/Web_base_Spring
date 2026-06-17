package example.spring.core;

public class WelcomeService implements GreetingService{

	
	public WelcomeService() {
		System.out.println("Inside WelcomeService no-arg");
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome to Spring";
	}
	

}
