package com.tkxs.console;

/**
 * @author Mai Thành Duy An
 */

public class StringUtil {

	public static String sub2Number(String string) {
		if (string.length() > 2) {
			string = string.substring(string.length() - 2, string.length());
		}
		return string;
	}

	public static String check2Number(String number, String[] data) {
		String check = null;
		for (int i = 0; i < data.length; i++) {
			String str = StringUtil.sub2Number(data[i]);
			if (number.equalsIgnoreCase(str)) {
				return "X";
			} else {
				check = "-";
			}
		}
		return check;
	}
}