package com.tkxs.domain.mn.service;

import java.util.HashMap;
/**
 * @author Mai Thành Duy An
 *
 */
import java.util.List;
import java.util.Map;

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
	public Map<String, String[]> statistic(String dai, int deep) {
		Map<String, String[]> dataOutput = new HashMap<String, String[]>();
		System.out.println("init statistic");
		List<String> ls100 = twoNumberMNTable.ls100();
		List<DaiMN> lst = daiMNRepository.findByDai(dai, deep);
//		for (int i = 0; i < ls100.size(); i++) {
//			System.out.print(ls100.get(i));
//
//			System.out.println();
//		}

		String[] twoNum = new String[18];
		for (int i = 0; i < lst.size(); i++) {
			twoNum[0] = StringUtil.sub2Number(lst.get(i).getGiaiDacBiet());
			twoNum[1] = StringUtil.sub2Number(lst.get(i).getGiaiNhat());
			twoNum[2] = StringUtil.sub2Number(lst.get(i).getGiaiNhi());
			twoNum[3] = StringUtil.sub2Number(lst.get(i).getGiaiBa1());
			twoNum[4] = StringUtil.sub2Number(lst.get(i).getGiaiBa2());
			twoNum[5] = StringUtil.sub2Number(lst.get(i).getGiaiTu1());
			twoNum[6] = StringUtil.sub2Number(lst.get(i).getGiaiTu2());
			twoNum[7] = StringUtil.sub2Number(lst.get(i).getGiaiTu3());
			twoNum[8] = StringUtil.sub2Number(lst.get(i).getGiaiTu4());
			twoNum[9] = StringUtil.sub2Number(lst.get(i).getGiaiTu5());
			twoNum[10] = StringUtil.sub2Number(lst.get(i).getGiaiTu6());
			twoNum[11] = StringUtil.sub2Number(lst.get(i).getGiaiTu7());
			twoNum[12] = StringUtil.sub2Number(lst.get(i).getGiaiNam());
			twoNum[13] = StringUtil.sub2Number(lst.get(i).getGiaiSau1());
			twoNum[14] = StringUtil.sub2Number(lst.get(i).getGiaiSau2());
			twoNum[15] = StringUtil.sub2Number(lst.get(i).getGiaiSau3());
			twoNum[16] = StringUtil.sub2Number(lst.get(i).getGiaiBay());
			twoNum[17] = StringUtil.sub2Number(lst.get(i).getGiaiTam());
			dataOutput.put(lst.get(i).getId().toString(), twoNum);
			System.out.println(dataOutput.toString());
		}
		return dataOutput;
	}

}
