package com.tkxs.domain.mn.service;

/**
 * @author Mai Thành Duy An
 *
 */
import java.util.List;
import java.util.Map;

import com.tkxs.domain.mn.entity.DaiMN;

public interface DaiMNService {

	public List<DaiMN> findAll();

	public List<DaiMN> findByDai(String dai);

	public Map<String, String[]> statistic(String dai, int deep);
}
