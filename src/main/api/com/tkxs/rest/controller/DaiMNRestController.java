package com.tkxs.rest.controller;
/**
 * @author Mai Thành Duy An
 *
 */
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tkxs.domain.mn.entity.DaiMN;
import com.tkxs.domain.mn.service.DaiMNService;


@RestController
public class DaiMNRestController {
	private static final Logger LOG = LoggerFactory.getLogger(DaiMNRestController.class);
	@Autowired
	DaiMNService daiMNService;

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/api/daimn", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public String getDaiMN() {
		return "DaiMN";
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/api/daimn/findAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public List<DaiMN> findAll(@RequestParam Map<String, String > dataRequest) {
		LOG.info(dataRequest.get("command"));
		String dai = dataRequest.get("dai");
		LOG.info(dataRequest.get("dai"));
		LOG.info(dataRequest.get("id"));
		return daiMNService.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/api/daimn/findByDai", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public List<DaiMN> findByDai(@RequestParam Map<String, String > dataRequest) {
		List<DaiMN> list = null;
		LOG.info(dataRequest.get("command"));
		String dai = dataRequest.get("dai");
		LOG.info(dataRequest.get("dai"));
		LOG.info(dataRequest.get("id"));
		list = daiMNService.findByDai(dai);
		int deep = 10;
		daiMNService.statistic(dai, deep);
		LOG.info("Size: "+list.size());
		return list;
	}

}
