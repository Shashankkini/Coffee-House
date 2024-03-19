package com.shashank.CoffeeHouse.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping
	public ResponseEntity<List<CoffeeHouseDto>> getAllAccount(){
		
		 List<CoffeeHouseDto> getEntities = coffeeHouseService.getAllAccount();
		 
		 return  new ResponseEntity<>(getEntities,HttpStatus.OK);
	}
	
//	@GetMapping("/delete")
//	public String deleteAllAccount(){
//		
//		  coffeeHouseService.deleteAllAccount();
//		 
//		 return  "deleted";
//	}
	
	
	
	
	 @GetMapping("/delete")
		public ResponseEntity<Map<String, String>>deleteAllAccount() {
		    try {
		    	coffeeHouseService.deleteAllAccount();
		        Map<String, String> response = new HashMap<>();
		        response.put("message", "Account Deleted Successfully");
		        return new ResponseEntity<>(response, HttpStatus.OK);
		    } catch (Exception e) {
		        Map<String, String> errorResponse = new HashMap<>();
		        errorResponse.put("error", "Error deleting entity: " + e.getMessage());
		        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		}
	 

}
