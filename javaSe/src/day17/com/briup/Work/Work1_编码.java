package day17.com.briup.Work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * ׼��һ��utf-8���ļ� a.txt
 * ��ȡ�ļ����ݣ������ʾ��Ȼ��д�뵽b.txt����
 * ����b.txt��gbk����
 */
public class Work1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			Reader r = new InputStreamReader(new FileInputStream("src\\a.txt"), "utf-8");
			Writer w = new OutputStreamWriter(new FileOutputStream("src/b.txt"), "gbk");
		) {
			int len;
			System.out.println("�����ϢΪ��");
			while((len = r.read()) != -1) {
				System.out.print((char)len);
				w.write(len);
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
