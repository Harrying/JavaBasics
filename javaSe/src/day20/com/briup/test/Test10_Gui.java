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
 * GUI编程
 */
public class Test10_Gui {
	public static void main(String[] args) {
		//1.创建空白窗体【顶级容器】
		Frame f = new Frame();
		
		//2.调整窗体的位置 尺寸
		f.setSize(400, 300);
		f.setLocation(150, 110);
		
		//3.往窗体上添加组件
		Button b1 = new Button("按钮1");
		Button b2 = new Button("按钮2");
		f.add(b1);
		f.add(b2);
		
		//4.设置布局管理器
		f.setLayout(new FlowLayout());
		
		f.setVisible(true);
		
		//通过事件监听机制，给 组件添加点击|操作 效果
		//	事件: 用户对组件的操作，就是一个事件 
		//	系统中已经默认 定义了 很多事件处理函数，一旦事件发生，函数会被自动调用
		//5. 设置|重写 事件处理函数     //默认适配器模式
		b1.addMouseListener(new MouseAdapter() {
			//鼠标放开事件
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
			
			//重写事件处理函数、
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







