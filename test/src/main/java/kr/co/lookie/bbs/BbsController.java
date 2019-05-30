package kr.co.lookie.bbs;

import javax.inject.Inject;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.lookie.bbs.BbsDTO;
import kr.co.lookie.bbs.BbsService;

@Controller
public class BbsController {

	@Inject
	BbsService bbsService;
	
	//ȸ������ ����
	@ResponseBody
	@RequestMapping(value="/binsert",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public JSONObject binsert(@RequestBody BbsDTO bbsDTO) {
		JSONObject json = new JSONObject();
		bbsService.binsert(bbsDTO);
		json.put("message","insert success");
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value="/bdelete",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public JSONObject bdelete(@RequestBody BbsDTO bbsDTO) {
		JSONObject json = new JSONObject();
		bbsService.bdelete(bbsDTO);
		json.put("message","delete success");
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value="/bupdate",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public JSONObject bupdate(@RequestBody BbsDTO bbsDTO) {
		JSONObject json = new JSONObject();
		bbsService.bupdate(bbsDTO);
		json.put("message","update success");
		return json;
	}
	@ResponseBody
	@RequestMapping(value="/bsearch",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public BbsDTO bsearch(@RequestBody BbsDTO bbsDTO) {
		return bbsService.bsearch(bbsDTO);

	}
	
	
	
//	@Autowired
//	BbsDAOImpl dao;
//	
//	
//	@RequestMapping("selectAll.do")
//	public void selectAll(Model model) {
//		List<BbsDTO> list = dao.selectAll();
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("select2.do")
//	public void select(BbsDTO bbsDTO, Model model) {
//		BbsDTO dto = dao.select(bbsDTO);
//		model.addAttribute("dto", dto);
//	}
//	
//	@RequestMapping("insert.do")
//	public void insert(BbsDTO bbsDTO) {
//		dao.insert(bbsDTO);
//	}
}
