package day15.com.briup.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test01_HashCode {
	public static void main(String[] args) {
		//������󼯺�
		Set<S> set1 = new HashSet<>();
		//��ӳ�Ա ���Զ����� S��hashCode equals����
		set1.add(new S("zs",23.4));
		set1.add(new S("ls",33.5));
		//set1.add(new S("ls",33.5));
		
		System.out.println("***************");
		
		//���༯��
		Set<P> set2 = new HashSet<>();
		//��set1��S���� �����ӵ�set2�У����׵����ĸ�hashCode equals ?
		//���: set2�и�������ָ�����������ͨ����������.��д����()��
		//		���յ��õ� ��  ������д��  hashCode,equals����
		set2.addAll(set1);
	
		int a = 10;
		int b;
		
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("��¼��һ��������: ");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("¼������Ϊ0��������������");
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








