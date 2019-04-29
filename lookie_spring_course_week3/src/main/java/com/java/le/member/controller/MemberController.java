package com.java.le.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.le.member.Member;
import com.java.le.member.service.MemberService;

@Controller
@RequestMapping("/member")//���� ��� memJoin�޼ҵ��� ������̼ǿ��� value�� /memJoin ���� �����ߴٸ� /member/memJoin ���� ã���Ѵ�.
public class MemberController{

	@Autowired //���񽺰�ü �����������̳ʿ� �ڵ�����. ���񽺰�ü�� ����Ҽ��ְ��Ѵ�.
	MemberService service;
	
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)//HTML���Ͽ��� post������� �Ѿ�����Ƿ� POST�Է�. GET����� ���� ��������.
	public String memJoin(Member member) {//�Ű������� "@ModelAttribute("mem") Member member" ���� �𵨾�Ʈ����Ʈ ������̼��� �߰��ϸ� View JSP���� mem.memPw �̷������� ��밡��
		//MemberŬ������ setter�� getter�̿�. �ǹ����� �ַ� �̹���� �����. �ڵ��Ǿ��� �پ��� �������ִ�.

//		memjoin �޼ҵ��� �Ű������� "Model model, HttpServletRequest request" �϶� �Ʒ�ó�� �ۼ�
//		String memId = request.getParameter("memId");
//		String memPw = request.getParameter("memPw");
//		String memMail = request.getParameter("memMail");
//		String memPhone1 = request.getParameter("memPhone1");
//		String memPhone2 = request.getParameter("memPhone2");
//		String memPhone3 = request.getParameter("memPhone3");
//		service.memberRegister(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);		
//		model.addAttribute("memId", memId);
//		model.addAttribute("memPw", memPw);
//		model.addAttribute("memMail", memMail);
//		model.addAttribute("memPhone", memPhone1 + " - " + memPhone2 + " - " + memPhone3);
		
		service.memberRegister(member.getMemId(), member.getMemPw(), member.getMemMail()
				, member.getMemPhone1(), member.getMemPhone2(), member.getMemPhone3());		
		
		return "memJoinOk";
	}
	
	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
	public String memLogin(Model model, @RequestParam("memId") String memId, @RequestParam(value = "memPw", required = false, defaultValue = "1234") String memPw) { 
		//required = true�� memPw���� �Ѿ���� ������ ������ �߻�, false�� memPw���� �Ѿ���� �ʴ��� ����. defaultValue�� ���� �Ѿ���� �ʾ����� �⺻������ ����� ���� ����.																

//		String memId = request.getParameter("memId");
//		String memPw = request.getParameter("memPw");
		
		Member member = service.memberSearch(memId, memPw);
		
		try {
			model.addAttribute("memId", member.getMemId());
			model.addAttribute("memPw", member.getMemPw());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "memLoginOk";
	}
	
	@RequestMapping(value = "/memRemove", method = RequestMethod.POST)
	public String memRemove(@ModelAttribute("mem") Member member) {
		
		//service.memberRemove(member);
		
		return "memRemoveOk";
		
	}
	
//	ModelAndView�� �̿��Ҷ�.
//	@RequestMapping(value="/memModify", method=RequestMethod.POST)
//	public ModelAndView memModify(Member member) {
//		Member[] members= service.memberModify(member);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("memBefore", members[0]);
//		mav.addObject("memAfter", members[1]);
//		
//		mav.setViewName("memModifyOk"); //������ View�� �̸��� serViewName�� �Ű������� �Է� 
//		
//		return mav; //return�� ��(JSP)�� �̸��̾ƴ� �𵨾غ� ��ü�� �����Ѵ�.
//		
//		//Model�� �信 �����͸��� �����ϱ� ���� ��ü�̰� ModelAndView�� �����Ϳ� ���� �̸��� �Բ� �����ϴ� ��ü�̴�.
//	}
	
}