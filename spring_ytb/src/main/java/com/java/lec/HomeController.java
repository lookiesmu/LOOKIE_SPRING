package com.java.lec;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}	

}

/*
@RequestMapping(method = RequestMethod.POST, value = "/search")
public void search(HttpServletRequest request) {

	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");

	MemberVO result = mapper.read(userId, userPw);

	System.out.println("*****�˻��� ���̵��� ȸ������*****");
	System.out.println(result.toString());
	System.out.println("--------------------------");		

}

@RequestMapping(method = RequestMethod.POST, value = "/insert")
public void insert(HttpServletRequest request) {

	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	String userAge = request.getParameter("userAge");

	mapper.create(userId, userPw, userName, userAge);
	MemberVO result = mapper.read(userId, userPw);

	System.out.println("****�Է��� ȸ������ ��ϿϷ�****");
	System.out.println(result.toString());
	System.out.println("--------------------------");

}

@RequestMapping(method = RequestMethod.POST, value = "/delete")
public void delete(HttpServletRequest request) {
	String userId = request.getParameter("userId");

	mapper.delete(userId);

	System.out.println("****�Է��� ȸ������ �����Ϸ�****");
	System.out.println(userId + " �� ȸ�������� �����Ǿ����ϴ�.");
	System.out.println("--------------------------");
}

@RequestMapping(method = RequestMethod.POST, value = "/update")
public void update(HttpServletRequest request) {
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	String userAge = request.getParameter("userAge");

	mapper.modify(userId, userPw, userName, userAge);

	System.out.println("****�Է��� ȸ������ �����Ϸ�****");
	System.out.println(userId + " �� ȸ�������� �����Ǿ����ϴ�.");
	System.out.println("--------------------------");
}
*/
