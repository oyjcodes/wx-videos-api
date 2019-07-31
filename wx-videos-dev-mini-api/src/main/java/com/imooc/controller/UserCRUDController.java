package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Users;
import com.imooc.service.crud.UserCRUDService;
import com.imooc.utils.IMoocJSONResult;

@RestController
@RequestMapping("/crud")
public class UserCRUDController {
	
	@Autowired
	private UserCRUDService userCRUDService;
	
	@RequestMapping("/save")
	public IMoocJSONResult save() {
		
		Users user = new Users("1001", "test-saveuser-1001",
				"123456", "/path", "慕课网", null, null, null);
		userCRUDService.saveUser(user);
		
		return IMoocJSONResult.ok();
	}
	
	@RequestMapping("/update")
	public IMoocJSONResult update() {
		
		Users user = new Users("1001", "test-saveuser-1111",
				"77777", "/path000", "慕课网好牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return IMoocJSONResult.ok();
	}
	
	@RequestMapping("/update2")
	public IMoocJSONResult update2() {
		
		Users user = new Users("1001", null,
				"9999", "/path000999", "慕课网好牛十分牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return IMoocJSONResult.ok();
	}
	
	@RequestMapping("/delUser")
	public IMoocJSONResult delUser() {
		
		userCRUDService.delete();
		
		return IMoocJSONResult.ok();
	}
}
