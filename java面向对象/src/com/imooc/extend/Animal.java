package com.imooc.extend;

public class Animal {
	private String name;//昵称
	private int mouth;//月份
	private String species;//品种
	
	
	public Animal() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMouth() {
		return mouth;
	}


	public void setMouth(int mouth) {
		this.mouth = mouth;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}
	
	//吃东西
	public void eat() {
		System.out.println(this.getName()+"在吃东西");
	}
	
	public void eat(String name) {
		System.out.println(name+"在吃东西");
	}


}
