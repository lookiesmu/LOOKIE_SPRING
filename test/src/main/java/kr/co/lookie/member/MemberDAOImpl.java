package kr.co.lookie.member;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	SqlSessionTemplate	mybatis;
	

	@Override
	public void insert(MemberDTO dto) {
		mybatis.insert("member.insert",dto);
		
	}

	@Override
	public void delete(MemberDTO dto) {
		mybatis.delete("member.delete",dto);
	}
	@Override
	public void update(MemberDTO dto) {
		mybatis.update("member.update", dto);
		
	}

	@Override
	public MemberDTO search(MemberDTO dto) {
		MemberDTO result = new MemberDTO();
		result = mybatis.selectOne("member.search", dto);
		return result;
		
	}
}
