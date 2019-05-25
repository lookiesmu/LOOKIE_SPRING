package com.java.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.dto.Delete_MemberDTO;
import com.java.vo.MemberVO;

public interface Mapper {

	public MemberVO read(@Param("userId") String userId, @Param("userPw") String userPw);

	public MemberVO create(@Param("userId") String userId, @Param("userPw") String userPw, @Param("userName") String userName, @Param("userAge") String userAge);

	public Delete_MemberDTO delete(@Param("userId") String userId);
	
	public MemberVO modify(@Param("userId") String userId, @Param("userPw") String userPw, @Param("userName") String userName, @Param("userAge") String userAge);

	public List<MemberVO> readAll();

}
