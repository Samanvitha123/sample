package com.mvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.bean.LoginBean;
import com.mvc.dao.EventDao;
import com.mvc.dao.LoginDao;
@Controller
public class Event_insert {
	@Autowired
	  EventDao userService;
	  @RequestMapping(value = "/RegisterEvent", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("RegisterEvent");
	    mav.addObject("login", new LoginBean());
	    return mav;
	  }
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("success") LoginBean login) {
	    ModelAndView mav = null;
	   
	    return mav;
	  }
	

}
