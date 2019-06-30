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
	
	//重写hashCode()，从Object继承的hashCode，返回地址值
	//	相同属性的对象，hashCode值一定相同
	//	不同属性的对象，hashCode值尽量不同
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
	
	
	
	
	//快捷键生成  hashCode
	//只保留 equals方法
	/*@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		//从此处开始比较  具体的属性值
		//类型判断
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		//如果类型是 Student，再额外判断 score
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
