package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
//������ getter setter �ѹ����ϴ°�
@NoArgsConstructor
//����Ʈ ������ Ȯ���ϱ�
@AllArgsConstructor
//��� ������ ȣ�� 
@Component
@Builder
public class BoardDTO {
	private int no;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private String pwd;
	private int count;
	private String ip;
	private String filename;
	private String filesize;
}
