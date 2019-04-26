package com.cg.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * HelloWorldController
 * @author Administrator
 *
 */
@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	@ResponseBody
	public Map<String,Object> show(){
		Map<String,Object> map = new HashMap();
		map.put("msg", "testHelloWorld");
		System.out.println("hello world......");
		return map;
	}
}
