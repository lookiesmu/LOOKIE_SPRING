package com.java.service;

import java.util.List;

import com.java.vo.BoardVO;

public interface IBoardService {

	public void create(BoardVO vo) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public BoardVO read(Integer bNo) throws Exception;
	
	public void delete(Integer bNo) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	
}
