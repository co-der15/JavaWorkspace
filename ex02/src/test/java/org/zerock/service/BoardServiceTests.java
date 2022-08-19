package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.TimeMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testPrint() {
		
		log.info(service);
		
	}
	
	@Test
	public void testGetList() {
	
		service.getList().forEach(board -> log.info(board));
		
	}
	
	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setTitle("AAATest �׽�Ʈ");
		vo.setContent("AAAContent �׽�Ʈ");
		vo.setWriter("tester");
		
		Long bno = service.register(vo);
		
		log.info("BNO : " + bno);
	}
	
	@Test
	public void testGet() {
		
		log.info(service.get(5L));
	}
	
	@Test
	public void testDelete() {
		
		log.info("REMOVE RESULT : " + service.remove(3L));
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board = service.get(5L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("���� �����մϴ�");
		log.info("MODIFY RESULT : " + service.modify(board));
	}

}
