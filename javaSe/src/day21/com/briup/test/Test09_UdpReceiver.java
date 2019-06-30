package day21.com.briup.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 从udp结点接收 数据包
 */
public class Test09_UdpReceiver {
	public static void main(String[] args) throws Exception {
		//1.建立一个udp套接字 【接收端需要制定  端口号】
		DatagramSocket socket = new DatagramSocket(9999);
		
		//2.准备好数据包，【空的】接收数据后，自动填满
		byte[] buff = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buff, 1024);
		
		//3.接收数据包【往包中写入数据】
		socket.receive(packet);
		
		//4.从数据包中拆分数据出来
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println("receive: " + new String(data,0,len));
		System.out.println("buff: " + new String(buff,0,len));
		
		InetAddress addr = packet.getAddress();
		String hostIp = addr.getHostAddress();
		String hostName = addr.getHostName();
		int port = packet.getPort();
		System.out.println("ip: " + hostIp);
		System.out.println("name: " + hostName);
		System.out.println("port: " + port);
		
		//5.关闭套接字
		socket.close();
	}
}








