package com.shiva;

public class Item {
	private String name;
	private String description;
	private String price;
	private String location;
	
	public Item(String name, String description, String price, String location) {
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

	public String getLocation() {
		return location;
	}
	
	
	
}
