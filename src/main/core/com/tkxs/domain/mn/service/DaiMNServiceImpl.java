package com.tkxs.domain.mn.service;

/**
 * @author Mai Thành Duy An
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkxs.domain.mn.entity.DaiMN;
import com.tkxs.domain.mn.repository.DaiMNRepository;
import com.tkxs.utils.StringUtil;
import com.tkxs.utils.TwoNumberMNTable;

@Service
public class DaiMNServiceImpl implements DaiMNService {

	@Autowired
	DaiMNRepository daiMNRepository;
	@Autowired
	TwoNumberMNTable twoNumberMNTable;

	@Override
	public List<DaiMN> findAll() {
		return daiMNRepository.findAll();
	}

	@Override
	public List<DaiMN> findByDai(String dai) {
		return daiMNRepository.findByDai(dai);
	}

	@Override
	public List<String> statistic(String dai, int deep) {
		System.out.println("init statistic");
		List<String> ls100 = twoNumberMNTable.ls100();
		List<DaiMN> lst = daiMNRepository.findByDai(dai, deep);
		for (int i = 0; i < ls100.size(); i++) {
			System.out.print(ls100.get(i));
			for (int j = 0; j < lst.size(); j++) {
				if(ls100.get(i).equalsIgnoreCase(StringUtil.sub2Number(lst.get(i).getGiaiDacBiet()))) {
					System.out.print("1");
				}else {
					
					System.out.print("-");
				}
			}
			System.out.println();
		}
		return null;
	}

}
