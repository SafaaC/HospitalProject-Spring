package com.ty;

import java.util.Map;

public class Person {
	private int id;
	private String name;
	private int age;
	private Map<String,Double> diseaseCost;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Double> getDiseaseCost() {
		return diseaseCost;
	}
	public void setDiseaseCost(Map<String, Double> diseaseCost) {
		this.diseaseCost = diseaseCost;
	}
	
}
