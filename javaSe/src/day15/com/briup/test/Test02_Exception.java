package day15.com.briup.test;

/*
 * �쳣Ĭ�ϴ���ʽ
 * 	��ɶ�����ɣ�ֱ������һ�����ݣ�һֱ���ݵ�main�������ٽ���JVM
 * 	JVM��ȡ��ֱ�����������Ϣ��Ȼ�������ֹ
 * 		˭����һ��? ��ǰ�����ĵ��ú���������������
 */
public class Test02_Exception {
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 4, 2, 5, 7};
		System.out.println("׼����������...");
		
		outArray2(arr);
		
		System.out.println("main, �����������!");
		
	}
	
	//�� ��ǰ������ֱ�Ӳ����쳣�����д���
	public static void outArray2(int[] array) {
		//try-catch�����
		//	����ֻ�� 1��catch�飬Ҳ���Ը����catch�飬
		//	���Ը�finally������ֻ��һ������Ҳ���Բ���
		try {
			//���ܳ����쳣�Ĵ���
			for (int i = 0; i <= array.length; i++) {
				if(i == 2)
					System.out.println(array[array.length]);
				else
					System.out.println(array[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�쳣����,����Խ��");
		}/*catch() {
			
		}*///finally����д��Ҳ���Բ�д
		
		System.out.println("outArray2, forѭ�������ɹ�...");
	}
	
	public static void outArray(int[] array) {
		//����Խ���쳣  ��Ӧ����� �����ˡ�ϵͳ��Ĭ���׳� ���쳣����
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
}







