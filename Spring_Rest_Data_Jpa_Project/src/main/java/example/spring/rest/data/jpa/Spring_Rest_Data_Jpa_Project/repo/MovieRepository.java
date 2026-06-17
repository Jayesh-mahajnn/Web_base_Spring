package example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project.entity.Movie;

//@Repository is not needed because JpaRepository is already a managed component
//Therefore MovieRepository also becomes a managed component
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	

}
