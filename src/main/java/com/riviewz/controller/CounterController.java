package com.riviewz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riviewz.service.EntityService;

@RestController
@RequestMapping("/counter")
public class CounterController {
	
	@Autowired
	EntityService entityService;
	
	@CrossOrigin
	@GetMapping("/{category}/{id}")
	public void updateCounter(@PathVariable("category") String indexCatg, @PathVariable("id") int entityFk) {
		
		entityService.updateCounter(indexCatg, entityFk);

	}
	
	@CrossOrigin
	@GetMapping("decrement/{category}/{id}")
	public void decrementCounter(@PathVariable("category") String indexCatg, @PathVariable("id") int entityFk) {
		
		entityService.decrementCounter(indexCatg, entityFk);

	}	
	
}