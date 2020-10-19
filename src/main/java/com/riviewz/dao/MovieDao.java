package com.riviewz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.riviewz.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, String> {

	@Query(value="SELECT * FROM movie_list WHERE language = :language ORDER BY year DESC", nativeQuery = true)
	List<Movie> findAllMovieByLanguage(@Param(value = "language") String language);
	
	@Query(value="SELECT * FROM movie_list WHERE language IN ('Chinese','Japanese','Korean') ORDER BY year DESC;", nativeQuery = true)
	List<Movie> findAllMovieByOtherLanguage();
	
	Movie findCounterById(int entityFk);
	
	@Modifying
	@Query(value="UPDATE movie_list SET counter = :counter WHERE id = :entityFk", nativeQuery = true)
	public int updateCounter( @Param("counter")int counter, @Param("entityFk")int entityFk );
	
}