package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.IBoardDAO;
import com.java.vo.BoardVO;

@Service
public class BoardService implements IBoardService{

	@Autowired
	private IBoardDAO dao;
	
	@Override
	public void create(BoardVO vo) throws Exception {
		dao.create(vo);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public BoardVO read(Integer bNo) throws Exception {
		return dao.read(bNo);
	}

	@Override
	public void delete(Integer bNo) throws Exception {
		dao.delete(bNo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);
	}

}
