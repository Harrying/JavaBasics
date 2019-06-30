package day15.com.briup.work;

public class Student {
	private String name;
	private int age;
	private String id;
	
	public Student() {}
	
	

	public Student(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) throws IdException2 {
		
		String[] d = id.split("-");
		int i = Integer.parseInt(d[1]);
		if(d.length != 2) {
			throw new IdException2("—ß∫≈∏Ò Ω¥ÌŒÛ");
		}else if(d[0].equals("A01")==false) {
			throw new IdException2("∞‡º∂±‡∫≈¥ÌŒÛ");
		}else if(i < 16001 && i > 16030) {
			throw new IdException2("—ß∫≈∑∂Œß ‰»Î¥ÌŒÛ");
		}else {
			this.id = id;
			
		}
		
		
		
	}












	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (age != other.age)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	
}
