package com.korea.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/restsample")
@Log4j
public class RestSampleController {
	
	@GetMapping(value="/getText", produces="text/plain; charset=UTF-8")
	public String test1() {
		
		//다시해볼것
		
		return "안녕하세요";
	}
	
}
