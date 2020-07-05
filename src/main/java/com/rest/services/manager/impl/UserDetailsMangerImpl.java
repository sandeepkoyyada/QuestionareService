package com.rest.services.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.services.dao.UserDetailsDAO;
import com.rest.services.manager.UserDetailsManager;

@Service("userDetailsManagerImpl")
public class UserDetailsMangerImpl implements UserDetailsManager {
	
	@Autowired
	UserDetailsDAO userDetailDAO;

	public String getUserName(String user) {
		// TODO Auto-generated method stub
		return userDetailDAO.getUserName(user);
	}

}
