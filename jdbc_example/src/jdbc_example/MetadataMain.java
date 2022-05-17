package jdbc_example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MetadataMain {

	public static void main(String[] args) {

		try {
			
			InputStream inputStream = MetadataMain.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			
			if(inputStream==null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}
			properties.load(inputStream);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(properties.getProperty("db.url"), 
					properties.getProperty("db.user"), properties.getProperty("db.password"));
			
			DatabaseMetaData dbMetaData = connection.getMetaData();
			System.out.println(dbMetaData.getDriverName());
			System.out.println(dbMetaData.getDriverVersion());
			System.out.println(dbMetaData.getDriverMajorVersion());
			System.out.println(dbMetaData.getDriverMinorVersion());
			System.out.println(dbMetaData.getURL());
			System.out.println(dbMetaData.getUserName());
			System.out.println(dbMetaData.getDatabaseProductName());
			System.out.println(dbMetaData.getDatabaseProductVersion());
			System.out.println("is read only = " + dbMetaData.isReadOnly());
			System.out.println("is supporting savepoints = " + dbMetaData.supportsSavepoints());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
