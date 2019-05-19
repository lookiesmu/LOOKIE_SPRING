package com.myspring.dao;

public class Test {
	private String memberId, memberPw;
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	@Override
	public String toString() {
		return "Test [memberId=" + memberId + ", memberPw=" + memberPw + "]";
	}
	
	public String getMemberPw() {
		return memberPw;
	}
	
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
}
