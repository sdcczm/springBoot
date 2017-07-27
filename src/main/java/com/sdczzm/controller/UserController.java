package com.sdczzm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sdczzm.mapper.UserMapper;
import com.sdczzm.model.User;

/**
 * ● GET（SELECT）：从服务器取出资源（一项或多项）。
  ● POST（CREATE）：在服务器新建一个资源。
  ● PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
  ● PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
  ● DELETE（DELETE）：从服务器删除资源。
 * 
 * @author QiHuifang
 *
 */

@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;

	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> userlist() {
		List<User> userList=userMapper.getUserList();
		return userList;
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String addUser(@RequestBody User user) {
		userMapper.insert(user);
		return "success";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.PUT)
	public String updateUser(@RequestBody User user) {
		userMapper.update(user);
		return "success";
	}
	

}
