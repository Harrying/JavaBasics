package com.imooc.model;

public class Subject {
	// 成员属性 : 学科名称，学科编号，学制年限，报名选修的学生信息,保存报名选修的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;

	// 无参构造方法
	public Subject() {

	}

	// 带参构造，实现对学科名称，编号，学制年限的属性的赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectLife(subjectLife);
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
	}
	// 带参构造，实现对属性的全部赋值
	public Subject(String subjectName, String subjectNo, int subjectLife,Student[] myStudent) {
		this.setSubjectLife(subjectLife);
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setMyStudents(myStudent);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// 设置学制年限>=0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}

	/**
	 * 获取选修专业的学生信息，如果保存学生信息的数组未被初始化，则先初始化长度200
	 * @return  保存学生信息的数组
	 */
	public Student[] getMyStudents() {
		if(this.myStudents==null)
			this.myStudents=new Student[200];
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息：名称，编号，相关信息
	 */

	public String info() {
		String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n学制年限："
				+ this.getSubjectLife();
		return str;
	}
	
	public void addStudent(Student stu) {
		/**
		 * 1，将学生保存到数组中
		 * 2，将学生个数保存到studentNum
		 */
		//1，将学生保存到数组中
		for(int i=0;i<this.getMyStudents().length;i++) {
			
			if(this.getMyStudents()[i]==null) {
				this.getMyStudents()[i]=stu;
			  this.studentNum=(i+1);
			  return;
		}
		//2，将学生个数保存到studentNum
		
	}

}
}
