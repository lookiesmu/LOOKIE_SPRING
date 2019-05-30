package kr.co.lookie.member;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.lookie.member.MemberDTO;
import kr.co.lookie.member.MemberService;

@Controller
@RequestMapping
public class MemberController {

	@Inject
	MemberService memberService;
	
	//ȸ������ ����
	@ResponseBody
	@RequestMapping(value="/insert",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public JSONObject insert(@RequestBody MemberDTO memberDTO) {
		JSONObject json = new JSONObject();
		memberService.insert(memberDTO);
		json.put("message","insert success");
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value="/delete",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public JSONObject delete(@RequestBody MemberDTO memberDTO) {
		JSONObject json = new JSONObject();
		memberService.delete(memberDTO);
		json.put("message","delete success");
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value="/update",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public JSONObject update(@RequestBody MemberDTO memberDTO) {
		JSONObject json = new JSONObject();
		memberService.update(memberDTO);
		json.put("message","update success");
		return json;
	}
	@ResponseBody
	@RequestMapping(value="/search",produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	public MemberDTO search(@RequestBody MemberDTO memberDTO) {
		return memberService.search(memberDTO);

	}
	
	
//	@RequestMapping("select.do")
//	public void select(MemberDTO MemberDTO, Model model) {
//		MemberDTO dto = dao.select(MemberDTO);
//		model.addAttribute("dto", dto);
//		System.out.println("id="+MemberDTO.getId());
//		System.out.println("pw="+MemberDTO.getPw());
//		System.out.println("name="+MemberDTO.getUserName());
//	}
	//�α��� ����

}






