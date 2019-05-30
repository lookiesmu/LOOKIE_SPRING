package com.java.service;

import java.util.List;

import com.java.vo.MemberVO;

public interface IMemberService {

	public void create(MemberVO vo) throws Exception;
	
	public List<MemberVO> listAll() throws Exception;
	
	public MemberVO read(String bId) throws Exception;
	
	public void delete(String bId) throws Exception;
	
	public void update(MemberVO vo) throws Exception;
	
	
}
