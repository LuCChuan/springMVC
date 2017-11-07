package com.prj.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prj.bean.Dept;
import com.prj.dao.IDeptDao;
import com.prj.mapper.DeptMapper;

@Repository
public class DeptDao implements IDeptDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	@Resource(name="dm")
	private DeptMapper deptMapper;
	
	
	public List<Dept> queryAllDept() {
		return jdbcTemplate.query("select * from dept", deptMapper);
	}

	public boolean addDept(Dept dept) {
		int i = jdbcTemplate.update("insert into dept values(?,?,?)",new Object[]{dept.getId(),dept.getName(),dept.getLoc()});
		return i==1?true:false;
	}

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DeptMapper getDeptMapper() {
		return deptMapper;
	}

	public void setDeptMapper(DeptMapper deptMapper) {
		this.deptMapper = deptMapper;
	}

}
