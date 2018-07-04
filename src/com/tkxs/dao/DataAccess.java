package com.tkxs.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Mai Thành Duy An
 */
public class DataAccess {

	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
		Properties properties = new Properties();
		FileInputStream fis = null;
		fis = new FileInputStream(PropertiesKeys.APP_PROPERTIES_FILE_NAME);
		properties.load(fis);
		String _driverClassName = properties.getProperty(PropertiesKeys.DRIVER_CLASS_NAME);
		String _username = properties.getProperty(PropertiesKeys.APP_USERNAME);
		String _password = properties.getProperty(PropertiesKeys.APP_PASSWORD);
		String _url = properties.getProperty(PropertiesKeys.APP_URL);
		Class.forName(_driverClassName);
		Connection connection = null;
		connection = DriverManager.getConnection(_url, _username, _password);
		return connection;
	}
	
	public static void closeAll(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}
		}catch(SQLException sqle) {
			System.err.println(sqle.getMessage());
		}
	}

	
}
