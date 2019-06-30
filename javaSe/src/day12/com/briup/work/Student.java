package day12.com.briup.work;

import day12.com.briup.work.Person;

public class Student extends Person {
	private double score;
	
	public Student() {}

	public Student(String name,int age,double score) {
		super(name, age);
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + super.getName() + ", age=" + super.getAge() + ",score=" + score+ "]";
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

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
		if(this.getAge() != other.getAge()) {
			return false;
		}
		if(this.getName() == null) {
			if(other.getName() != null) {
				return false;
			}
		}else {
			if(this.getName().equals(other.getName()) == false) {
			return false;
			}
		}
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}
	
	
	
	
	
}
