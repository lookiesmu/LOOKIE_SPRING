package kr.co.lookie.bbs;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAOImpl implements BbsDAO{

	@Autowired
	SqlSessionTemplate myBatis;
	
//	public List<BbsDTO> selectAll() {
//		return myBatis.selectList("bbs.selectAll");
//				
//	}
//	
//	public BbsDTO select(BbsDTO dto) {
//		return myBatis.selectOne("bbs.select", dto);
//	}
	
	
	public void binsert(BbsDTO dto) {
		myBatis.insert("bbs.insert", dto);
	}

	@Override
	public void bdelete(BbsDTO dto) {
		myBatis.delete("bbs.delete", dto);
	}

	@Override
	public void bupdate(BbsDTO dto) {
		myBatis.update("bbs.update", dto);
	}

	@Override
	public BbsDTO bsearch(BbsDTO dto) {
		return myBatis.selectOne("bbs.search", dto);
	}
	
	
	
	
	
	
	
	
}
