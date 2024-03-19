package com.shashank.CoffeeHouse.dto;




public class CoffeeHouseDto {
	
	private long b_id;
	private int id;
	private String name; 
	private boolean  conditionFlag;
	private double price;
	private int items;
	private double totalAmout; 
	
	
	public CoffeeHouseDto() {
		super();
	}
	public CoffeeHouseDto(long b_id, int id, String name, boolean  conditionFlag, double price, int items,
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
	public void setCondition(boolean condition) {
		this. conditionFlag = condition;
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
	

}
