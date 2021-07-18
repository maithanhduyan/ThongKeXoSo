package com.tkxs.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TwoNumberMNTable {

	/**
	 * @return List 100 number 00 to 99
	 */
	public  List<String> ls100() {
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

	public TwoNumberMNTable() {
	};
}
