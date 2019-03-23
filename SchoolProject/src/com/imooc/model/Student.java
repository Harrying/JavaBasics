package com.imooc.model;

public class Student {
	// 成员属性
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

//无参构造
	public Student() {

	}
	/**
	 * 四参数构造方法
	 * @param studentNo
	 * @param studentName
	 * @param studentSex
	 * @param studentAge
	 */
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
	}

//带参构造
	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studebtSubject) {
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentSubject(studebtSubject);
	}


	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		if (studentSex == "男" || studentSex == "女") {
			this.studentSex = studentSex;
		} else {
			this.studentSex = "男";
			System.out.println("性别格式输入错误,系统默认设置为男性");
		}

	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		if (studentAge >= 10 && studentAge <= 100) {
			this.studentAge = studentAge;
		} else {
			System.out.println("年龄格式输入错误");
		}

	}

	/**
	 * 获取专业对象，如果对象没有实例化，先实例化再返回
	 * 
	 * @return 专业对象的信息
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null)
			this.studentSubject = new Subject();
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	/**
	 * 学生自我介绍方法
	 * 方案三：在类中添加专业对象作为属性，通过其属性获得相关信息
	 *       关联性更强
	 * @return 自我介绍的信息
	 */
	public String introduction() {
		String str = "学生信息如下：\n姓名:" + this.getStudentName() + "\n学号:" + this.getStudentNo() + "\n性别:"
				+ this.getStudentSex() + "\n年龄:" + this.getStudentAge() + "\n所报专业名称:"
				+ this.getStudentSubject().getSubjectName() + "\n学制年限:" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	/**
	 * 学生自我介绍的方法
	 * 方案一：在方法中添加两个参数，分别表示专业名称和学制年限，
	 *       容易理解，但参数列表较长
	 * @param subjectName
	 * @param subjectLife
	 * @return
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下：\n姓名:" + this.getStudentName() + "\n学号:" + this.getStudentNo() + "\n性别:"
				+ this.getStudentSex() + "\n年龄:" + this.getStudentAge() + "\n所报专业名称:" + subjectName + "\n学制年限:"
				+ subjectLife;
		return str;
	}

	/**
	 * 方案二：在方法中添加一个专业对象作为参数，通过其属性获得其相关信息
	 *       参数列表简单，获取参数方便
	 * @param mySubject 所选专业的对象
	 * @return
	 */

	public String introduction(Subject mySubject) {
		String str = "学生信息如下：\n姓名:" + this.getStudentName() + "\n学号:" + this.getStudentNo() + "\n性别:"
				+ this.getStudentSex() + "\n年龄:" + this.getStudentAge() + "\n所报专业名称:" + mySubject.getSubjectName()
				+ "\n学制年限:" + mySubject.getSubjectLife() + "\n专业编号:" + mySubject.getSubjectNo();
		return str;
	}

}
