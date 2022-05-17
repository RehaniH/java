package jdbc_example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ResultSetMetaDataMain {

	public static void main(String[] args) {

		try {
			
			InputStream input = ResultSetMetaDataMain.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			
			if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
			properties.load(input);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(properties.getProperty("db.url"),
					properties.getProperty("db.user"), properties.getProperty("db.password"));
			
			
			Statement statement = connection.createStatement();
			String sql = "select * from student123";
			ResultSet resultSet = statement.executeQuery(sql);
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			System.out.println(resultSetMetaData.getColumnCount());
			System.out.println(resultSetMetaData.getColumnClassName(1));
			System.out.println(resultSetMetaData.getColumnLabel(1));
			System.out.println(resultSetMetaData.getColumnLabel(2));
			System.out.println(resultSetMetaData.getColumnType(1));
			System.out.println(resultSetMetaData.isWritable(3));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
