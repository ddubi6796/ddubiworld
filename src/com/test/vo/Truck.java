package com.test.vo;

public class Truck {
	private int weight;
	private int length;
	
	public Truck(int weight, int length) {
		this.weight = weight;
		this.length = length;
	}
	
	public int getWeight() {
		return this.weight;
	}
	public int getLength() {
		return this.length;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
