package day20.com.briup.test;

/*
 * 同步代码块 不允许嵌套，容易造成死锁
 * 	程序无法往下运行
 */
public class Test02_死锁 {
	private static String s1 = "筷子左";
	private static String s2 = "筷子右";
	
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println(getName() + "...拿到" + s1 + "等待" + s2);
						synchronized(s2) {
							System.out.println(getName() + "...拿到" + s2 + "开吃");
						}
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println(getName() + "...拿到" + s2 + "等待" + s1);
						synchronized(s1) {
							System.out.println(getName() + "...拿到" + s1 + "开吃");
						}
					}
				}
			}
		}.start();
	}
}
