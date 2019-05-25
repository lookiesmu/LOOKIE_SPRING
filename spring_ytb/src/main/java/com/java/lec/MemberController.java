package com.java.lec;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping(value = "/s", method = RequestMethod.GET)
	public String home1() {

		return "selectAction";
	}

	@RequestMapping(value = "/i", method = RequestMethod.GET)
	public String home2() {

		return "insertAction";
	}

	@RequestMapping(value = "/d", method = RequestMethod.GET)
	public String home3() {

		return "deleteAction";
	}

	@RequestMapping(value = "/u", method = RequestMethod.GET)
	public String home4() {

		return "updateAction";
	}

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public String home5() {

		return "listAction";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/search")
	public void search(HttpServletRequest request) throws Exception{
		service.read_service(request);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/insert")
	public void insert(HttpServletRequest request) throws Exception{
		service.create_service(request);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public void delete(HttpServletRequest request) throws Exception{
		service.delete_service(request);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/update")
	public void update(HttpServletRequest request) throws Exception{
		service.modify_service(request);
	}	

	@RequestMapping(method = RequestMethod.POST, value = "/listAll")
	public void listAll(HttpServletRequest request) throws Exception{
		service.readAll_service(request);
	}
	
}
