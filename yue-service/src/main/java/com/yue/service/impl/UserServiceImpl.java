package com.yue.service.impl;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.yue.mapper.TbUserMapper;
import com.yue.pojo.TbUser;
import com.yue.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private TbUserMapper tbUserMapper;
	
	@Override
	public TbUser login(String username) {
		// TODO Auto-generated method stub
		return tbUserMapper.login(username);
	}

}
