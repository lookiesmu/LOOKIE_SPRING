package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {//Controller 어노테이션만 붙여주면 컨트롤러 역할을 할수있는 클래스가 된다.

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("loginKey", "loginValue");
		
		return "login";//login.jsp 가 실행된다. 
	}
	
}
