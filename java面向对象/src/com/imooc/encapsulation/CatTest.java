package com.imooc.encapsulation;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new Cat();
		one.SetName("凡凡");
		one.setMonth(-5);
		one.setSpecies("英国短毛猫");
		one.setWeight(65);
		
		
		
		System.out.println("昵称："+one.GetName());
		System.out.println("年龄:"+one.getMonth());
		System.out.println("体重："+one.getWeight());
		System.out.println("品种:"+one.getSpecies());

	}

}
