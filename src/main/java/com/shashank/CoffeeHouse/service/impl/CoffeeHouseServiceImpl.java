package com.shashank.CoffeeHouse.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashank.CoffeeHouse.dto.CoffeeHouseDto;
import com.shashank.CoffeeHouse.entity.CoffeeHouseEntity;
import com.shashank.CoffeeHouse.mapper.CoffeeHouseMapper;
import com.shashank.CoffeeHouse.repository.CoffeeHouseRepository;
import com.shashank.CoffeeHouse.service.CoffeeHouseService;


@Service
public class CoffeeHouseServiceImpl implements CoffeeHouseService{
	
	@Autowired
	private CoffeeHouseRepository coffeeHouseRepository;

	@Override
	public List<CoffeeHouseDto> save(List<CoffeeHouseDto> coffeeHouseDto) {
		// TODO Auto-generated method stub
		List<CoffeeHouseEntity> coffeeHouseEntity= coffeeHouseDto.stream()
				.map((item)->CoffeeHouseMapper.mapToCoffeeHouseEntity(item)).
				collect(Collectors.toList());
		List<CoffeeHouseEntity> savedEntities = coffeeHouseRepository.saveAll(coffeeHouseEntity);
		
		return savedEntities.stream()
				.map((item)->CoffeeHouseMapper.mapToCoffeeHouseDto(item)).
				collect(Collectors.toList());
		
		//CoffeeHouseEntity saved= coffeeHouseRepository.save(coffeeHouseEntity);
		//return CoffeeHouseMapper.mapToCoffeeHouseDto(saved);
	}

}


/*

 @Override
    public List<CoffeeHouseEntity> saveCoffeeHouses(List<CoffeeHouseDto> coffeeHouses) {
        List<CoffeeHouseEntity> entities = coffeeHouses.stream()
                .map(this::convertToEntity)
                .collect(Collectors.toList());
        List<CoffeeHouseEntity> savedEntities = coffeeHouseRepository.saveAll(entities);
        return savedEntities;
    }

    private CoffeeHouseEntity convertToEntity(CoffeeHouseDto dto) {
        // Implement conversion logic from DTO to Entity
        CoffeeHouseEntity entity = new CoffeeHouseEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        // Set other properties
        return entity;
    }
    
    
    
    
    
    List<Account> accounts= accountRepository.findAll();
		
		return accounts.stream().map((account)->AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
*/