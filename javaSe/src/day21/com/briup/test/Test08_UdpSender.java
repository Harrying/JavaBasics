package day21.com.briup.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * ʵ����һ�� UDP��㣬Ȼ��������
 * 
 */
public class Test08_UdpSender {
	public static void main(String[] args) throws Exception {
		//1.ʵ����udp���׽��ֶ���
		DatagramSocket socket = new DatagramSocket();
		
		//2.׼�������ݰ�
		byte[] buff = "hello ��Һ�".getBytes();
		int len = buff.length;
		//���ն˵�ip��ַ
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = 
				new DatagramPacket(buff, len, addr, 9999);
		
		//3.�������ݰ�
		socket.send(packet);
		
		//4.�ر��׽���
		socket.close();
	}
}







