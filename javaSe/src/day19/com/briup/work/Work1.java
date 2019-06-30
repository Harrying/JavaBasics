package day19.com.briup.work;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Work1 {
	
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		
		

		Thread th1 = new Thread("线程1") {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					dos.writeInt(12);
					dos.writeDouble(1.2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "已运行");
			}
		};
		
		dos.close();
		bos.close();
		
		
		
		Thread th2 = new Thread("线程2") {
			
			@Override
			public void run() {
				ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
				DataInputStream dis = new DataInputStream(bis);
				
				try {
					Thread.sleep(30);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				int a = 0;
				double d = 0;
				try {
					a = dis.readInt();
					d = dis.readDouble();
					System.out.println("a:" + a + " d: " + d );
					
					dis.close();
					bis.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		th1.start();
		
		th2.start();
		
	}
}
