package day22.com.briup.test;

/*
 * jdk8������
 * 	1.�ӿ��п��Զ��巽��
 */
public class Test12_JDK8 {
	
	public static void main(String[] args) {
		System.out.println(Inter.num);
		//Inter.num = 12;

		//Ĭ�� final int n = 12;
		int n = 12;
		//�������ڲ��������ʹ�þֲ��������� Ĭ��final����
		Inter i = new Inter() {
			@Override
			public void show() {
				//n = 10;
				System.out.println("show, n: " + n);
			}
		};
		
		i.show();
		i.disp();
		
		Inter.sdisp();
		
		System.out.println("*****************");
		
		//JDK8����lambda���ʽ�������� �����ڲ���򻯵õ���
		//	ֻ����� ֻ����һ�����󷽷��Ľӿ�  ʹ��Lambda���ʽ
		Inter i2 = ()->System.out.println("show, n: " + n);
		i2.show();
	}
	
}

interface Inter {
	//public static final 
	int num = 10;
	
	//public abstract 
	void show();
	
	//jdk8�У��ӿ��п��Զ��巽�������Ǳ���default����
	default public void disp() {
		System.out.println("in disp, num: " + num);
	}
	
	//jdk8�п��Զ��� static����
	public static void sdisp() {
		System.out.println("in static disp, num: " + num);
	}
}









