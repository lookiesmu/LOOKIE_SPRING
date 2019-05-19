package com.myspring.dao;

import org.apache.ibatis.annotations.Param;

public interface Mapper {
	
	public String memberId(@Param("memberId") String memberId);
}
