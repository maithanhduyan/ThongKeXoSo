package com.tkxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tkxs.domain.mn.entity.DaiMN;
import com.tkxs.domain.mn.service.DaiMNService;

/**
 * @author Mai Thành Duy An
 *
 */
@RestController
public class DaiMNRestController {

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
	public List<DaiMN> findAll() {
		return daiMNService.findAll();
	}

}
