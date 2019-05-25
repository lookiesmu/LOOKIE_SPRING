package com.java.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.Mapper;
import com.java.vo.MemberVO;

@Service
public class MemberService implements IMemberService{

	@Autowired
	private Mapper mapper;//DAO 인터페이스 자동주입
	
	public void read_service(HttpServletRequest request) {
		try {
			
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");

			MemberVO result = mapper.read(userId, userPw);

			System.out.println("*****검색한 아이디의 회원정보*****");
			System.out.println(result.toString());
			System.out.println("--------------------------");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("read_service.....");
		}
	}

	public void create_service(HttpServletRequest request) {

		try {
		
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");
			String userName = request.getParameter("userName");
			String userAge = request.getParameter("userAge");

			mapper.create(userId, userPw, userName, userAge);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("insert_service.....");
		}
		
	}

	public void delete_service(HttpServletRequest request) {

		try {
			
			String userId = request.getParameter("userId");

			mapper.delete(userId);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("delete_service.....");
		}
	}

	public void modify_service(HttpServletRequest request) {
		
		try {
			
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");
			String userName = request.getParameter("userName");
			String userAge = request.getParameter("userAge");

			mapper.modify(userId, userPw, userName, userAge);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("modify_service.....");
		}
	}
	public void readAll_service(HttpServletRequest request) {
		try {
			
			List<MemberVO> list = mapper.readAll();
			System.out.println(list.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("readAll_service...");
		}
	}
}
