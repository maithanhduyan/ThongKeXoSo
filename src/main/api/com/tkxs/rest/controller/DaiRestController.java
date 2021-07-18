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

import com.tkxs.domain.dai.entity.Dai;
import com.tkxs.domain.dai.service.DaiService;
import com.tkxs.domain.mn.service.DaiMNService;

@RestController
public class DaiRestController {

	private static final Logger LOG = LoggerFactory.getLogger(DaiRestController.class);

	@Autowired
	DaiService daiService;
	
	@Autowired 
	DaiMNService daiMNService;

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/api/dai/findAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public List<Dai> findAll(@RequestParam Map<String, String> dataRequest) {
		List<Dai> listDai = null;
		LOG.info("Data Request: " + dataRequest.toString());
		String command = dataRequest.get("command");
		
		LOG.info("Command: " + command);
		if (command.equalsIgnoreCase("ListDai")) {
			listDai = daiService.findAll();
		}
		return listDai;
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/api/dai/findByName", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public List<Dai> findByName(@RequestParam Map<String, String> dataRequest) {
		List<Dai> listDai = null;
		LOG.info("Data Request: " + dataRequest.toString());
		String command = dataRequest.get("command");
		LOG.info("Command: " + command);
		if (command.equalsIgnoreCase("findByName")) {
			listDai = daiService.findAll();
		}
		return listDai;
	}
}
