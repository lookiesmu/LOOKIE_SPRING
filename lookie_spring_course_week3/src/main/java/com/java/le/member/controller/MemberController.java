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
@RequestMapping("/member")//예를 들어 memJoin메소드의 어노테이션에서 value를 /memJoin 으로 설정했다면 /member/memJoin 으로 찾게한다.
public class MemberController{

	@Autowired //서비스객체 스프링컨테이너에 자동주입. 서비스객체를 사용할수있게한다.
	MemberService service;
	
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)//HTML파일에서 post방식으로 넘어왔으므로 POST입력. GET방식일 때는 생략가능.
	public String memJoin(Member member) {//매개변수에 "@ModelAttribute("mem") Member member" 으로 모델어트리뷰트 어노테이션을 추가하면 View JSP에서 mem.memPw 이런식으로 사용가능
		//Member클래스의 setter와 getter이용. 실무에서 주로 이방법을 사용함. 코드의양이 줄어드는 장점이있다.

//		memjoin 메소드의 매개변수가 "Model model, HttpServletRequest request" 일때 아래처럼 작성
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
		//required = true는 memPw값이 넘어오지 않으면 에러를 발생, false는 memPw값이 넘어오지 않더라도 묵인. defaultValue는 값이 넘어오지 않았을때 기본적으로 사용할 값을 지정.																

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
	
//	ModelAndView를 이용할때.
//	@RequestMapping(value="/memModify", method=RequestMethod.POST)
//	public ModelAndView memModify(Member member) {
//		Member[] members= service.memberModify(member);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("memBefore", members[0]);
//		mav.addObject("memAfter", members[1]);
//		
//		mav.setViewName("memModifyOk"); //전달할 View의 이름을 serViewName의 매개변수로 입력 
//		
//		return mav; //return은 뷰(JSP)의 이름이아닌 모델앤뷰 객체를 리턴한다.
//		
//		//Model은 뷰에 데이터만을 전달하기 위한 객체이고 ModelAndView는 데이터와 뷰의 이름을 함께 전달하는 객체이다.
//	}
	
}