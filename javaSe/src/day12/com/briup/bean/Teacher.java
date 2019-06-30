package day12.com.briup.bean;

public class Teacher extends Person {
	
	private double salary;
	public Teacher() {
		super();
		
	}
	public Teacher(String name, int age, double salary) {
		super(name,age);
		
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [name= " + super.getName() + ", age= " + this.getAge() + " salary= " + salary + "]";
	}
	
	
}
