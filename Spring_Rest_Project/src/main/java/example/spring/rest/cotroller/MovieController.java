package example.spring.rest.cotroller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.entity.Movie;
import example.spring.rest.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService mvService;
	
	@GetMapping("/movies")
	public Collection<Movie> getAll()
	{
		Collection<Movie> movieCollection = mvService.getAll();
		return movieCollection;
	}
	
  
	

}
