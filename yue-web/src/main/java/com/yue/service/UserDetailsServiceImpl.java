package com.yue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yue.pojo.TbUser;

public class UserDetailsServiceImpl implements UserDetailsService{

	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_SELLER"));
		TbUser user = userService.login(username);
		if(user!=null){
			return new User(username, user.getPassword(), authorities);
		}
		return null;
	}

}
