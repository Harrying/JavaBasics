package day17.com.briup.Work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test02_���� {
	public static void main(String[] args) throws Exception {
		
		//1.���г��򣬴�config.txt�ж�ȡʣ��Ĵ���
		//��ȡһ�У�ת����int
		BufferedReader br = 	//ֻҪ�ǲ����ļ���һ��Ҫͨ���ļ���
				new BufferedReader(new FileReader("src\\day18\\com\\briup\\homework\\config.txt"));
		
		//2.�����ʾ��Ϣ: ʣ�����
		String line = br.readLine();
		int num = Integer.parseInt(line);
		if(num <= 0) {
			//	ע�⣬����Ϊ0�����������ʾ��Ҳ�����ٴ�д��
			System.out.println("���ô������꣬�빺������!");
			br.close();
			return;
		}
		
		//����Ͳ��� ����Ϊ0������ˣ����������߼�����
		//3.��������1������д�������ļ�
		System.out.println("���ô�����ʣ " + num + " ��");
		num--;
		//ʹ����ɾ͹ر���
		br.close();
		
		//������д�ص�ͬһ���ļ�����֤�������Ѿ��ر�
		//д�ַ� "9" "1" "0" "10"
		FileWriter fw = new FileWriter("src\\day18\\com\\briup\\homework\\config.txt");
		//дһ���ַ�[9��ӦASCII������Ǹ��ַ�] �� �ļ�
		//	���ַ��� "9" ֱ��д��  
		fw.write(""+num);
		
		fw.close();
	}
}






