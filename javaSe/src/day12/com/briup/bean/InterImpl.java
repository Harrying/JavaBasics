package day12.com.briup.bean;

//定义 实现类
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