package com.riviewz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.riviewz.model.BaseModel;
import com.riviewz.model.SpaCenter;

@Repository
public interface SpaCenterDao extends JpaRepository<SpaCenter, String> {

	List<BaseModel> findAllSpaCenterByCityName(String city);
	
	SpaCenter findCounterById(int entityFk);
	
	@Modifying
	@Query(value="UPDATE spa_list SET counter = :counter WHERE id = :entityFk", nativeQuery = true)
	public int updateCounter( @Param("counter")int counter, @Param("entityFk")int entityFk );
	
}