package com.imooc.extend;

public class Cat extends Animal {
	private double weight;//体重
	
	public Cat() {
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public void run() {
		System.out.println(this.getName()+"是一只"+this.getSpecies()+"，他在快乐的奔跑");
	}

}
