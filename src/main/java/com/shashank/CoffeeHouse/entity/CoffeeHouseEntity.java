package com.shashank.CoffeeHouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="coffee_house")
public class CoffeeHouseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long b_id;
	
	private int id;
	private String name; 
	private boolean  conditionFlag;
	private double price;
	private int items;
	private double totalAmout; 
	
	public long getB_id() {
		return b_id;
	}
	public void setB_id(long b_id) {
		this.b_id = b_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCondition() {
		return  conditionFlag;
	}
	public void setCondition(boolean  conditionFlag) {
		this. conditionFlag =  conditionFlag;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	public double getTotalAmout() {
		return totalAmout;
	}
	public void setTotalAmout(double totalAmout) {
		this.totalAmout = totalAmout;
	}
	
	public CoffeeHouseEntity() {
		super();
	}
	public CoffeeHouseEntity(long b_id, int id, String name, boolean  conditionFlag, double price, int items,
			double totalAmout) {
		super();
		this.b_id = b_id;
		this.id = id;
		this.name = name;
		this. conditionFlag =  conditionFlag;
		this.price = price;
		this.items = items;
		this.totalAmout = totalAmout;
	}
	

}
