package com.riviewz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.riviewz.model.BaseModel;
import com.riviewz.model.OnlineStore;
import com.riviewz.model.Restaurant;

@Repository
public interface RestaurantDao extends JpaRepository<Restaurant, String> {

	List<BaseModel> findAllRestaurantByCityName(String city);
	
	OnlineStore findCounterById(int entityFk);
	
	@Modifying
	@Query(value="UPDATE restaurant_list SET counter = :counter WHERE id = :entityFk", nativeQuery = true)
	public int updateCounter( @Param("counter")int counter, @Param("entityFk")int entityFk );
	
}