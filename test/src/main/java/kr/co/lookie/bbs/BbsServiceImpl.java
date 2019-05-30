package kr.co.lookie.bbs;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service("BbsService")
public class BbsServiceImpl implements BbsService{
	
	@Inject
	BbsDAO bbsDao;
	
	@Override
	public void binsert(BbsDTO dto) {
		bbsDao.binsert(dto);
	}

	@Override
	public void bdelete(BbsDTO dto) {
		bbsDao.bdelete(dto);		
	}

	@Override
	public void bupdate(BbsDTO dto) {
		bbsDao.bupdate(dto);		
	}

	@Override
	public BbsDTO bsearch(BbsDTO dto) {
		return bbsDao.bsearch(dto);
	}
	
}

