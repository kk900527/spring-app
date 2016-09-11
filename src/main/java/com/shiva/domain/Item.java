package com.shiva.domain;

public class Item {
	private String name;
	private String description;
	private String price;
	private Location location;
	
	public Item(String name, String description, String price, Location location) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return price;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	
	
	
}
