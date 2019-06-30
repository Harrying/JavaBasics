package day19.com.briup.work;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import day18.com.briup.work.Student;

public class Work2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader(new FileReader("src\\day19\\com\\briup\\work\\user.txt"));
		List<Student> list = new ArrayList<Student>();
		
		Thread th1 = new Thread("写入线程") {
			@Override
			public void run() {
				try {
					String str;
					while((str = br.readLine()) != null) {
						String[] spi = str.split(":");
						list.add(new Student(spi[0], Double.parseDouble(spi[1]), Integer.parseInt(spi[2])));
					}
					br.close();
					System.out.println(Thread.currentThread().getName() + "运行结束");
					
					ObjectOutputStream oos = 
							new ObjectOutputStream(new FileOutputStream("src\\day19\\com\\briup\\work\\user.txt"));
					oos.writeObject(list);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread th2 = new Thread("读取线程") {
			@Override
			public void run() {
				try {
					Thread.sleep(30);
					ObjectInputStream ois = 
							new ObjectInputStream(new FileInputStream("src\\day19\\com\\briup\\work\\user.txt"));
					List<Student> list2 = (List<Student>) ois.readObject();
					for (Student s : list2) {
						System.out.println(s);
					}
					
					ois.close();
					PrintStream ps = new PrintStream("src\\day19\\com\\briup\\work\\user.txt");
					Object[] obj = list2.toArray();
					ps.println(obj[0]);
					ps.println(obj[1]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "运行结束");
			}
		};
		
		th1.start();
		th2.start();
		
	}
}
