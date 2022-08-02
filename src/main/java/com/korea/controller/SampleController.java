package com.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j

public class SampleController {
	
	@RequestMapping("/test")
	public void test1() 
	{
		log.info("URL : /test");
	}
	
}
