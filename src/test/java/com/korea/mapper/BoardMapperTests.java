package com.korea.mapper;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.korea.domain.BoardVO;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	@Test
	public void testGetList() {
		//mapper.getList().forEach(board->log.info(board));
		
		//mapper.getListXML().forEach(board->log.info(board));
		
		//BoardVO board = new BoardVO();
		//board.setTitle("�����ۼ��ϴ� ��4");
		//board.setContent("�����ۼ��ϴ³���4");
		//board.setWriter("�ۼ���4");
		//mapper.insertXML(board);
		//mapper.insert(board);
		//log.info(board);
		
//		long bno = mapper.insertSelectKey(board);
//		log.info("bno : " +board.getBno());
		
//		BoardVO board = mapper.read(100L);
//		log.info(board);
	}

}
