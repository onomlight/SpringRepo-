package com.korea.mapper;

import java.util.List;

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

//	@Autowired
//	private BoardMapper mapper;
//	@Test
//	public void testGetList() {
		//mapper.getList().forEach(board->log.info(board));
		
		//mapper.getListXML().forEach(board->log.info(board));
		
//		BoardVO board = new BoardVO();
//		board.setBno(104L);
//		board.setTitle("수정된 제목2");
//		board.setContent("수정된 내용2");
//		board.setWriter("수정된 작성자2");
//		
//		mapper.update(board);
//		mapper.insertXML(board);
//		mapper.insert(board);
//		log.info(board);
		
		
		
//		long bno = mapper.insertSelectKey(board);
//		log.info("bno : " +board.getBno());
		
//		BoardVO board = mapper.read(100L);
//		log.info(board);
		
//		int result = mapper.delete(101L);
//		log.info("result :" + result);
		
 
//		@Autowired
//		private BoardMapper mapper;
		
//		@Autowired
//		private BoardService service;
//		
//		@Test 
//		public void testFunc() {
			 
//			List<BoardVO> list = mapper.getList();
//			
//			list.forEach(dto -> log.info(dto));
			
//			List<BoardVO> list = service.getList();
//			list.forEach(dto -> log.info(dto));
			
//			log.info(service);
//			List<BoardVO> list =service.getList();
			 
//	@Autowired
//	private BoardMapper mapper;
//		@Test
//		public void testgetListWithPaging() {
//			Criteria cri = new Criteria();
//			List<BoardVO>list =mapper.getListWithPaging(cri);
//			list.forEach(board -> log.info(board));
//		}
//			 
//	}
		

	
//	@Autowired
//	private BoardService service;
//	
//	@Test
//	public void testFunc() {
//		
//		log.info(service);
//		
//		service.getList(new Criteria(2,10)).forEach(board->log.info(board));
//	}
		
	//}
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void Test() {
		List<BoardVO> list = mapper.test("내용2");
		log.info("LIST : " + list);
	}
	
	@Test
	public void getListTest() {
		
	}
	
	@Test
	public void insertTest() {	
	}
	@Test
	public void readTest() {
		
	}
	@Test
	public void DeleteTest() {
		
	}
	@Test
	public void UpdateTest() {
		
	}
	@Test
	public void getTotalCountTest() {
		
	}
	
}
	

