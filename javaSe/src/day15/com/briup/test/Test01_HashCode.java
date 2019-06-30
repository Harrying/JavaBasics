package day15.com.briup.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test01_HashCode {
	public static void main(String[] args) {
		//子类对象集合
		Set<S> set1 = new HashSet<>();
		//添加成员 会自动调用 S中hashCode equals方法
		set1.add(new S("zs",23.4));
		set1.add(new S("ls",33.5));
		//set1.add(new S("ls",33.5));
		
		System.out.println("***************");
		
		//父类集合
		Set<P> set2 = new HashSet<>();
		//将set1中S对象 逐个添加到set2中，到底调用哪个hashCode equals ?
		//理解: set2中父类引用指向子类对象，再通过父类引用.重写方法()；
		//		最终调用到 了  子类重写的  hashCode,equals方法
		set2.addAll(set1);
	
		int a = 10;
		int b;
		
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("请录入一个整形数: ");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("录入数据为0，不可以做除数");
				num = 1;
			}
			b = a / num;
//		
			System.out.println("b: " + b);
//		}
		
	}
}

class S extends P {
	private double score;

	public S() {
		super();
	}

	public S(String name,double score) {
		super(name);
		this.score = score;
	}

	@Override
	public int hashCode() {
		System.out.println("in S hashCode...");
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in S equals...");
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof S))
			return false;
		S other = (S) obj;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}
	
}

class P {
	private String name;
	public P() {}
	public P(String name) {
		this.name = name; 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof P))
			return false;
		P other = (P) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}








