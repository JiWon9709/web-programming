package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic...");
	}

	@RequestMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		
		return "ex01"; // ex01.jsp
	}
	
	@RequestMapping("/ex02")
	public String ex02(@RequestParam("name1") String name, @RequestParam("age1")int age) {
		log.info("name: " + name);
		log.info("age: " + age);
		
		return "ex02"; // ex02.jsp
	}
	
	@RequestMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids: " + ids);
		
		return "ex02List";
	}
	
	@RequestMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("ids: " + Arrays.deepToString(ids));
		
		return "ex02Array";
	}
}
