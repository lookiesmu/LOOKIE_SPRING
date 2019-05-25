package com.java.service;

import javax.servlet.http.HttpServletRequest;

public interface IMemberService {
	
	public void read_service(HttpServletRequest request);
	
	public void create_service(HttpServletRequest request);
	
	public void delete_service(HttpServletRequest request);
	
	public void modify_service(HttpServletRequest request);
	
	public void readAll_service(HttpServletRequest request);

	
}
