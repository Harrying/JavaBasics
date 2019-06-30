package day13.com.briup.bean;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//��дhashCode()����Object�̳е�hashCode�����ص�ֵַ
	//	��ͬ���ԵĶ���hashCodeֵһ����ͬ
	//	��ͬ���ԵĶ���hashCodeֵ������ͬ
	@Override
	public int hashCode() {
		//System.out.println("hashCode...");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	//��ݼ�����  hashCode
	//ֻ���� equals����
	/*@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		//�Ӵ˴���ʼ�Ƚ�  ���������ֵ
		//�����ж�
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		//��������� Student���ٶ����ж� score
		if(this instanceof Student) {
			Student s1 = (Student)this;
			Student s2 = (Student)obj;
			if(s1.getScore() != s2.getScore())
				return false;
		}else if(this instanceof Teacher) {
			Teacher t1 = (Teacher)this;
			Teacher t2 = (Teacher)obj;
			if(t1.getSalary() != t2.getSalary())
				return false;
		}
		
		return true;
	}*/
	
	
}
