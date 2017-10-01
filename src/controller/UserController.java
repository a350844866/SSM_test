package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;

import service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll.action")
	public String findAll(Model model){
		List<User> userList = userService.findUserList();
		model.addAttribute("userList", userList);
		
		//返回具体的页面
		return "userList";
	}
	
	
	
	
	
	
	
	
}
