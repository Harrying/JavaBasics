package day15.com.briup.bean;

import java.sql.SQLException;

/*
 * 定义子类，重写setAge方法
 */
public class Student extends Person {
	private String id;
	
	public Student() {}
	
	public Student(String name,int age,String id) {
		super(name,age);
		this.id = id;
	}
	
	//	函数名一样，形参列表一样，返回值一样
	//方法重写，其访问权限不能变小   异常的范围不能扩大
	public void setAge(int age) throws AgeException {
		
		System.out.println("in Student setAge...");
	}
	
	//重写方法，关心   返回值类型 是否必须要一致
	//	如果子类的返回值类型 是  父类返回值类型的子类型，是否构成重写
	public Student getPerson(String name, int age) {
		System.out.println("in Student重写的方法");
		
		Student s = new Student(name,age,"001");
		return s;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	
}





