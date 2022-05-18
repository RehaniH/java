package jdbc_example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CallableStatementMain {

	public static void main(String[] args) {

		try {

			InputStream inputStream = CallableStatementMain.class.getClassLoader()
					.getResourceAsStream("config.properties");
			Properties properties = new Properties();

			if (inputStream == null) {
				System.out.println("Sorry, couldn't load the config.properties file");
				return;
			}
			properties.load(inputStream);

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(properties.getProperty("db.url"),
					properties.getProperty("db.user"), properties.getProperty("db.password"));
			
			CallableStatement callableStatement = connection.prepareCall("{call \"insertstudent123\"(?, ?, ?, ?)}");
			callableStatement.setInt(1, 10);
			callableStatement.setString(2, "student procedure");
			callableStatement.setString(3, "F");
			callableStatement.setString(4, "Netherland");
			callableStatement.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
