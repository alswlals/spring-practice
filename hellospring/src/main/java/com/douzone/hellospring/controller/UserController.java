package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping 클래스 메소드 맵핑
 * 
 * */

@Controller
public class UserController {
//	
//	@ResponseBody
//	@RequestMapping(value="/join", method=RequestMethod.GET) /*value 미입력시 디폴트값인디 입력하면 URL임 */
//	public String join() {
//		return "UserController.join()";
//	}
	

	@RequestMapping(value="/join", method=RequestMethod.GET) /*value 미입력시 디폴트값인디 입력하면 URL임 */
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	/* setter 필수? 들고오고자 하는 거랑일므 같아야하고 ,, , */
	@RequestMapping(value="/join", method=RequestMethod.POST) /* POST: DB insert */
	public String join(UserVo userVo) {
		System.out.println(userVo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam(value="n") String name) { /*String일 경우 defaultValue에 빈값을 넣어 null값 안 만들기 */
		/**
		 * 
		 * 만일 n이라는 이름의 URL 파라미터가 없으면
		 * 400 Bad request error가 발생
		 * 
		 * */
		return "UserController.update("+ name+")";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n", required=true, defaultValue="") String name) { /*String일 경우 defaultValue에 빈값을 넣어 null값 안 만들기 */

		return "UserController.update("+ name+")";
	}
	
	
	@ResponseBody
	@RequestMapping("/list")
	public String list(@RequestParam(value="p",required=true, defaultValue="1") int pageNo) { /*String일 경우 defaultValue에 빈값을 넣어 null값 안 만들기 */
		return "UserController.list("+ pageNo+")";
	}
}
