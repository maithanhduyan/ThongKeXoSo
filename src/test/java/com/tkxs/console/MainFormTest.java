package com.tkxs.console;

public class MainFormTest {
	 public static void main(String[] args) {
	        Database database = new Database();
	        DaiManagerUtil.statistic(database.getDai("AnGiang"), 500);
	    }
}
