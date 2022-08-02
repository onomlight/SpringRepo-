package com.korea.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.domain.SampleDTO;
import com.korea.domain.SampleDTOList;
import com.korea.domain.TodoDTO;
import com.korea.domain.TodoDTO2;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/sample/*") // ������ �������� �������ִ� �������� �Ҽ��ֵ�����
public class SampleController {
	
	@RequestMapping(value="/test",method=RequestMethod.GET) // �������¸޼����� �߰��ϸ� Ȯ�ΰ�����
	public void test1() 
	{
		log.info("URL : /test");
	}
	
	
	@GetMapping("/test2")
	public void test2()
	{
		log.info("URL : /test2");
	}
	
	@GetMapping("/test3")
	public void test3(SampleDTO dto)
	{
		log.info("dto's info : " + dto);
	}
	
	@GetMapping("/test4")
	public void test4(@RequestParam("name") String name, @RequestParam("age") Integer age) {
		log.info("URL : /test4");
		log.info("name :" + name + "age : " + age);
	}
	
	@GetMapping("test5") // ���ڴ� ��Ƽ��
	public void test5(@RequestParam("name") String[] list) {
		log.info("URL : /test5");
		for(String str : list) {
			System.out.println(str+ " ");
		}
	 
	
	}
	
	@GetMapping("/test6")
	public void test6(SampleDTOList list) {
		log.info("URL : / test6");
		for(SampleDTO dto : list.getList()) {
			//http://localhost:8080/sample/test6?list%5b0%5d.name="ȫ�浿"&list%5b1%5d.age=55&list%5b2%5d.name="�����"
			log.info(dto);
		}
	}
	
	//@InitBinder �� �̿��ؼ� Ŀ���� ������ Ÿ�� ��ȯ�� ó���� �� ����
	// new CustomDateEditor(dataFormat,true) // true : �ΰ���� , false �ΰ� �����
	
//	@InitBinder
//	public void InitBinder(WebDataBinder binder) {
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(df,false));
//	}
	//����Ʈ�ѷ� ����Ҷ� Ư���� ��¥ �ڸ��� �����ؼ� ��밡����
	@GetMapping("/test7")
	public void test7(TodoDTO dto) {
		log.info("URL : /test7");
		log.info(dto);
	}
	
	@GetMapping("/test8")
	public void test8(TodoDTO2 dto) {
		log.info("URL : /test8");
		log.info(dto);
	}
}
