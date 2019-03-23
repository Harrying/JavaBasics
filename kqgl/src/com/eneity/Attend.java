package com.eneity;

/**
 * @author whr
 *
 */
public class Attend {
	private String id;
	private int kq_id;
	private String kq_time;
	private String kq_1;
	private String kq_2;
	private String kq_3;
	private String kq_4;
	private String kq_type;
	private String start_time;
	private String stop_time;
	private float kq_salary;
	private String name;
	private String department;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getKq_id() {
		return kq_id;
	}

	public void setKq_id(int kq_id) {
		this.kq_id = kq_id;
	}

	public String getKq_time() {
		return kq_time;
	}

	public void setKq_time(String kq_time) {
		this.kq_time = kq_time;
	}

	public String getKq_1() {
		return kq_1;
	}

	public void setKq_1(String kq_1) {
		this.kq_1 = kq_1;
	}

	public String getKq_2() {
		return kq_2;
	}

	public void setKq_2(String kq_2) {
		this.kq_2 = kq_2;
	}

	public String getKq_3() {
		return kq_3;
	}

	public void setKq_3(String kq_3) {
		this.kq_3 = kq_3;
	}

	public String getKq_4() {
		return kq_4;
	}

	public void setKq_4(String kq_4) {
		this.kq_4 = kq_4;
	}

	public String getKq_type() {
		return kq_type;
	}

	public void setKq_type(String kq_type) {
		this.kq_type = kq_type;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getStop_time() {
		return stop_time;
	}

	public void setStop_time(String stop_time) {
		this.stop_time = stop_time;
	}

	public float getKq_salary() {
		return kq_salary;
	}

	public void setKq_salary(float kq_salary) {
		this.kq_salary = kq_salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Attend{" +
				"id='" + id + '\'' +
				", kq_id=" + kq_id +
				", kq_time='" + kq_time + '\'' +
				", kq_1='" + kq_1 + '\'' +
				", kq_2='" + kq_2 + '\'' +
				", kq_3='" + kq_3 + '\'' +
				", kq_4='" + kq_4 + '\'' +
				", kq_type='" + kq_type + '\'' +
				", start_time='" + start_time + '\'' +
				", stop_time='" + stop_time + '\'' +
				", kq_salary=" + kq_salary +
				", name='" + name + '\'' +
				", department='" + department + '\'' +
				'}';
	}
}
