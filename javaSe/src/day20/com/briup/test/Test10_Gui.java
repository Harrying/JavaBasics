package day20.com.briup.test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * GUI���
 */
public class Test10_Gui {
	public static void main(String[] args) {
		//1.�����հ״��塾����������
		Frame f = new Frame();
		
		//2.���������λ�� �ߴ�
		f.setSize(400, 300);
		f.setLocation(150, 110);
		
		//3.��������������
		Button b1 = new Button("��ť1");
		Button b2 = new Button("��ť2");
		f.add(b1);
		f.add(b2);
		
		//4.���ò��ֹ�����
		f.setLayout(new FlowLayout());
		
		f.setVisible(true);
		
		//ͨ���¼��������ƣ��� �����ӵ��|���� Ч��
		//	�¼�: �û�������Ĳ���������һ���¼� 
		//	ϵͳ���Ѿ�Ĭ�� ������ �ܶ��¼���������һ���¼������������ᱻ�Զ�����
		//5. ����|��д �¼�������     //Ĭ��������ģʽ
		b1.addMouseListener(new MouseAdapter() {
			//���ſ��¼�
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(1);
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("closing");
				System.exit(1);
			}
		});
		
		/*f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//��д�¼���������
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("closing");
				System.exit(1);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("closd");
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});*/
	}
}







