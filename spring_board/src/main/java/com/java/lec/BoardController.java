package com.java.lec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.service.IBoardService;
import com.java.vo.BoardVO;

@Controller
@RequestMapping("/board/") //url요청이  /board/로 시작하는 것은 여기서 처리한다. ex) board/abc , board/123 board/create
public class BoardController {
    
	@Autowired
    private IBoardService service;
    
    @RequestMapping(value="/create",method=RequestMethod.GET)
    public void createGET() throws Exception{
        System.out.println("실행중입니다. GET방식");
    }
    
    @RequestMapping(value = "/create",method=RequestMethod.POST )
    public String create(BoardVO vo, Model model){
        
    	try {
    	    service.create(vo);
            model.addAttribute("result", "성공");
        
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return "/board/success";
    }
    
    @RequestMapping(value="/read",method=RequestMethod.GET)
    public void readGET() throws Exception{
        System.out.println("실행중입니다. GET방식");
    }
    
    @RequestMapping(value = "/read",method=RequestMethod.POST )
    public String read(BoardVO vo, Model model){
    	
    	try {
    		BoardVO result = service.read(vo.getbNo());

        	System.out.println("*****************");
        	System.out.println("/board/read POST방식 입니다.");
            System.out.println(result.toString());
            System.out.println("-----------------");
            
            model.addAttribute("result", "성공");
            
		} catch (Exception e) {
			e.printStackTrace();
		}
    
        return "/board/success";
    }
    
    @RequestMapping(value="/delete",method=RequestMethod.GET)
    public void deleteGET() throws Exception{
        System.out.println("실행중입니다. GET방식");
    }
    
    @RequestMapping(value = "/delete",method=RequestMethod.POST )
    public String delete(BoardVO vo, Model model){
    	
    	try {
    		service.delete(vo.getbNo());

            model.addAttribute("result", "성공");
        
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
        return "/board/success";
    }
    
    @RequestMapping(value="/update",method=RequestMethod.GET)
    public void updateGET() throws Exception{
        System.out.println("실행중입니다. GET방식");
    }
    
    @RequestMapping(value = "/update",method=RequestMethod.POST )
    public String update(BoardVO vo, Model model){
    	
    	try {
    		service.update(vo);
        	
            model.addAttribute("result", "성공");
        
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
        return "/board/success";
    }
    
    @RequestMapping(value="/listAll",method=RequestMethod.GET)
    public void listAllGET() throws Exception{
        System.out.println("실행중입니다. GET방식");
    }
    
    @RequestMapping(value = "/listAll",method=RequestMethod.POST )
    public String listAll(BoardVO vo, Model model){
    	
    	try {
    		List<BoardVO> result = service.listAll();

        	System.out.println("*****************");
        	System.out.println("/board/listAll POST방식 입니다.");
        	System.out.println(result.toString());
            System.out.println("-----------------");
            
            model.addAttribute("result", "성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
        return "/board/success";
    }
    
}    
