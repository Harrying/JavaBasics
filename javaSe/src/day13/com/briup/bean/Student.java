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
		System.out.println(super.getName() + "����ѧϰ");
	}

	@Override
	public String toString() {
		return "Student [name: " + this.getName() + " age: " + this.getAge() + " score=" + score + "]";
	}
	//��дhashCode  equals����

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
			//���this������Ϊnull����other���ֲ�Ϊnull,ֱ�ӷ���false
			if(other.getName() != null)
				return false;
		}else {
			//this�����ֲ�Ϊ�գ������other�����ֲ�һ����ֱ�ӷ���false
			if(this.getName().equals(other.getName()) == false) {
				return false;
			}
		}*/
		//��һ���ж�  �����Ƿ�һ��   
		//	������  �Ķ�������ʽ ������
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}
	
}




