package day22.com.briup.test;

/*
 * ö����ѧϰ
 * 
 */
public class Test09_Enum {
	public static void main(String[] args) {
		int n = 15;
		
		//��ö�ٱ�����ֵ
		//	ö�������� ���� = ����.ö��Ԫ��;
		Week w1 = Week.MON;
		Week w2 = Week.TUE;
		Week w3 = Week.WED;
		//Week.WED = Week.TUE;
		//Week w4 = Week.FRI;
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		
		//Week2 w5 = Week2.MON;
	}
}

//��ʽ1
//enum ö������ { ö��Ԫ��1,Ԫ��2,...;  }
enum Week {
	//������Ϊ ö��Ԫ�ؾ���  ������� public static final����
	MON,TUE,WED;
}

/*class Week2 {
	public final static Week2 MON = new Week2(); 
	public final static Week2 TUE = new Week2(); 
	public final static Week2 WED = new Week2(); 
}*/







