package day16.com.briup.work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Work1_øΩ±¥º”√‹ {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/mySTUDY/java µ—µ/javaSe/src/day16/com/briup/work/1.png");
		OutputStream os = new FileOutputStream("C:/mySTUDY/java µ—µ/javaSe/src/day16/com/briup/work/2.png");
		
		
		int len;
		
		while((len = is.read()) != -1) {
			os.write(len ^ 3);
		}
		
		os.close();
		is.close();
		
	}
}
