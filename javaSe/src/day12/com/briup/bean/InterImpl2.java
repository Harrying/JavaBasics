package day12.com.briup.bean;

/*
 * ���ͽӿڵ�ʵ���� �ڶ�����ʽ
 */
public class InterImpl2 implements Inter<Integer, String> {
	@Override
	public void show(Integer e) {
		System.out.println("show e: " + e);
	}

	@Override
	public void disp(String u) {
		System.out.println("disp u: " + u);
	}

}
