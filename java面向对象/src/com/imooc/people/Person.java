package com.imooc.people;

public class Person {
    int age;
    public Heart getHeart() {
    	
    	return new Heart();
    }
    //成员内部类
    /**
     * 1.内部类在外部使用时无法直接实例化，需要借外部类信息才能实例化
     * 2.内部类的访问修饰符可以任意，但是访问范围会受到影响 
     * 3.内部类可以直接访问外部类的成员和方法，如果出现同名的属性，优先访问内部类中定义的
     * 4.可以使用外部类.this.成员的方式，访问外部类中同名的信息
     * 5.外部类访问内部类信息，需要通过内部类实例，无法直接访问
     * 6.内部类编译后.class文件名：外部类$内部类.class 
     */
    class Heart{
    	public String beat() {
    		return "心脏在跳动";
    	}
    }
}
