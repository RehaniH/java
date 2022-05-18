package jdbc_example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

public class CallableFunctionMain {

	public static void main(String[] args) {
		try {
			
			InputStream inputStream = CallableFunctionMain.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			if(inputStream==null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}
			properties.load(inputStream);

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(properties.getProperty("db.url"), 
					properties.getProperty("db.user"), properties.getProperty("db.password"));
			
			CallableStatement callableStatement = connection.prepareCall("{ ?= call mul(?, ?)}");
			callableStatement.registerOutParameter(1, Types.INTEGER);
			callableStatement.setInt(2, 7);
			callableStatement.setInt(3, 6);
			callableStatement.execute();
			System.out.println("Product = " + callableStatement.getInt(1));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
