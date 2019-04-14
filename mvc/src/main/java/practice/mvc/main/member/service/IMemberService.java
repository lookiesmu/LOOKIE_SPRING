package practice.mvc.main.member.service;

import practice.mvc.main.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	void memberSearch(Member member);
	Member[] memberModify(Member member);
	void memberRemove(Member member);
}
