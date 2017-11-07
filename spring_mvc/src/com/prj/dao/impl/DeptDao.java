package com.prj.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.prj.bean.Dept;
import com.prj.dao.IDeptDao;

@Repository
public class DeptDao implements IDeptDao{
	
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	public List<Dept> queryAllDept() {
		return hibernateTemplate.find("from Dept");
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
