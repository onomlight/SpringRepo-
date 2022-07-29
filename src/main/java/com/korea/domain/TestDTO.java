package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
// ������ getter setter �ѹ����ϴ°�

@NoArgsConstructor
//����Ʈ ������ Ȯ���ϱ�

@AllArgsConstructor
//��� ������ ȣ�� 

@Component

@Builder

public class TestDTO {
	
	private String name;
	private String age;
	private String addr;
	
	
//	TestDTO(){}
//	TestDTO(String name, String age , String addr){} ���� ����� ��

}
