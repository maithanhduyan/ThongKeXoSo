package com.tkxs.domain.mn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkxs.domain.mn.entity.DaiMN;
import com.tkxs.domain.mn.repository.DaiMNRepository;

/**
 * @author Mai Thành Duy An
 *
 */

@Service
public class DaiMNServiceImpl implements DaiMNService {

	@Autowired
	DaiMNRepository daiMNRepository;

	@Override
	public List<DaiMN> findAll() {
		return daiMNRepository.findAll();
	}

}
