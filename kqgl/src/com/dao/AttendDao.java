package com.dao;

import java.util.List;

import com.eneity.Attend;

public interface AttendDao {
		// 添加考勤
		public boolean addAttend(Attend attend);
		// 删除考勤
		public boolean deleteAttend(Attend attend);
		// 修改考勤
		public boolean updateAttend(int id, Attend attend);
		// 查询所有考勤
		public List<Attend> selectAttend();
		// 查询单个考勤
		public List<Attend> selectOneAttend(Attend attend);
	}