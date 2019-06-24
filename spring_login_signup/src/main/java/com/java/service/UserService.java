package com.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.IUserDAO;
import com.java.dto.UserDTO;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDAO dao;

	@Override
	public void signup(UserDTO dto) throws Exception {
		dao.signup(dto);
	}

	@Override
	public Integer signupcheckid(String userId) throws Exception {
		return dao.signupcheckid(userId);
	}

	@Override
	public Integer login(UserDTO dto) throws Exception {
		return dao.login(dto);
	}

}
