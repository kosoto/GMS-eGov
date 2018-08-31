package com.gms.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
@SessionAttributes("member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("mem") MemberDTO mem) {
		return (memberService.add(mem))?"redirect:/move/enter/member/login":"enter:member/add.tiles";
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
	public String modify(@ModelAttribute("mem") MemberDTO mem, Model model) {
		memberService.modify(mem);
		model.addAttribute("member", memberService.retrieve(mem));
		return "login__success";
	}
	@RequestMapping(value="/remove",method=RequestMethod.POST)
	public String remove(@ModelAttribute("mem") MemberDTO mem, SessionStatus sessionStatus) {
		boolean removeSuccess = (memberService.remove(mem));
		if(removeSuccess) sessionStatus.setComplete();
		return (removeSuccess)?"redirect:/":"enter:member/remove.tiles";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("mem") MemberDTO mem,Model model) {
		MemberDTO m = memberService.login(mem);
		if(m != null) model.addAttribute("member",m);
		return (m !=null)?"login__success":"redirect:/move/enter/member/login";
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
