package com.tkxs.domain.mn.service;
/**
 * @author Mai Thành Duy An
 *
 */
import java.util.List;

import com.tkxs.domain.mn.entity.DaiMN;


public interface DaiMNService {

	public List<DaiMN> findAll();
	
	public List<DaiMN> findByDai(String dai);
	
	public List<String> statistic(String dai, int deep);
}
