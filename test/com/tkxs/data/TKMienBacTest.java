package com.tkxs.data;

import org.junit.jupiter.api.Test;

public class TKMienBacTest {
	@Test
	void testStatistic() {
		Database database = new Database();
		DaiManagerUtil.statistic(database.getDai("MienBac"), 80);  
	}
}
