package day12.com.briup.work;

import java.util.ArrayList;

/*
 * 2.ʵ����ArrayList������������ַ�����Ȼ��������ַ�����
   *    Ȼ����һ������������ȥ���������ַ������ظ�ֵ�����Խ�����һ��List��
 * public Collection<String> getSingle(Collection<String> coll);
 */
public class Work2_list {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Work2_GetSingle  ddd  = new Work2_GetSingle();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("bbbb");
		list.add("cccc");
		list.add("dddd");
		
		//����
		for (String ss : list) {
			System.out.println(ss);
		}
		
		ddd.getSingle(list);
		
		System.out.println("***********ɾ����ͬԪ��***********");
		
		
		for (String ss : list) {
			System.out.println(ss);
		}
		
	
		
	}
 
	
}


