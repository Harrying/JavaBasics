package com.imooc.poly;

//抽象类：abstract 不允许实例化,但是可以向上转型，指向子类实例
//包含抽象方法的一定是抽象类，抽象类不一定含有抽象方法
public abstract class Animal {
	//属性：昵称，年龄
	private String name;
	private int month;
	
	public Animal() {
	}
	
	public Animal(String name,int month) {
		this.name=name;
		this.month=month;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	
	//方法： 吃东西
	//抽象方法：不允许包含方法体,子类需要重写父类的抽象方法，否则子类也必须是抽象类
	//static final  private不能与adstract并存
	public abstract void eat();
	
	public static void say() {
		System.out.println("动物直接打招呼");
	}

}
