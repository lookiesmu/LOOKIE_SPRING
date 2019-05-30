package kr.co.lookie.bbs;

import org.springframework.stereotype.Service;

//@Service
public interface BbsService {
	public void binsert(BbsDTO dto);
	public void bdelete(BbsDTO dto);
	public void bupdate(BbsDTO dto);
	public BbsDTO bsearch(BbsDTO dto);
}
