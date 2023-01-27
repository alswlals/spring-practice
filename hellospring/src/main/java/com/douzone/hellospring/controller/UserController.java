package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping 클래스 메소드 맵핑
 * 
 * */

@Controller
public class UserController {
	
	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.GET) /*value 미입력시 디폴트값인디 입력하면 URL임 */
	public String join() {
		return "UserController.join()";
	}
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		return "UserController.list()";
	}
}
