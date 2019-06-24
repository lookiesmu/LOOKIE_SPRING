package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.IMemberDAO;
import com.java.vo.MemberVO;

@Service
public class MemberService implements IMemberService{

	@Autowired
	private IMemberDAO dao;
	
	@Override
	public void create(MemberVO vo) throws Exception {
		dao.create(vo);
		
	}

	@Override
	public List<MemberVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public MemberVO read(String bId) throws Exception {
		return dao.read(bId);
	}

	@Override
	public void delete(String bId) throws Exception {
		dao.delete(bId);
		
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		dao.update(vo);
	}

}
