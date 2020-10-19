package com.riviewz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.riviewz.model.BaseModel;
import com.riviewz.model.Salon;

@Repository
public interface SalonDao extends JpaRepository<Salon, String> {
	
	//List<SalonBrand> findAllBrandByCity(String city);
	
	List<BaseModel> findAllSalonByCityName(String city);
	
	Salon findCounterById(int entityFk);
	
	@Modifying
	@Query(value="UPDATE salon_list SET counter = :counter WHERE id = :entityFk", nativeQuery = true)
	public int updateCounter( @Param("counter")int counter, @Param("entityFk")int entityFk );
	
}