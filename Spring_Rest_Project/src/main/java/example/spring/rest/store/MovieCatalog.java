package example.spring.rest.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import example.spring.rest.entity.Movie;

public class MovieCatalog {
	
	private static Map<Integer, Movie> listOfMovie;
	
	static {
		
		listOfMovie = new HashMap<>();
		
		Movie m1 = new Movie(101 , "Michael" , "Biopic" , 120);
		Movie m2 = new Movie(102 , "Predator" , "Harror" , 115);
		Movie m3 = new Movie(103 , "Raja-Hindustani" , "Emotional" , 225);
		
		listOfMovie.put(m1.getMovieId(), m1);
		listOfMovie.put(m2.getMovieId(), m2);
		listOfMovie.put(m3.getMovieId(), m3);
	}
  
	//Return all movies
 	public static Collection<Movie> getAll()
 	{
 		Collection<Movie> movieCollection  = listOfMovie.values();
 		return movieCollection;
 	}
	

}
