package com.java.dao;

import com.java.dto.UserDTO;

public interface IUserDAO {

	public void signup(UserDTO dto) throws Exception;

	public Integer signupcheckid(String userId) throws Exception;

	public Integer login(UserDTO dto) throws Exception;
	

}
