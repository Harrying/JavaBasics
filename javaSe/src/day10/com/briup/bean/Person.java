package day10.com.briup.bean;

/*personĬ�ϼ̳�Object
 * class Person extends Object
 */
public class Person {
	//����
	private String name;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	//��дtoString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	//shife + out + s
//	public boolean equals(Object obj) {
//		//�Ƚ����е�����ֵ
//		if (obj instanceof Person) {
//			Person p = (Person)obj;
//			//����Ƚ�������������  equals���бȽ�
//			if(this.age == p.age && name.equals(p.name)) {
//				return true;
//			}else {	
//		}
//	}
//		return false;
//
//}
	
	
}
