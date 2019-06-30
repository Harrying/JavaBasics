package day13.com.briup.bean;

public class Student extends Person {
	private double score;

	public Student() {
		super();
	}

	public Student(String name, int age, double score) {
		super(name, age);
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public void study() {
		System.out.println(super.getName() + "正在学习");
	}

	@Override
	public String toString() {
		return "Student [name: " + this.getName() + " age: " + this.getAge() + " score=" + score + "]";
	}
	//重写hashCode  equals方法

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		/*if(this.getAge() != other.getAge()) 
			return false;
		if(this.getName() == null) {
			//如果this的名字为null，而other名字不为null,直接返回false
			if(other.getName() != null)
				return false;
		}else {
			//this的名字不为空，如果和other的名字不一样，直接返回false
			if(this.getName().equals(other.getName()) == false) {
				return false;
			}
		}*/
		//进一步判断  分数是否一致   
		//	浮点数  的二进制形式 很特殊
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}
	
}




