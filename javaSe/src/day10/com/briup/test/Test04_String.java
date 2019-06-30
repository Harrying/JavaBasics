package day10.com.briup.test;

/*
 * String类方法测试
 */
public class Test04_String {
	//判断功能测试
	public static void main(String[] args) {
		String s1 = null;
		
		//定义 空字符串 对象
		String s2 = "";
		String s3 = new String();
		
		System.out.println("s2.equals(s3): " + s2.equals(s3));
		
		//System.out.println("isEmpty: " + s1.isEmpty());
		System.out.println("isEmpty: " + s2.isEmpty());
		System.out.println("isEmpty: " + s3.isEmpty());
		
		String s4 = "hello world";
		System.out.println(s4.startsWith("hell"));
		System.out.println(s4.endsWith("old"));
		System.out.println(s4.contains("llo"));
		
		//从s4里面找 是否存在 子串"orl",从下标 8开始搜索
		int index = s4.indexOf("orl");
		int index2 = s4.indexOf("orl", 8);
		System.out.println("index : " + index);
		System.out.println("index2 : " + index2);
		
		//从字符串中 截取子串
		s4 = "hello world";
		String s5 = s4.substring(5);//从index截取到尾部
		String s6 = s4.substring(5,7);//从index截取到end
		
		System.out.println("s5:" + s5);
		System.out.println("s6:" + s6);
		
		String s7 = "hello";
		//字符串连接
		String s8 = s7.concat("world");
		System.out.println("s8: " + s8);
		
//		String s9 = s8.replace('e', 'a');
		String s9 = s8.replace("llow", "LLO");
		System.out.println("s9: " + s9);
		
		String s10 = "  zhang san   ";
		String s11 = s10.trim();
		System.out.println("s11:" + s11);
		
		//"helloworldnihaobuhaohello";
		
//		for(int i = 0; i < s4.length(); i++) {
//			System.out.println(s4.charAt(i));
//		}
		
	}
	
	public static void main1(String[] args) {
		//demo1();
		/* 1.判断定义为String类型的s1和s2是否相等 
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		*/
		
	/*
	* 2.下面这句话在内存中创建了几个对象?
		* String s1 = new String("abc");
	* 3.判断定义为String类型的s1和s2是否相等 */
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2); 			
		System.out.println(s1.equals(s2)); 
	
	/* 4.判断定义为String类型的s1和s2是否相等
		* String s1 = "a" + "b" + "c";
		* String s2 = "abc";
		* System.out.println(s1 == s2); ?			
		* System.out.println(s1.equals(s2));
	* 5.判断定义为String类型的s1和s2是否相等
		* String s1 = "ab";
		* String s2 = "abc";
		* String s3 = s1 + "c";	//new StringBuffer --> toString
		* System.out.println(s3 == s2);
		* System.out.println(s3.equals(s2)); 
		*/
	}

	private static void demo1() {
		//提取代码 到方法中  alt+shift+m
		byte[] arr = {97, 98, 99, 100};
		String s1 = new String(arr);
		String s2 = new String(arr,1,2);
		//	创建几个对象？ 2个【堆 new，字面值常量 常量池】
		String s3 = new String("hello");
		
		//				toString()
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
	}
}
