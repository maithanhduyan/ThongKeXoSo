package com.tkxs.domain.dai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkxs.domain.dai.entity.Dai;
import com.tkxs.domain.dai.repository.DaiRepository;

/**
 * @author Mai Thành Duy An
 *
 */
@Service
public class DaiServiceImpl implements DaiService {

	@Autowired
	DaiRepository daiRepository;

	@Override
	public List<Dai> findAll() {
		return daiRepository.findAll();
	}

}
