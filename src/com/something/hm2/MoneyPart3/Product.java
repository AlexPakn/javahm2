package com.something.hm2.MoneyPart3;

public class Product extends Money {

	private String name;

	public Product(String name, int wholePart, int fractionalPart) {
		super(wholePart, fractionalPart);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void lowerCost(int lowerWholePart, int lowerFractionalPart) {
		this.wholePart -= lowerWholePart;
		this.fractionalPart -= lowerFractionalPart;
	}

}