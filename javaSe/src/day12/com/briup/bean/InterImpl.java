package day12.com.briup.bean;

//���� ʵ����
public class InterImpl<E,U> implements Inter<E,U> {
	@Override
	public void show(E e) {
		System.out.println("show, e: " + e);
	}

	@Override
	public void disp(U u) {
		System.out.println("disp, u: " + u);
	}
}