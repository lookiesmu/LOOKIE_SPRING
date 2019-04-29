package com.java.le.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.le.member.Member;
import com.java.le.member.dao.MemberDao;

//@Component
//@Repository
@Service //���񽺰�ü�� ����ϱ� ���� ������ �����̳ʿ� ���� �Ѵ�.Service������̼��� �̿��ϸ� ������ ���� xml�� ���� ���� ���ص� �ȴ�.
public class MemberService implements IMemberService {

	@Autowired //dao��ü �ڵ�����
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