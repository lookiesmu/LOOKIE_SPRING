package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {

	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String join(Model model) {

		return "joinForm";

	}

}
