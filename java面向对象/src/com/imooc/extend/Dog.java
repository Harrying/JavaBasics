package com.imooc.extend;

public class Dog extends Animal {
	private String sex;
	
	public Dog() {
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//睡觉的方法
	public void sleep() {
		System.out.println(this.getMouth()+"个月大的"+this.getName()+"在睡觉");
	}
	/**
	 * 方法重载
	 * 1.同一个类中
	 * 2.方法名相同，参数列表不同（参数顺序，个数，类型）
	 * 3，方法返回值，访问修饰符任意
	 * 4，与方法的参数名无关
	 * 
	 * 方法重写
	 * 1.有继承关系的子类中
	 * 2.方法名相同，参数列表相同（参数顺序，个数，类型），方法的返回值
	 * 3.访问修饰符,访问范围需要大于等于父类的访问范围
	 * 4.与方法的参数名无关
	 * 
	 */
//	private String sleep(String name) {
//		return"";
//	}
//	
//	private void sleep(int mouth,String name) {
//		
//	}
	
	
	//子类重写父类吃东西方法
	public void eat() {
		System.out.println(this.getName()+"最近没有食欲～～");
	}
	
	public void eat(String mounth) {
		System.out.println(mounth+"最近没有食欲～～");
	}


}
