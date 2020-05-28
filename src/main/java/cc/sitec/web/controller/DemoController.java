package cc.sitec.web.controller;

import cc.sitec.web.bean.User;
import cc.sitec.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *@author 凉水
 *@date 2020/5/27 17:52
 **/
@RestController
@RequestMapping("/")
public class DemoController {
	@Autowired
	private UserService userService;
	@GetMapping("/")
	public User test(@RequestParam("id") Integer id){
		return userService.findById(id);
	}
}
