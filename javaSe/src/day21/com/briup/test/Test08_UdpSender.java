package day21.com.briup.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 实例化一个 UDP结点，然后发送数据
 * 
 */
public class Test08_UdpSender {
	public static void main(String[] args) throws Exception {
		//1.实例化udp的套接字对象
		DatagramSocket socket = new DatagramSocket();
		
		//2.准备好数据包
		byte[] buff = "hello 大家好".getBytes();
		int len = buff.length;
		//接收端的ip地址
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = 
				new DatagramPacket(buff, len, addr, 9999);
		
		//3.发送数据包
		socket.send(packet);
		
		//4.关闭套接字
		socket.close();
	}
}







