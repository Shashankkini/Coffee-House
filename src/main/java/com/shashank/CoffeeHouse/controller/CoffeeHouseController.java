package com.shashank.CoffeeHouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shashank.CoffeeHouse.dto.CoffeeHouseDto;
import com.shashank.CoffeeHouse.service.CoffeeHouseService;

@RestController
@RequestMapping("/api/coffeehouse")
@CrossOrigin("*")
public class CoffeeHouseController {
	
	@Autowired
	CoffeeHouseService coffeeHouseService;
	
	
	
	@PostMapping
	public ResponseEntity<List<CoffeeHouseDto>> addAccount(@RequestBody List< CoffeeHouseDto> coffeeHouseDto){
		
		 List<CoffeeHouseDto> savedEntities = coffeeHouseService.save(coffeeHouseDto);
		 
		 return  new ResponseEntity<>(savedEntities,HttpStatus.CREATED);
	}

}
