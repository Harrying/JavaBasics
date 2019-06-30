package day13.com.briup.work;

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private double score;
	
	public Student() {}

	public Student(String name, int id, double score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [姓名=" + name + ", 学号=" + id + ", java课程成绩=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}

	@Override
	/*public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getId() > o.getId()) {
			return 1;
		}else {
			return -1;
		}
		
	}*/
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getScore() < o.getScore()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	
}
