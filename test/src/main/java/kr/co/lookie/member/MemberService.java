package kr.co.lookie.member;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import kr.co.lookie.member.MemberDTO;

public interface MemberService {
	public void insert(MemberDTO dto);
	public void delete(MemberDTO dto);
	public void update(MemberDTO dto);
	public MemberDTO search(MemberDTO dto);
}
