package com.tkxs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

/**
 * @author Mai Thành Duy An
 */
class DataAccessTestCase {

	@Test
	void getConnection() throws IOException, ClassNotFoundException, SQLException {
		Connection conection = DataAccess.getConnection();
		Statement statement = conection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT Version()");
		if(resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
	}
	
	@Test
	void closeAll() throws ClassNotFoundException, SQLException, IOException {
		Connection connection = DataAccess.getConnection();
		DataAccess.closeAll(connection);
	}

}
