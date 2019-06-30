package day14.com.briup.bean;

import javax.print.attribute.standard.MediaSize.Other;

public class Student {
	private String name;
	private double chScore;
	private double mhScore;
	private double enScore;
	
	
	public Student() {}
	public Student(String name, double chScore, double mhScore, double enScore) {
		super();
		this.name = name;
		this.chScore = chScore;
		this.mhScore = mhScore;
		this.enScore = enScore;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getChScore() {
		return chScore;
	}
	public void setChScore(double chScore) {
		this.chScore = chScore;
	}
	public double getMhScore() {
		return mhScore;
	}
	public void setMhScore(double mhScore) {
		this.mhScore = mhScore;
	}
	public double getEnScore() {
		return enScore;
	}
	public void setEnScore(double enScore) {
		this.enScore = enScore;
	}
	
	public double getSumScore() {
		return chScore + mhScore +enScore; 
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", chScore=" + chScore + ", mhScore=" + mhScore + ", enScore=" + enScore + ", SumScore=" + getSumScore() +"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(chScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(enScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mhScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(chScore) != Double.doubleToLongBits(other.chScore))
			return false;
		if (Double.doubleToLongBits(enScore) != Double.doubleToLongBits(other.enScore))
			return false;
		if (Double.doubleToLongBits(mhScore) != Double.doubleToLongBits(other.mhScore))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
	
	
}
