package day13.com.briup.bean;

//���Ҫ��TreeSet�����  Teacher����һ��Ҫ��Teacherʵ������ӿ�
//	��Ȼ����
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
		System.out.println(this.getName() + " �ڽ���");
	}
	
	@Override
	public String toString() {
		return "Teacher [name: " + this.getName() + " age: " + this.getAge() + " salary=" + salary + "]";
	}

	@Override
	public int compareTo(Teacher o) {
		//�Ƚ��Զ����࣬�Ƚ� ����
		//	name  age  salary
		
		
		//����0�� �������� ��ͬ    ���� ������  this���� �� 
		//	���ظ����� this����С
		//���չ�������
		/*if(salary > o.salary)
			return 1;
		else if(salary == o.salary)
			return 0;
		else 
			return -1;*/
		
		//�Ȱ���  ���ʱȽϣ��ٰ�������Ƚϣ��ٰ��������Ƚ�
		int num;
		if(salary > o.salary)
			return 1;
		else if(salary < o.salary)
			return -1;
		else
			num = 0;
		
		//���������ͬ���ٰ��� ����Ƚ�
		num = (this.getAge() != o.getAge()) ? (this.getAge() - o.getAge()) : 0;
		
		if(num != 0)
			return num;
		
		//���String����Ҳ��ͬ���ٴαȽ�����   String�Ƿ�ʵ�� Comparable�ӿ�
		num = this.getName().compareTo(o.getName());
		
		return num;
	}
}



