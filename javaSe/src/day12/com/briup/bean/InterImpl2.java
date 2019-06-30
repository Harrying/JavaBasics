package day12.com.briup.bean;

/*
 * 泛型接口的实现类 第二种形式
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
