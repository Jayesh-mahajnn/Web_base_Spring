package example.spring.rest.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import example.spring.rest.entity.Movie;
import example.spring.rest.store.MovieCatalog;

@Repository
public class MovieRepository {
	
	public Collection<Movie> getAll()
	{
		Collection<Movie> movieColletion = MovieCatalog.getAll();
		return movieColletion;
		
	}

}
