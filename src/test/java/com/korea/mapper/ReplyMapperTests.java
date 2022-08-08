package com.korea.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.korea.domain.Criteria;
import com.korea.domain.ReplyVO;


import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class ReplyMapperTests {
	
	@Autowired
	private ReplyMapper mapper;
	@Test
	public void testMapper() {
		log.info(mapper);
	}
	
	@Test
	public void InserTest() {
		ReplyVO vo= new ReplyVO();
		vo.setBno(3L);
		vo.setReply("댓글테스트1");
		vo.setReplyer("wirter1");
		mapper.insert(vo);
	}
	
	@Test
	
	public void ReadTest() {
		ReplyVO vo = mapper.read(25L);
		
		log.info("read : " + vo);
	}
	
	@Test
	public void UpdateTest() {
		ReplyVO vo = mapper.read(23L);
		vo.setReply("UpdateTest");
		int count = mapper.update(vo);
		log.info("UPDATE COUNT : " + count);
	}
	
	@Test
	public void DeleteTest() {
		mapper.delete(1);
	}
	
	@Test
	public void CreateReply2() {
		long bnolist[] = {23L,24L,25L};
		ReplyVO vo = new ReplyVO();
		
		
		for (int i=0;i<bnolist.length;i++) {
			
			
			for(int j=0;j<5;j++) {
				vo.setBno(bnolist[i]);
				vo.setReply("테스트"+j);
				vo.setReplyer("작성자"+i);
				mapper.insert(vo);
			}
		}
	}
	
	@Test
	public void getListPage() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 25L);
		replies.forEach(reply -> log.info(reply));
	}

}