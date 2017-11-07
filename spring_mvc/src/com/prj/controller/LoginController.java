package com.prj.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prj.bean.User;
import com.prj.dao.IDeptDao;

@Controller //将类交给spring管理
@RequestMapping("/login") //指定controller访问名称
public class LoginController {
	@Resource
	private IDeptDao deptDao;
	
	/*
	 * 获取页面值
	 * 通过参数列表获取
	 * 1.@requestparm(表单元素名称)+变量
	 * 2.变量（变量名要跟页面name一致）
	 */
	@RequestMapping(value="method")//指定方法访问名称
	public String method(User user,HttpServletRequest request,HttpSession session){
		System.out.println(user.getUname());
		System.out.println(user.getUpwd());
		request.setAttribute("deptList", deptDao.queryAllDept());
		return "/show.jsp";
	}

	public IDeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	
	
	
}
