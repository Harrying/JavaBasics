package day12.com.briup.test;

import day12.com.briup.bean.MyNode;
import day12.com.briup.bean.Teacher;

/*
 * ���������
 */
public class Test06_Node {
	public static void main(String[] args) {
		//ʵ��������
		//List<E>
		//List<Integer> list = new ArrayList<>();
		
		//������ʵ��������   ��Ҫ<>��ָ�� ��������
		//	���ͣ� ������������
		MyNode<Integer> node = new MyNode<>();
		node.setData(10);
		System.out.println(node);
		
		System.out.println("*********************");
		MyNode<String> node2 = new MyNode<>();
		node2.setData("zs");
		System.out.println(node2);
		
		//���ͷ����ĵ��ã�����ͨ�������� û������
		//	���õĹ����У�ϵͳ���Ծ�ȷ�� �������ͣ�Ȼ��ֵ
		node2.disp("lisi");
		node2.disp(123);
		node.disp(new Teacher("zs", 23, 2345.1));
		
		//��̬���ͷ����ĵ��ã�ͨ�����������ã�����ͨ��������û������
		//	ֱ��ͨ��   ����.static���ͷ���()
		//MyNode<String>.disp(13);
		MyNode.disp("hello world");
	}
}





