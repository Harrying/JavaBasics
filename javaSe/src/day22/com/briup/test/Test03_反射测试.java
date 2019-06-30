package day22.com.briup.test;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * �����������ʹ��
 */
public class Test03_������� {
	public static void main(String[] args) throws Exception {
		//ʵ����ˮ��
		//Fruit f = new Apple();
		
		BufferedReader br = 
				new BufferedReader(new FileReader("src/config.txt"));
		//���޸Ĵ��룬�õ� ��ͬ���������
		String className = br.readLine();
		// �Ȼ�ȡ����ֽ������
		Class<?> clazz1 = Class.forName(className);
		
		//�� ���ֽ������  ͨ������ʵ�����������
		//�ӿ����� ָ��  �������
		Fruit f = (Fruit) clazz1.newInstance();
		
		//ʵ����һ��ե֭������
		Juicer j = new Juicer();
		j.run(f);
	}
}

//����ե֭��
class Juicer {
	//����ˮ����Ȼ��ե֭
	public void run(Fruit f) {
		f.squeeze();
	}
}

//����ˮ���ӿ�
interface Fruit {
	//ե֭
	public void squeeze();
}

//���� ƻ����
class Apple implements Fruit {
	public void squeeze() {
		System.out.println("ե��һ��ƻ��֭��");
	}
}

//���� ������
class Orange implements Fruit {
	public void squeeze() {
		System.out.println("ե��һ������֭��");
	}
}







