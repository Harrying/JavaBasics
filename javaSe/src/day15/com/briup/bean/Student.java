package day15.com.briup.bean;

import java.sql.SQLException;

/*
 * �������࣬��дsetAge����
 */
public class Student extends Person {
	private String id;
	
	public Student() {}
	
	public Student(String name,int age,String id) {
		super(name,age);
		this.id = id;
	}
	
	//	������һ�����β��б�һ��������ֵһ��
	//������д�������Ȩ�޲��ܱ�С   �쳣�ķ�Χ��������
	public void setAge(int age) throws AgeException {
		
		System.out.println("in Student setAge...");
	}
	
	//��д����������   ����ֵ���� �Ƿ����Ҫһ��
	//	�������ķ���ֵ���� ��  ���෵��ֵ���͵������ͣ��Ƿ񹹳���д
	public Student getPerson(String name, int age) {
		System.out.println("in Student��д�ķ���");
		
		Student s = new Student(name,age,"001");
		return s;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	
}





