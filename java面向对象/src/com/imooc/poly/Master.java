package com.imooc.poly;

public class Master {
	/**喂养宠物
	 * 喂猫咪：吃完东西后主人带着玩线球
	 * 喂狗：吃完东西主人带着狗狗去睡觉
	 */
	
	//方案一：编写方法，传入不同类型的动物，调用各自类型的方法
//	public void feed(Cat cat){
//		cat.eat();
//		cat.ployBall();
//	}
//	
//	public void feed(Dog dog) {
//		dog.eat();
//		dog.sleep();
//	}
//	
	
	//方案二：编写方法传入动物的父类，方法中通过类型转换，调用指定类型的方法；
	public void feed(Animal obj) {
		if(obj instanceof Cat) {
			Cat temp=(Cat)obj;
			temp.eat();
			temp.ployBall();
		}else if(obj instanceof Dog) {
			Dog temp = (Dog)obj;
			temp.eat();
			temp.sleep();
			
		}
	}
	/**
	 * 饲养何种宠物
	 * 空闲时间较多：养狗狗
	 * 空闲时间不多：养猫咪
	 */
	
	//方案1：
//	public Dog hasManyTime() {
//		System.out.println("主任空闲时间比较充足，适合养狗狗");
//		return new Dog();
//	}
//	public Cat hasLittleTime() {
//		System.out.println("主任平时比较忙碌，适合养猫咪");
//    return new Cat();
//}
	//方案2：
	public Animal raise(boolean isManyTime) {
		if(isManyTime) {
			System.out.println("适合养狗");
			return new Dog();
		}else {
			System.out.println("适合养毛");
			return new Cat();
		}
	}
}
