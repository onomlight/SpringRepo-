package com.korea.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@Log4j
public class CommonException {
	
	@ExceptionHandler(Exception.class) // ���ܻ�Ȳ�߻��� ��� ��Ȳ�� �߻��Ǵ��� Ȯ��
	public String except(Exception ex, Model model) {
		log.error("Exception..."+ ex.getMessage());
		model.addAttribute("ex",ex);
		
		return "error_page";
	}
}
