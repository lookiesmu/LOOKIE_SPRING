package com.java.lec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.dao.Mapper;
import com.java.vo.MemberVO;

@Controller
public class JsonController {

	@Autowired
	private Mapper mapper;

	@RequestMapping(method = RequestMethod.POST, value = "/json")
	public @ResponseBody MemberVO search() {
		return mapper.read("kmdngmn", "1234");
	}

}
