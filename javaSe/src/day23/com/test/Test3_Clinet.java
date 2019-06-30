package day23.com.test;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Test3_Clinet {
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("客户端连接 到服务器成功...");
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		PrintStream ps = new PrintStream(os);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个类的全包名：");
		String line = sc.nextLine();
		
		
		ps.print(line);
		System.out.println(line);
		ps.println();
		System.out.println("录入类似setName.Jack的字符串:");
		String line1 = sc.nextLine();
		ps.print(line1);
		System.out.println(line1);
		
		
		sc.close();
		socket.close();
	}
}
