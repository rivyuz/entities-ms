package com.riviewz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riviewz.model.BaseModel;
import com.riviewz.service.EntityService;

@RestController
@RequestMapping("/entities/list")
public class EntityController {
	
	@Autowired
	EntityService entityService;
	
	@CrossOrigin
	@GetMapping("/{category}/{sub-category}")
	public List<BaseModel> getEntityDetails(@PathVariable("category") String category, @PathVariable("sub-category") String subCategory) {
		
		return entityService.getEntityDetails(category, subCategory);
	
	}
	
}