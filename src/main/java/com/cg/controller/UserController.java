package com.cg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.pojo.User;
import com.cg.service.UserService;

/**
 * 整合  Jsp
 * @author Administrator
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 在jsp展示写死的数据
	 * @param model
	 * @return
	 */
	@RequestMapping("/showUser")
	public String showUser(Model model){
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User(1,"小明",20));
		list.add(new User(2,"AA22bb",21));
		list.add(new User(3,"小蓝",22));
		model.addAttribute("list", list);
		return "userList";
	}
	/**
	 * 跳转页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user){
		this.userService.addUser(user);
		return "ok";
	}
}
