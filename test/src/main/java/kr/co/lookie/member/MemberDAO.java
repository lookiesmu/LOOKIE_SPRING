package kr.co.lookie.member;

import kr.co.lookie.member.MemberDTO;

public interface MemberDAO {
	public void insert(MemberDTO dto);
	public void delete(MemberDTO dto);
	public void update(MemberDTO dto);
	public MemberDTO search(MemberDTO dto);
}
