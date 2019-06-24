package com.java.lec;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.IBoardService;
import com.java.vo.BoardVO;

@Controller
@RequestMapping("/board") //url��û�� /board/�� �����ϴ� ���� ���⼭ ó���Ѵ�. ex) board/abc , board/123 board/create
public class BoardController {

	@Autowired
	private IBoardService service;
	
// 1. Jackson-JSON�� �̿��� �������Խ���	
	
	@ResponseBody 
	@RequestMapping(value = "/read", produces="application/json;charset=UTF-8",  method=RequestMethod.POST )
	public BoardVO read(@RequestBody BoardVO vo) throws Exception{
		return service.read(vo.getbNo());
	}

	@ResponseBody
	@RequestMapping(value = "/listAll", produces="application/json;charset=UTF-8" , method = RequestMethod.POST)
	public List<BoardVO> listAll() throws Exception{

		List<BoardVO> result = service.listAll();
		
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "/create", produces="application/json;charset=UTF-8", method = RequestMethod.POST)
	public JSONObject create(@RequestBody BoardVO vo) {
		
		JSONObject json = new JSONObject();
		
		try {
			service.create(vo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		json.put("status", "insert complete");
		
		return json;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/delete", produces="application/json;charset=UTF-8" , method = RequestMethod.POST)
	public JSONObject delete(@RequestBody BoardVO vo) {

		JSONObject json = new JSONObject();
		
		try {
			service.delete(vo.getbNo());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		json.put("status", "delete complete");
		
		return json;
	}

	@ResponseBody
	@RequestMapping(value = "/update", produces="application/json;charset=UTF-8" , method = RequestMethod.POST)
	public JSONObject update(@RequestBody BoardVO vo) {

		JSONObject json = new JSONObject();
		
		try {
			service.update(vo);

		} catch (Exception e) {
			e.printStackTrace();
		}

		json.put("status", "update complete");
		return json;
	}

	
// 2. JSP �並�̿��� �������Խ���
	
//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public void createGET() throws Exception {
//		System.out.println("�������Դϴ�. GET���");
//	}
//
//	@RequestMapping(value = "/create", method = RequestMethod.POST)
//	public String create(BoardVO vo, Model model) {
//
//		try {
//			service.create(vo);
//			model.addAttribute("result", "����");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "/board/success";
//	}
//	
//	  @RequestMapping(value="/read",method=RequestMethod.GET)
//	  public void readGET() throws Exception{
//	      System.out.println("�������Դϴ�. GET���");
//	  }
//	
//    @RequestMapping(value = "/read",method=RequestMethod.POST )
//    public String read(BoardVO vo, Model model){
//    	
//    	try {
//    		BoardVO result = service.read(vo.getbNo());
//
//        	System.out.println("*****************");
//        	System.out.println("/board/read POST��� �Դϴ�.");
//            System.out.println(result.toString());
//            System.out.println("-----------------");
//            
//            model.addAttribute("result", "����");
//            
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    
//        return "/board/success";
//    }
//	
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public void deleteGET() throws Exception {
//		System.out.println("�������Դϴ�. GET���");
//	}
//
//	@RequestMapping(value = "/delete", method = RequestMethod.POST)
//	public String delete(BoardVO vo, Model model) {
//
//		try {
//			service.delete(vo.getbNo());
//
//			model.addAttribute("result", "����");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return "/board/success";
//	}
//
//	@RequestMapping(value = "/update", method = RequestMethod.GET)
//	public void updateGET() throws Exception {
//		System.out.println("�������Դϴ�. GET���");
//	}
//
//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	public String update(BoardVO vo, Model model) {
//
//		try {
//			service.update(vo);
//
//			model.addAttribute("result", "����");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return "/board/success";
//	}
//	
//	
//	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
//	public void listAllGET() throws Exception {
//		System.out.println("�������Դϴ�. GET���");
//	}
//	
//	@RequestMapping(value = "/listAll", method = RequestMethod.POST)
//	public String listAll(BoardVO vo, Model model) {
//
//		try {
//			List<BoardVO> result = service.listAll();
//
//			System.out.println("*****************");
//			System.out.println("/board/listAll POST��� �Դϴ�.");
//			System.out.println(result.toString());
//			System.out.println("-----------------");
//
//			model.addAttribute("result", "����");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return "/board/success";
//	}

}
