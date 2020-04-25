package com.anmtd.dai.controller.rest;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.anmtd.component.DatatableRequest;
import com.anmtd.dai.entity.Daimn;
import com.anmtd.dai.repository.DaimnRepository;

@RestController
@RequestMapping("/api/dai")
public class DaiRestController {
    private static Logger _log = LoggerFactory.getLogger(DaiRestController.class);

    @Autowired
    private DaimnRepository daimnRepository;

    @Autowired
    private DatatableRequest datatableRequest;

    @RequestMapping(value = "/list", method = { RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody Daimn getDais(@RequestParam String id) {
	_log.info("Request Param:" + id.trim());
	Daimn daimn = daimnRepository.fetchById(id.trim()).orElse(null);
	return daimn;
    }

    @RequestMapping(value = "/pagemn", method = { RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody Map<String, Object> getDais(@RequestParam Map<String, String> data) {
	_log.info("Request Param:" + data);
	datatableRequest.setDataRequest(data);
	Map<String, Object> dataResponse = new HashMap<String, Object>();
	dataResponse.put("draw", "1");
	Page<Daimn> _pageData = daimnRepository.findAll(PageRequest.of(0, 10));
	dataResponse.put("data", _pageData.getContent());
	dataResponse.put("page", data.get("page"));
	dataResponse.put("size", data.get("page"));
	dataResponse.put("recordsTotal", _pageData.getTotalElements());
	return dataResponse;
    }

    @RequestMapping(value = "/tendaimn", method = { RequestMethod.POST })
    @ResponseStatus(value = HttpStatus.OK)
    public Map<String, Object> getNames(@RequestParam Map<String, String> data) {
	Map<String, Object> dataResponse = new HashMap<String, Object>();
	_log.info("" + daimnRepository.findNames());
	dataResponse.put("data", daimnRepository.findNames());
	return dataResponse;
    }

    @RequestMapping(value = "findDaisByName", method = { RequestMethod.POST })
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody Map<String, Object> findDaisByName(@RequestParam Map<String, String> data) {
	_log.info("Request:" + data);
	Map<String, Object> dataResponse = new HashMap<String, Object>();
	String dai = data.get("dai");
	//_log.info("data response"+daimnRepository.findDaiByName(dai));
	long recordsTotal = daimnRepository.count();
	dataResponse.put("recordsTotal", recordsTotal);
	dataResponse.put("data", daimnRepository.findDaiByName(dai));
	return dataResponse;
    }
}
