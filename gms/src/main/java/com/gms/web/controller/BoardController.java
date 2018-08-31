package com.gms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gms.web.domain.ArticleDTO;
import com.gms.web.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired ArticleDTO article;
	@Autowired BoardService boardService;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("article") ArticleDTO article) {
		logger.info("넘어온 타이틀 정보 {}",article.getTitle());
		logger.info("넘어온 컨텐츠 정보 {}",article.getContent());
		logger.info("넘어온 라이터 정보 {}",article.getWriter());
		//boardService.add(article);
		return "auth:board/listAll.tiles";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modify(@ModelAttribute ArticleDTO article,Model model) {
		boardService.modify(article); 
		//수정된 정보를 retrieve에 보여주는 방법? AJAX에서 하자!
		return "login__success";
	}
	@RequestMapping(value="/remove",method=RequestMethod.POST)
	public String remove(@ModelAttribute ArticleDTO article) {
		return (boardService.remove(article))?"redirect:/":"enter:member/remove.tiles";
		
	}
	
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
