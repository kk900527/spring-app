package com.shiva.domain;

import java.util.List;

public class Category {
	private List<String>onSaleItems;

	public Category(List<String> onSaleItems) {
		super();
		this.onSaleItems = onSaleItems;
	}

	public List<String> getOnSaleItems() {
		return onSaleItems;
	}

	public void setOnSaleItems(List<String> onSaleItems) {
		this.onSaleItems = onSaleItems;
	}

}
