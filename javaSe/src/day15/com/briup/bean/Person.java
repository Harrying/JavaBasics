package day15.com.briup.bean;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	//throws关键字: 声明该方法 要抛出一种类型 异常
	public void setAge(int age) throws AgeException {
		//如果给的年龄不合适，则主动【抛出异常】
		if(age < 0 || age > 130) {
//			System.out.println("年龄值不合适");
//			return;
			
			//抛出异常的格式:
			//	throw 异常对象【编译时异常】;
			//Exception e = new Exception("年龄不合适");
			AgeException e = new AgeException("年龄不合适");
			throw e;
			
			//运行时异常，可以不用 显式处理
			//只有当 运行起来后，才会出问题
//			throw new RuntimeException("年龄不合适");
		}
		
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//希望重写的方法
	public Person getPerson(String name,int age) {
		Person p = new Person(name,age);
		return p;
	}
	
	//当垃圾回收器  回收资源，释放对象时，系统自动调用该方法
	/*@Override
	protected void finalize() throws Throwable {
		//放入额外清理代码
		
		System.out.println("Person对象  已经被销毁...");
	}*/
}
