package com.korea.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.korea.domain.Criteria;
import com.korea.domain.ReplyVO;

public interface ReplyMapper {

	
		//���
		public int insert(ReplyVO vo);
		
		//��ȸ
		public ReplyVO read(Long rno);
		
		//����
		public int update(ReplyVO reply);
		//����
		public int delete(Long rno);
//		
		// ����¡ ó��
		
		public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri, @Param("bno") Long bno);
		
		//��۰��� ��������
		
		public int getCountBuBno(Long bno);

		

		
	
}