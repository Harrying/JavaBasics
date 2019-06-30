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
		System.out.println("������Ҫ��������ݣ�");
	while(true) {
		
		String str = sc.nextLine();
		byte[] buff = str.getBytes();
		int len = buff.length;
		//���ն˵�ip��ַ
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = 
				new DatagramPacket(buff, len, addr, 9999);
		//3.�������ݰ�
		socket.send(packet);
		if("quit".equals(str)) {
			System.out.println("���ͽ�����");
			break;
		}
		
	}
		//2.׼�������ݰ�
		
		//4.�ر��׽���
		socket.close();
	}

	public void accept() throws Exception {
		DatagramSocket socket = new DatagramSocket(9999);
		while(true) {
			//2.׼�������ݰ������յġ��������ݺ��Զ�����
			byte[] buff = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buff, 1024);

			//3.�������ݰ���������д�����ݡ�
			socket.receive(packet);

			//4.�����ݰ��в�����ݳ���
			byte[] data = packet.getData();
			int len = packet.getLength();
			String st =new String(data, 0, len);
			
			if("quit".equals(st)) {
				System.out.println("���ս���");
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
			System.out.println("������Ҫ��������ݣ�");
		}
		
		//5.�ر��׽���
		socket.close();
	}

}
