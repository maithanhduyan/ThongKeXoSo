package com.anmtd.dai.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.anmtd.dai.entity.Daimn;
import com.anmtd.dai.repository.DaimnRepository;

@RestController
@RequestMapping("/api/dai")
public class DaiRestController {
    private static Logger _log = LoggerFactory.getLogger(DaiRestController.class);

    @Autowired
    private DaimnRepository daimnRepository;

    @RequestMapping(value = "/list", method = { RequestMethod.POST,
	    RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody Daimn getDais(@RequestParam String id) {
	_log.info("Request Param:" + id.trim());
	Daimn daimn = daimnRepository.fetchById(id.trim()).orElse(null);
	return daimn;
    }
}
