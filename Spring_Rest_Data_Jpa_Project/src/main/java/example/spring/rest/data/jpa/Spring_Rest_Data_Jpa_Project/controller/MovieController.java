package example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.entity.Movie;
import example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.service.MovieServise;

@RestController
@RequestMapping("/movies")
public class MovieController {
       
	@Autowired
	private MovieServise mvService;
	 
	@GetMapping
	public Collection<Movie> getAll()
	{
		Collection<Movie> movieColletion =  mvService.getAll();
		return movieColletion;
	}
	
	@GetMapping("/{ID}")
	public Movie getById(@PathVariable("ID") Integer movieId)
	{
		return mvService.getById(movieId);
	}
	
	@PostMapping
	public void create(@RequestBody Movie newMovie)
	{
		System.out.println("Received movie for insertion : " +newMovie);
		mvService.create(newMovie);
	}
	
	@PutMapping
	public void update(@RequestBody Movie updateMovie)
	{
		mvService.update(updateMovie);
	}
	
	@DeleteMapping("/{movieId}")
	public void deleteById(@PathVariable Integer movieId)
	{
		mvService.deleteById(movieId);
	}
	
}
