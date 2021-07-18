package com.tkxs.console;

/**
 * @author Mai Thành Duy An
 */

import java.util.ArrayList;
import java.util.List;

public class DaiManagerUtil {

	public static void statistic(List<String> dai, int deep) {
		int size = dai.size();
		List<String> twoNums = new ArrayList<>();
		List<String> list100 = initList100();
		if (deep < size) {
			for (int i = 0; i < deep; i++) {
				twoNums.add(subList(dai.get(i)));
			}
		}
		for (int i = 0; i < list100.size(); i++) {
			System.out.print(list100.get(i) + ": ");
			for (int j = 0; j < twoNums.size(); j++) {
				String[] s = twoNums.get(j).split(",");
				System.out.print(StringUtil.check2Number(list100.get(i), s));
			}
			System.out.println("");
		}
	}

	private static String subList(String list) {
		String[] s = list.split(",");
		String str = "";
		for (int i = 2; i < s.length; i++) {
			str += StringUtil.sub2Number(s[i]);
			if (i != 19) {
				str += ",";
			}
		}
		// System.out.println(str);
		return str;
	}

	private static List<String> initList100() {
		List<String> list100 = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			if (i < 10) {
				list100.add("0" + i);
			} else {
				list100.add("" + i);
			}
		}
		return list100;
	}

}