package com.tkxs.data;


import org.junit.jupiter.api.Test;

/**
 * @author Mai Thành Duy An
 */
class DatabaseTestCase {
	
	@SuppressWarnings("static-access")
	@Test
	void layKetQuaDai() {
		 Database database = new Database();
		 database.displayDai(database.URL_VungTau, 5);
	}

}
