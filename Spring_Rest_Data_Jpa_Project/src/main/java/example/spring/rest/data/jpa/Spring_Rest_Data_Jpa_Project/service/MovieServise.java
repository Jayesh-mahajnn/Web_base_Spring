package example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.entity.Movie;
import example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.repo.MovieRepository;

@Service
public class MovieServise {
	@Autowired
	private MovieRepository movieRepo;
	
	public Collection<Movie> getAll()
	{
	   Collection<Movie> moviecCollection = movieRepo.findAll();
	   return moviecCollection;
	}
	
	public Movie getById(Integer movieId)
	{
	   Optional<Movie> op = movieRepo.findById(movieId);
	    Movie foundMovie = op.orElse(null);
	    return foundMovie;
	    
	    
	}
	
	public void create(Movie newMovie)
	{
		movieRepo.save(newMovie);
	}
	
	
	public void update(Movie updateMovie)
	{
		movieRepo.save(updateMovie);
	}
	
	public void deleteById(Integer movieId)
	{
		movieRepo.deleteById(movieId);
	}

}
