package example.spring.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

	  @GetMapping("/doGreet")
	  public  String getGreeting()
	  {
		  return "Welcome to Spring REST !!"; //In this case 'greet' is not the view name, it is data
	  }
	  
	  @GetMapping("/person")
	  public Person getPerson()
	  {
		  Person personObj = new Person("Jayesh" , "IT" ,LocalDate.of(2005,5, 21));
		  return personObj;
	  }
	  
	  @GetMapping("/persons")
	  public List<Person> getPersons()
	  {
		  
		  Person personObj1 = new Person("Jayesh" , "IT" ,LocalDate.of(2005,5, 21));
		  Person personObj2 = new Person("Allen" , "CS" ,LocalDate.of(2002,3, 17));
		  
		  List<Person> personList = List.of(personObj1 , personObj2);
		  return personList;
		
		  
	  }
	 
}
