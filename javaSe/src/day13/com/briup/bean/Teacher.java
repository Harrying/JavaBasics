package day13.com.briup.bean;

//如果要往TreeSet中添加  Teacher对象，一定要让Teacher实现排序接口
//	自然排序
public class Teacher extends Person implements Comparable<Teacher> {
	private double salary;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void teach() {
		System.out.println(this.getName() + " 在讲课");
	}
	
	@Override
	public String toString() {
		return "Teacher [name: " + this.getName() + " age: " + this.getAge() + " salary=" + salary + "]";
	}

	@Override
	public int compareTo(Teacher o) {
		//比较自定义类，比较 属性
		//	name  age  salary
		
		
		//返回0： 两个对象 相同    返回 正整数  this对象 大 
		//	返回负整数 this对象小
		//按照工资排序
		/*if(salary > o.salary)
			return 1;
		else if(salary == o.salary)
			return 0;
		else 
			return -1;*/
		
		//先按照  工资比较，再按照年龄比较，再按照姓名比较
		int num;
		if(salary > o.salary)
			return 1;
		else if(salary < o.salary)
			return -1;
		else
			num = 0;
		
		//如果工资相同，再按照 年龄比较
		num = (this.getAge() != o.getAge()) ? (this.getAge() - o.getAge()) : 0;
		
		if(num != 0)
			return num;
		
		//如果String年龄也相同，再次比较姓名   String是否实现 Comparable接口
		num = this.getName().compareTo(o.getName());
		
		return num;
	}
}



