package com.java.lec;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.IMemberService;
import com.java.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private IMemberService service;

	@ResponseBody
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JSONObject create(@RequestBody MemberVO vo) {

		JSONObject json = new JSONObject();

		try {

			service.create(vo);

		} catch (Exception e) {
			e.printStackTrace();
		}

		json.put("status", "create complete");

		return json;

	}

	@ResponseBody
	@RequestMapping(value = "/read", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public MemberVO read(@RequestBody MemberVO vo) throws Exception {

		return service.read(vo.getbId());

	}

	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JSONObject update(@RequestBody MemberVO vo) {

		JSONObject json = new JSONObject();

		try {

			service.update(vo);

		} catch (Exception e) {
			e.printStackTrace();
		}

		json.put("status", "update complete");

		return json;

	}

	@ResponseBody
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JSONObject delete(@RequestBody MemberVO vo) {

		JSONObject json = new JSONObject();

		try {

			service.delete(vo.getbId());

		} catch (Exception e) {
			e.printStackTrace();
		}

		json.put("status", "delete complete");

		return json;

	}

	@ResponseBody
	@RequestMapping(value = "/listAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public List<MemberVO> listAll() throws Exception {

		List<MemberVO> result = service.listAll();
		return result;
	}

}
