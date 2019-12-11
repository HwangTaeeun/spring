package com.koitt.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.koitt.www.dao.MemberDAO;

@Controller
@RequestMapping("/member/")
public class Member {
	@Autowired
	MemberDAO mDAO;

	@RequestMapping("login.van")
	public ModelAndView loginForm(ModelAndView mv) {
		mv.setViewName("member/login");
		
		return mv;
	}
}
