package com.tkxs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tkxs.domain.mn.service.DaiMNService;

@Controller
public class MainController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	DaiMNService daiMNService; 

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		String message = "Hello Spring Boot + JSP";

		model.addAttribute("message", message);
		LOG.info("Size: " + daiMNService.findAll().size());
		return "index";
	}
}
