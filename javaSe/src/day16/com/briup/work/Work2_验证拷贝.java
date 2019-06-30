package day16.com.briup.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Work2_验证拷贝 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("请输入文件路径：");
			String str = sc.next();
			File file = new File(str);
			if(file.isFile() != true) {
				continue;
			}else {
				InputStream is = new FileInputStream(str);
				OutputStream os = new FileOutputStream("src\\day16\\com\\briup\\work\\aa.txt");
				
				
				int len;
				while((len = is.read()) != -1) {
					os.write(len);
				}
				os.flush();
				
				os.close();
				is.close();
				
				
			}
			break;
		}
	}

}
