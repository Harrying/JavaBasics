package com.whr.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Notice类的对象，生成三条公告
		Notice notice1=new Notice(1, "欢迎到来", "管理员", new Date());
		Notice notice2=new Notice(2, "按时提交作业", "老师", new Date());
		Notice notice3=new Notice(3, "考勤通知", "老师", new Date());
		
		//添加公告
		ArrayList noticeList= new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		
		//显示公告
		System.out.println("公告的内容为：");
		for(int i =0;i<noticeList.size();i++) {
			System.out.println(i+1+":"+((Notice)(noticeList.get(i))).getTitle());
		}
		System.out.println("**************************************");
		 
		Notice notice4 = new Notice(4, "在线编辑器", "管理员", new Date());
		noticeList.add(1, notice4);
		// 显示公告
		System.out.println("添加公告的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
		}
		
		System.out.println("**************************************");
		// 删除按时完成作业的公告
		noticeList.remove(2);
		// 显示公告
		System.out.println("删除公告的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
		}
		
		System.out.println("**************************************");
		// 将第二条公告改为：Java在线编译器嗯可以使用了
		notice4.setTitle("Java在线编译器嗯可以使用了");
		noticeList.set(1, notice4);
		// 显示公告
		System.out.println("修改后公告的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
		}

	}

}
