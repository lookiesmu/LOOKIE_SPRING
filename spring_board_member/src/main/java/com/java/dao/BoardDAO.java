package com.java.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.java.vo.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO{

	@Inject
	private SqlSession SqlSession;
	
	private static String namespace = "com.java.mappers.BoardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception {
		SqlSession.insert(namespace+".create",vo);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		
		return SqlSession.selectList(namespace+".listAll");
	}

	@Override
	public BoardVO read(Integer bNo) throws Exception {
		return SqlSession.selectOne(namespace+".read", bNo);
	}

	@Override
	public void delete(Integer bNo) throws Exception {
		SqlSession.delete(namespace+".delete",bNo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		SqlSession.update(namespace+".update",vo);
	}
}
