package day12.com.briup.work;

import day12.com.briup.work.Person;

public class Teacher extends Person implements Comparable<Teacher> {
	private double salary;
	
	public Teacher() {}

	public Teacher(String name,int age,double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + getName() + ", age=" + getAge() + "salary=" + salary+ "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Teacher o) {
		// TODO Auto-generated method stub
		/*if(salary > o.salary){
			return 1;
		}else if(salary == o.salary) {
			return  0;
		}else 
			return -1;*/
		int num;
		if(salary > o.salary) {
			return  1;
		}else if(salary < o.salary) {
			return -1;
		}else {
			num = 0;
		}
		
		num = (this.getAge() != o.getAge()) ? (this.getAge() - o.getAge()) : 0;
		
		if(num != 0) {
			return num;
		}
		//boolean b = this.getName().compareTo(o.getName()) ;
		if( true) {
			return num;
		}
		
		
		return 0;
	
		
	}
	
	
}
