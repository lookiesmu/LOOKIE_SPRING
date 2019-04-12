package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {//Controller ������̼Ǹ� �ٿ��ָ� ��Ʈ�ѷ� ������ �Ҽ��ִ� Ŭ������ �ȴ�.

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("loginKey", "loginValue");
		
		return "login";//login.jsp �� ����ȴ�. 
	}
	
}
