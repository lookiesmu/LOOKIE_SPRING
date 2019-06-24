package com.java.lec;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.dto.UserDTO;
import com.java.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;

	@ResponseBody
	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JSONObject signup(@RequestBody UserDTO dto) throws Exception {

		JSONObject json = new JSONObject();

		if (signupcheckid(dto) > 0) {
			json.put("status", "already existed usedId");
		} else if (signupcheckid(dto) == 0) { // mybatis-config.xml에서 null처리를 해주어야한다.
			try {
				service.signup(dto);
				json.put("status", "signup complete");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("userId 중복하지 않을시 회원가입 블록 수행");
			}
		}

		return json;

	}

	@RequestMapping(value = "/signupcheckid", method = RequestMethod.POST)
	public Integer signupcheckid(UserDTO dto) throws Exception {

		return service.signupcheckid(dto.getUserId());
	}

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public Integer login(@RequestBody UserDTO dto) throws Exception {

		if (service.login(dto) != 0) {
			System.out.println("로그인 성공");

			return 1;
			
		} else if (service.login(dto) == 0) {
			if(signupcheckid(dto) == 0) {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			else {
				System.out.println("잘못된 비밀번호입니다.");
			}
			return 0;
			
		} else {
			System.out.println("db오류");
			return -1;
		}

	}

}
