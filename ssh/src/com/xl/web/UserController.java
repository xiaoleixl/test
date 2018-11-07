package com.xl.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xl.entity.User;
import com.xl.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/init.do")
	public String init() {
		return "login";
	}
	
	@RequestMapping("login.do")
	public String login(String username,String pwd,HttpServletRequest req, HttpServletResponse resp) {
		User user=userService.searchUser(username, pwd);
		if(user==null) {
			return "login";
		}
		req.getSession().setAttribute("user", user);
		return "main";
	}
	
	/*@RequestMapping("/regist.do")
	public String regist(String username,String pwd,HttpServletRequest req, HttpServletResponse resp) {
		User user=new User();
		user.setUserName(username);
		user.setPwd(pwd);
		if(userService.addUser(user)) {
			return "login";
		}
		req.setAttribute("tips", "注册失败");
		return "regist";
	}*/
}
