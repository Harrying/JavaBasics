package day10.com.briup.test;

public class Test01_Swap {
	//alt + /
	public static void main(String[] args) {
		//ѡ�ж��У�ctrl+/ ����ע�ͣ�һ����ע�� ����ѡ�е���
		//	ctrl+shift+/ ����ע��  
		//	ctrl+shift+\ ȡ������ע��
		/*int x = 10;
		int y = 20;
		swap(x,y);//Test01_Swap.swap(x,y);
		System.out.println("x: " + x + " y: " + y);*/
		
		int[] array = {3,2,1,4,6};
		change(array);
		
	}
	
	//��ַ����  ���鷴ת
	public static void change(int[] arr) {
		int len = arr.length;
		for(int i = 0; i < len/2; i++) {
			arr[i] = arr[i] ^ arr[len-i-1];
			arr[len-i-1] = arr[i] ^ arr[len-i-1];
			arr[i] = arr[i] ^ arr[len-i-1];
		}
	}
	
	//��ֵ����
	public static void swap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
}
