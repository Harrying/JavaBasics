package day14.com.briup.bean;

public class Student2 {
	private String name;
	private double cScore;
	private double mScore;
	private double eScore;
	
	public Student2() {
		super();
	}
	public Student2(String name, double cScore, double mScore, double eScore) {
		super();
		this.name = name;
		this.cScore = cScore;
		this.mScore = mScore;
		this.eScore = eScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getcScore() {
		return cScore;
	}
	public void setcScore(double cScore) {
		this.cScore = cScore;
	}
	public double getmScore() {
		return mScore;
	}
	public void setmScore(double mScore) {
		this.mScore = mScore;
	}
	public double geteScore() {
		return eScore;
	}
	public void seteScore(double eScore) {
		this.eScore = eScore;
	}
	
	//自定义方法，获取学生的总分值
	public double getSumScore() {
		return cScore + mScore + eScore;
	}
	
	@Override
	public String toString() {
		
		return "Student2 [name=" + name + ", cScore=" + cScore + ", mScore=" + mScore + ", eScore=" + eScore + " sum: " + getSumScore()+"]";
	}
	
	//不用自己定义，直接使用快捷键生成即可
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(eScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mScore);
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
		if (!(obj instanceof Student2))
			return false;
		Student2 other = (Student2) obj;
		if (Double.doubleToLongBits(cScore) != Double.doubleToLongBits(other.cScore))
			return false;
		if (Double.doubleToLongBits(eScore) != Double.doubleToLongBits(other.eScore))
			return false;
		if (Double.doubleToLongBits(mScore) != Double.doubleToLongBits(other.mScore))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
