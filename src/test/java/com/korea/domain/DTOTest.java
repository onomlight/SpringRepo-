package com.korea.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DTOTest {

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

}
