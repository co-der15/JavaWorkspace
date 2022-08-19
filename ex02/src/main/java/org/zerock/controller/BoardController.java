package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	private final BoardService service;
	
	
	@GetMapping("/list") 
	public void list(Model model) {
	
	log.info("/list...............");
	  
	model.addAttribute("list", service.getList());
	
	}
	 
	@GetMapping("/register")
	public void registerGET() {
	
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		log.info("board : " + board);
		
		Long bno = service.register(board);
		
		log.info("BNO : " + bno);
		rttr.addFlashAttribute("result", bno);
		
		
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Long bno, Model model) {
		
		log.info("/get");
		model.addAttribute("board", service.get(bno));
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		
		int count = service.modify(board);
		
		if(count == 1) {
			rttr.addFlashAttribute("result", "suceess");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String modify(Long bno, RedirectAttributes rttr) {
		
		int count = service.remove(bno);
		
		if(count == 1) {
			rttr.addFlashAttribute("result", "suceess");
		}
		return "redirect:/board/list";
	}
	
}
