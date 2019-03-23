package com.imooc.extend;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one=new Cat();
		one.setName("妮妮");
		one.setSpecies("中华田园猫");
		one.eat();
		one.run();
		System.out.println("-------------------");
		Dog two= new Dog();
		two.setName("花花");
		two.setMouth(1);
		two.eat();
		two.sleep();
//		Animal three = new Animal();
		System.out.println("-------------------");
		two.eat("凡凡");
		
		
		
		

	}

}
