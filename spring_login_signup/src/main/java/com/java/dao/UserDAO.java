package com.java.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.java.dto.UserDTO;

@Repository
public class UserDAO implements IUserDAO {

	@Inject
	private SqlSession SqlSession;

	private static String namespace = "com.java.mappers.UserMapper";

	@Override
	public Integer login(UserDTO dto) throws Exception {
		return SqlSession.selectOne(namespace + ".login", dto);

	}

	@Override
	public void signup(UserDTO dto) throws Exception {
		SqlSession.insert(namespace + ".signup", dto);

	}

	@Override
	public Integer signupcheckid(String userId) throws Exception {
		return SqlSession.selectOne(namespace + ".signupcheckid", userId);
	}

}
