package day22.com.briup.test;

/*
 * ö����ѧϰ
 * 
 */
public class Test11_Enum3 {
	
	public static void main(String[] args) {
		
		//switch(���ʽ) byte short char int 
		//						String ö��
		
		Week3 w = Week3.TUE;
		//Week3 w2 =  MON;
		
		System.out.println("ö��Ԫ�ر��: " + w.ordinal());
		System.out.println(w.compareTo(Week3.WED));
		
		Week3 w3 = Week3.valueOf(Week3.class, "TUE");
		System.out.println("w3: " + w3);
		
		switch(w) {
			//��switch�����  ö��Ԫ�ؿ���ֱ�ӳ���
			case MON:
				System.out.println("case ƥ�� MON");
				break;
			case TUE:
				System.out.println("case ƥ�� TUE");
				break;
			case WED:
				System.out.println("case ƥ�� WED");
				break;
			default:
				System.out.println("w�ĸ�ֵ����");
		}
		
	}
	
	public static void main1(String[] args) {
		int n = 15;
		
		//��ö�ٱ�����ֵ
		//	ö�������� ���� = ����.ö��Ԫ��;
		Week3 w1 = Week3.MON; //���Բ����� new ö������
		Week3 w2 = Week3.TUE;
		Week3 w3 = Week3.WED;
		
		w1.show();
	}
}

//����ö����� ��ʽ3
//	���԰���  ���󷽷�
enum Week3 {
	//ע�⣬ö��Ԫ�� ������ֵĵ�һ��
	MON("����һ") {
		@Override
		public void show() {
			System.out.println("show, ����һ");
		}
	},TUE("���ڶ�") {
		@Override
		public void show() {
			System.out.println("���ڶ�");
		}
	},WED("������") {
		@Override
		public void show() {
			System.out.println("������");
		}
	};
	
	private String name;
	
	//ע�⣬����������˽��
	private Week3(String name) {
		this.name = name;
	}
	
	//���󷽷�
	public abstract void show();
}

