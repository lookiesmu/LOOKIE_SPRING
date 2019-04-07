package practice.mvc.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("loginKey","loginvalue");
		
		return "login";
	}

}
