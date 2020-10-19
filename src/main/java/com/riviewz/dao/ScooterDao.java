package com.riviewz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.riviewz.model.BaseModel;
import com.riviewz.model.Scooter;

@Repository
public interface ScooterDao extends JpaRepository<Scooter, String> {

	List<BaseModel> findAllScooterByMfgName(String mfgName);
	
	Scooter findCounterById(int entityFk);
	
	@Modifying
	@Query(value="UPDATE scooter_list SET counter = :counter WHERE id = :entityFk", nativeQuery = true)
	public int updateCounter( @Param("counter")int counter, @Param("entityFk")int entityFk );
	
}