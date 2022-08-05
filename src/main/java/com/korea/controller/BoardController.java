package com.korea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.korea.domain.BoardVO;
import com.korea.domain.Criteria;
import com.korea.domain.PageDTO;
import com.korea.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("list : " + cri);
		model.addAttribute("list",service.getList(cri));
		//model.addAttribute("pageMaker",new PageDTO(cri,123));
		
		int total = service.getTotal(cri);
		log.info("total : " + total);
		model.addAttribute("pageMaker",new PageDTO(cri,total));
	}
	
	@GetMapping({"/get","/modify"})
	public void get(@RequestParam("bno") Long bno, Model model, @ModelAttribute("cri") Criteria cri) {
		log.info("/get");
		model.addAttribute("board",service.get(bno));
	}
	
	@PostMapping("modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("modify: " + board);
		if(service.modify(board)) {
			rttr.addFlashAttribute("result","Update success");
		}
		return "redirect:/board/list";
		
	}
	@PostMapping("remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		
		log.info("remove : " + bno);
		if(service.remove(bno)) {
			rttr.addFlashAttribute("result","Delete succss");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		service.register(board);
		rttr.addFlashAttribute("result",board.getBno());
		return "redirect:/board/list";
	}
	@GetMapping("/register")
	public void register() {
		
	}
}
