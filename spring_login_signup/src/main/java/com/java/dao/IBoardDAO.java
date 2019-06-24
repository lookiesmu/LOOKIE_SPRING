package com.java.dao;

import java.util.List;

import com.java.vo.BoardVO;

public interface IBoardDAO {

	public void create(BoardVO vo) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public BoardVO read(Integer bNo) throws Exception;
	
	public void delete(Integer bNo) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
}
