package com.tkxs.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tkxs.domain.dai.entity.Dai;
import com.tkxs.domain.dai.service.DaiService;

/**
 * @author Mai Thành Duy An
 *
 */
@RestController
public class DaiRestController {

	@Autowired
	DaiService daiService;

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/api/dai/findAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public List<Dai> findAll() {
		return daiService.findAll();
	}
}
