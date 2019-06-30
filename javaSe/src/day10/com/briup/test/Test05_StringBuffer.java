package day10.com.briup.test;

public class Test05_StringBuffer {
	
	public static void main(String[] args) {
		StringBuffer sbb = new StringBuffer("hello");
		sbb.insert(5, "123");
		System.out.println(sbb);
		
		sbb.delete(2, sbb.length()+5);
		System.out.println(sbb);
		
	}
	
	
	public static void main3(String[] args) {
		
		String str = "";
		StringBuffer stringBuffer = new StringBuffer("");
		//获取当前系统时间
		long s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str += i;
		}
		
		long e = System.currentTimeMillis();
		System.out.println(e - s);
	}
	
	public static void main1(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
		sb.append(1.3);
		byte b = 98;
		StringBuffer sb2 = sb.append(b);
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
		
		
		
		String str = sb.toString();
		System.out.println("sb: " + sb);
		System.out.println("str" + str);
	}
	
}
