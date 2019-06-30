package day21.com.briup.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * ��udp������ ���ݰ�
 */
public class Test09_UdpReceiver {
	public static void main(String[] args) throws Exception {
		//1.����һ��udp�׽��� �����ն���Ҫ�ƶ�  �˿ںš�
		DatagramSocket socket = new DatagramSocket(9999);
		
		//2.׼�������ݰ������յġ��������ݺ��Զ�����
		byte[] buff = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buff, 1024);
		
		//3.�������ݰ���������д�����ݡ�
		socket.receive(packet);
		
		//4.�����ݰ��в�����ݳ���
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
		
		//5.�ر��׽���
		socket.close();
	}
}








