package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	
    @Test public void testGetList() {
	 
    log.info("-------------------------------"); 
    boardMapper.getList(); 
    
    }
	
	@Test
	public void testInsert() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("Test 테스트");
		vo.setContent("Content 테스트");
		vo.setWriter("tester");
		
		boardMapper.insert(vo);
		log.info("---------------------------------");
		log.info("after insert " + vo.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("AAATest 테스트");
		vo.setContent("AAAContent 테스트");
		vo.setWriter("tester");
		
		boardMapper.insertSelectKey(vo);
		log.info("---------------------------------");
		log.info("after insert selectKey " + vo.getBno());
		
	}
	
	@Test
	public void testRead() {
		
		BoardVO vo = boardMapper.read(9L);
		log.info(vo);
	}
	
	@Test
	public void testDelete() {
		
		int count = boardMapper.delete(1L);
		
		log.info("count : " + count);
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(9L);
		vo.setTitle("update Title");
		vo.setContent("update Content");
		vo.setWriter("user00");
		
		log.info("count : " + boardMapper.update(vo));
	}
	
	
	 @Test public void testPaging() { 
		 
	// 1 10 
	Criteria cri = new Criteria();
	 
	 List<BoardVO> list = boardMapper.getListWithPaging(cri);
	 
	 list.forEach(b -> log.info(b)); 
	 
	 }
	 
	 @Test
	 public void testPageDTO() {
		 
		Criteria cri = new Criteria();
		cri.setPageNum(25);
		 
		PageDTO pageDTO = new PageDTO(cri, 251);
		
		log.info(pageDTO);
		 
	 }
}










