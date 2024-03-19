package com.shashank.CoffeeHouse.mapper;

import com.shashank.CoffeeHouse.dto.CoffeeHouseDto;
import com.shashank.CoffeeHouse.entity.CoffeeHouseEntity;

public class CoffeeHouseMapper {

	
	public static CoffeeHouseDto mapToCoffeeHouseDto(CoffeeHouseEntity coffeeHouseEntity) {
		 CoffeeHouseDto  coffeeHouseDto=new  CoffeeHouseDto(
				 coffeeHouseEntity.getB_id(),
				 coffeeHouseEntity.getId(),
				 coffeeHouseEntity.getName(),
				 coffeeHouseEntity.isCondition(),
				 coffeeHouseEntity.getPrice(),
				 coffeeHouseEntity. getItems(),
				 coffeeHouseEntity.getTotalAmout()
				 
				 );
		
		
		return coffeeHouseDto;
	}
	
	public static CoffeeHouseEntity mapToCoffeeHouseEntity(CoffeeHouseDto coffeeHouseDto) {
		 CoffeeHouseEntity  coffeeHouseEntity=new  CoffeeHouseEntity(
				 coffeeHouseDto.getB_id(),
				 coffeeHouseDto.getId(),
				 coffeeHouseDto.getName(),
				 coffeeHouseDto.isCondition(),
				 coffeeHouseDto.getPrice(),
				 coffeeHouseDto. getItems(),
				 coffeeHouseDto.getTotalAmout()
				 
				 );
		
		
		return coffeeHouseEntity;
	}
}
