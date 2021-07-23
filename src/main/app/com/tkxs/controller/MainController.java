package com.tkxs.controller;

/**
 * @author Mai Thành Duy An
 *
 */
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

	@RequestMapping(value = { "/", "/index", "/index.html" }, method = RequestMethod.GET)
	public String index(Model model) {

		String message = "Thống Kê Xổ Số 2 số";

		model.addAttribute("message", message);
		LOG.info("Size: " + daiMNService.findAll().size());
		LOG.trace("This is TRACE");
		LOG.debug("This is DEBUG");
		LOG.info("This is INFO");
		LOG.warn("This is WARN");
		LOG.error("This is ERROR");
		return "index";
	}

	@RequestMapping(value = { "/dashboard", "/dashboard.html"  }, method = RequestMethod.GET)
	public String viewDaiDashboard() {
		return "dashboard";
	}
	
	@RequestMapping(value = { "/daimn", "/daimn.html"  }, method = RequestMethod.GET)
	public String viewDaiDetail() {
		return "daimn";
	}

	@RequestMapping(value = { "/thongke2so.html" }, method = RequestMethod.GET)
	public String viewThongKe2So() {
		return "thongke2so";
	}
}
