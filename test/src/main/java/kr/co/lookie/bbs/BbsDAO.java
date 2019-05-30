package kr.co.lookie.bbs;

public interface BbsDAO {
	public void binsert(BbsDTO dto);
	public void bdelete(BbsDTO dto);
	public void bupdate(BbsDTO dto);
	public BbsDTO bsearch(BbsDTO dto);
}
