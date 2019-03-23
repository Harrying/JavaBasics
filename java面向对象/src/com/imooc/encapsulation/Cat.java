package com.imooc.encapsulation;

public class Cat {
	private String name;
	private int month;
	private double weight;
	private String species;
	
	
	public Cat() {
		
	}
	


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		if(month<=0) {
			System.out.println("年龄输入错误");
		}else {
		this.month = month;
		}
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public void SetName(String name) {
		this.name=name;
	}
	
	public String GetName() {
		return "我是一只名叫："+this.name+"的猫咪";
	}
	
	}

