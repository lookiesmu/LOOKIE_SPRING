package kr.co.lookie.member;


import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import kr.co.lookie.member.MemberDAOImpl;
import kr.co.lookie.member.MemberDTO;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {
	
	@Inject
	MemberDAO memberDao;

	@Override
	public void insert(MemberDTO dto) {
		memberDao.insert(dto);
	}

	@Override
	public void delete(MemberDTO dto) {
		memberDao.delete(dto);
	}

	@Override
	public void update(MemberDTO dto) {
		memberDao.update(dto);
	}

	@Override
	public MemberDTO search(MemberDTO dto){
		return memberDao.search(dto);
		
	}
	
}
