package com.prj.dao;

import java.util.List;

import com.prj.bean.Dept;

public interface IDeptDao {
	
	public List<Dept> queryAllDept();
	public boolean addDept(Dept dept);
	
}
