package day10.com.briup.work;

public class CountTest {
	public static void main(String[] args) {
		String s = "ahsojdhojahodUOJ%^&%74156";
		int len = s.length();
		int a1 = 0,a2 = 0,a3 = 0,a4 = 0;
		System.out.print("�ַ���Ϊ��");
		for(int i = 0;i < len;i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for(int i = 0;i < len;i++) {
			if(s.charAt(i) <= 90 && s.charAt(i)>=65 ) {
				a1++;
			}else if(s.charAt(i) >= 97 && s.charAt(i)<=122) {
				a2++;
			}else if(s.charAt(i) >= 48 && s.charAt(i)<=57){
				a3++;
			}else {
				a4++;
			}
		}
		System.out.println("Сд�ַ����ֵĴ�����" + a2);
		System.out.println("��д�ַ����ֵĴ�����" + a1);
		System.out.println("�����ַ����ֵĴ�����" + a3);
		System.out.println("�����ַ����ֵĴ�����" + a4);
	}
}
