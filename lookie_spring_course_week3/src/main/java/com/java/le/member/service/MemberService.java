package com.java.le.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.le.member.Member;
import com.java.le.member.dao.MemberDao;

//@Component
//@Repository
@Service //서비스객체를 사용하기 위해 스프링 컨테이너에 담기게 한다.Service어노테이션을 이용하면 스프링 설정 xml에 빈을 설정 안해도 된다.
public class MemberService implements IMemberService {

	@Autowired //dao객체 자동주입
	MemberDao dao;
	
	@Override
	public void memberRegister(String memId, String memPw, String memMail,
			String memPhone1, String memPhone2, String memPhone3) {
		System.out.println("memberRegister()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);
		
		dao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
	}

	@Override
	public Member memberSearch(String memId, String memPw) {
		System.out.println("memberSearch()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		
		Member member = dao.memberSelect(memId, memPw);
		
		return member;
	}

	@Override
	public void memberModify() {
		
	}

	@Override
	public void memberRemove() {
		// TODO Auto-generated method stub
		
	}

}