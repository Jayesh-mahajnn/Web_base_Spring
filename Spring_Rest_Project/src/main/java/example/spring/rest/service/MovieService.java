package example.spring.rest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Movie;
import example.spring.rest.repo.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public Collection<Movie> getAll()
	{
		Collection<Movie> movieCollection = movieRepo.getAll();
		
		for(Movie currentMovie : movieCollection)
		{
			currentMovie.setTitle(currentMovie.getTitle().toUpperCase());
		}
		return movieCollection;
	}

}
