package com.prj.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prj.bean.Dept;
import com.prj.dao.IDeptDao;

@Controller
@RequestMapping("/index")
public class IndexController {
	@Resource
	private  IDeptDao deptDao;
	
	
	@RequestMapping("/method")
	public String method(HttpServletRequest request){
		request.setAttribute("deptList",deptDao.queryAllDept());
		return "/show.jsp";
	}

	@RequestMapping("/add")
	public String add(Dept dept,HttpServletRequest request){
		deptDao.addDept(dept);
		request.setAttribute("deptList",deptDao.queryAllDept());
		return "/show.jsp";
	}
	

	public IDeptDao getDeptDao() {
		return deptDao;
	}


	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	
}
