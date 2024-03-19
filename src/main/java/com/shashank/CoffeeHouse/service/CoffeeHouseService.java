package com.shashank.CoffeeHouse.service;

import java.util.List;

import com.shashank.CoffeeHouse.dto.CoffeeHouseDto;

public interface CoffeeHouseService {
	
	List<CoffeeHouseDto> save(List<CoffeeHouseDto> coffeeHouseDto);
	
	List<CoffeeHouseDto> getAllAccount();
	
	void deleteAllAccount();
	

}
