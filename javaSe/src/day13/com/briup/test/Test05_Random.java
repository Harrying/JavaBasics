package day13.com.briup.test;

import java.util.HashSet;
import java.util.Set;

/*
 * 				Math��    Random��   			HashSet
 * ��дһ�����򣬻�ȡ10��[1,20]���������Ҫ������������ظ���
 * �������յ���������������̨��
 */
public class Test05_Random {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		int n;
		//���������
		int count = 0;
		while(true) {
			//[0,1.0) -->  [0.0,20.0) --> [1,20]
			//ǿ������ת��() ���ȼ� ���� �����
			//n = ((int)Math.random() * 20 + 1);

			n = ((int)(Math.random() * 20) + 1);
			count++;
			set.add(n);
			
			//ͨ�����ϵ�Ԫ�ظ���  ��֤ ��ȡ10�������
			if(set.size() == 10)
				break;
		}//ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
		
		System.out.println("һ���������������: " + count);
		
		for (Integer i : set) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
