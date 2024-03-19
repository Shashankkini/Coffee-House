package com.shashank.CoffeeHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashank.CoffeeHouse.entity.CoffeeHouseEntity;

@Repository
public interface CoffeeHouseRepository  extends JpaRepository<CoffeeHouseEntity,Long>{

}
