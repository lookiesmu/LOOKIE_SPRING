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
		} else if (signupcheckid(dto) == 0) { // mybatis-config.xml���� nulló���� ���־���Ѵ�.
			try {
				service.signup(dto);
				json.put("status", "signup complete");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("userId �ߺ����� ������ ȸ������ ��� ����");
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
			System.out.println("�α��� ����");

			return 1;
			
		} else if (service.login(dto) == 0) {
			if(signupcheckid(dto) == 0) {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
			else {
				System.out.println("�߸��� ��й�ȣ�Դϴ�.");
			}
			return 0;
			
		} else {
			System.out.println("db����");
			return -1;
		}

	}

}
