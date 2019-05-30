package com.java.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.java.vo.MemberVO;

@Repository
public class MemberDAO implements IMemberDAO{

	@Inject
	private SqlSession SqlSession;
	
	private static String namespace = "com.java.mappers.MemberMapper";
	
	@Override
	public void create(MemberVO vo) throws Exception {
		SqlSession.insert(namespace+".create",vo);
	}

	@Override
	public List<MemberVO> listAll() throws Exception {
		return SqlSession.selectList(namespace+".listAll");
	}

	@Override
	public MemberVO read(String bId) throws Exception {
		return SqlSession.selectOne(namespace+".read", bId);
	}

	@Override
	public void delete(String bId) throws Exception {
		SqlSession.delete(namespace+".delete",bId);
		
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		SqlSession.update(namespace+".update",vo);
		
	}

	
}
