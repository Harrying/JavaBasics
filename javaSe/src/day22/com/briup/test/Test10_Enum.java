package day22.com.briup.test;

/*
 * ö����ѧϰ
 * 
 */
public class Test10_Enum {
	public static void main(String[] args) {
		int n = 15;
		
		//��ö�ٱ�����ֵ
		//	ö�������� ���� = ����.ö��Ԫ��;
		Week2 w1 = Week2.MON;
		Week2 w2 = Week2.TUE;
		Week2 w3 = Week2.WED;
		
		w1.show();
	}
}

//����ö����� ��ʽ2
enum Week2 {
	//ע�⣬ö��Ԫ�� ������ֵĵ�һ��
	MON("����һ"),TUE("���ڶ�"),WED("������");
	
	private String name;
	
	//ע�⣬����������˽��
	private Week2(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("name: " + name);
	}
}

/*class Week3 {
	public static final Week3 MON = new Week3("����һ");
	public static final Week3 TUE = new Week3("���ڶ�");
	public static final Week3 WED = new Week3("������");
	
	private String name;
	
	private Week3(String name) {
		this.name = name;
	}
}*/



