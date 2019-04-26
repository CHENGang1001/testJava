package com.cg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.mapper.UserMapper;
import com.cg.pojo.User;
import com.cg.service.UserService;

//业务和事务
@Service
@Transactional
public class UserServiceImpl implements UserService {

	//注入mapper
	@Autowired
	private UserMapper UserMapper;
	@Override
	public void addUser(User user) {
		//这里面干具体的事情
		this.UserMapper.insertUser(user);

	}

}
