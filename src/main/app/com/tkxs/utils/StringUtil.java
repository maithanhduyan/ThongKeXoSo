package com.tkxs.utils;

/**
 * @author Mai Thành Duy An
 *
 */
public class StringUtil {

	public static String sub2Number(String string) {
		if (string.length() > 2) {
			string = string.substring(string.length() - 2, string.length());
		}
		return string;
	}
}
