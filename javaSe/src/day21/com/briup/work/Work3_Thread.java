package day21.com.briup.work;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Work3_Thread {
	public static void main(String[] args) {
		Transforme tf = new Transforme();
		Thread th1 = new Thread() {
			@Override
			public void run() {

				try {
					tf.accept();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread th2 = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
					tf.send();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		th1.start();
		th2.start();
	}
}

class Transforme {
		public void send() throws Exception {
		DatagramSocket socket = new DatagramSocket();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要传输的数据：");
	while(true) {
		
		String str = sc.nextLine();
		byte[] buff = str.getBytes();
		int len = buff.length;
		//接收端的ip地址
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = 
				new DatagramPacket(buff, len, addr, 9999);
		//3.发送数据包
		socket.send(packet);
		if("quit".equals(str)) {
			System.out.println("发送结束！");
			break;
		}
		
	}
		//2.准备好数据包
		
		//4.关闭套接字
		socket.close();
	}

	public void accept() throws Exception {
		DatagramSocket socket = new DatagramSocket(9999);
		while(true) {
			//2.准备好数据包，【空的】接收数据后，自动填满
			byte[] buff = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buff, 1024);

			//3.接收数据包【往包中写入数据】
			socket.receive(packet);

			//4.从数据包中拆分数据出来
			byte[] data = packet.getData();
			int len = packet.getLength();
			String st =new String(data, 0, len);
			
			if("quit".equals(st)) {
				System.out.println("接收结束");
				break;
			}
			System.out.println("receive: " + st);
			System.out.println("buff: " + new String(buff, 0, len));
			InetAddress addr = packet.getAddress();
			String hostIp = addr.getHostAddress();
			String hostName = addr.getHostName();
			int port = packet.getPort();
			System.out.println("ip: " + hostIp);
			System.out.println("name: " + hostName);
			System.out.println("port: " + port);
			System.out.println("请输入要传输的数据：");
		}
		
		//5.关闭套接字
		socket.close();
	}

}
