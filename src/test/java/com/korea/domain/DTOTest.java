package com.korea.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class DTOTest {
	@Autowired
	private TestDTO testdto;
	
	@Test
	public void test() {
		
//		TestDTO dto = new TestDTO("ȫ�浿","44","�뱸");
//		dto.setAddr("���");
//		System.out.println(dto);
		
		
		TestDTO dto = TestDTO.builder()
				.age("55")
				.name("ȫ����")
				.addr("�ּ��ּ�")
				.build(); // ���� �˷��� 
		System.out.println(dto);
	}

	@Test
	public void test2() {
		log.info("testDTO : " + testdto);
	}
}
