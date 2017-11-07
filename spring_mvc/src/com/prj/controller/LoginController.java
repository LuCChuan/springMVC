package com.prj.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prj.bean.User;
import com.prj.dao.IDeptDao;

@Controller //���ཻ��spring����
@RequestMapping("/login") //ָ��controller��������
public class LoginController {
	@Resource
	private IDeptDao deptDao;
	
	/*
	 * ��ȡҳ��ֵ
	 * ͨ�������б��ȡ
	 * 1.@requestparm(��Ԫ������)+����
	 * 2.������������Ҫ��ҳ��nameһ�£�
	 */
	@RequestMapping(value="method")//ָ��������������
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
