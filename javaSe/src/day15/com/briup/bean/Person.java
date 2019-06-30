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
	
	//throws�ؼ���: �����÷��� Ҫ�׳�һ������ �쳣
	public void setAge(int age) throws AgeException {
		//����������䲻���ʣ����������׳��쳣��
		if(age < 0 || age > 130) {
//			System.out.println("����ֵ������");
//			return;
			
			//�׳��쳣�ĸ�ʽ:
			//	throw �쳣���󡾱���ʱ�쳣��;
			//Exception e = new Exception("���䲻����");
			AgeException e = new AgeException("���䲻����");
			throw e;
			
			//����ʱ�쳣�����Բ��� ��ʽ����
			//ֻ�е� ���������󣬲Ż������
//			throw new RuntimeException("���䲻����");
		}
		
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//ϣ����д�ķ���
	public Person getPerson(String name,int age) {
		Person p = new Person(name,age);
		return p;
	}
	
	//������������  ������Դ���ͷŶ���ʱ��ϵͳ�Զ����ø÷���
	/*@Override
	protected void finalize() throws Throwable {
		//��������������
		
		System.out.println("Person����  �Ѿ�������...");
	}*/
}
