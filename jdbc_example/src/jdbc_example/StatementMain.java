package jdbc_example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class StatementMain {

	public static void main(String[] args) {
		try {
			//reading config.properties file
			InputStream inputStream = StatementMain.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			
			if(inputStream==null) {
				System.out.println("Sorry, couldn't load the config.properties file");
				return;
			}
			properties.load(inputStream);
			
			//registering and loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//getting the connection
				Connection connection = DriverManager.getConnection(properties.getProperty("db.url"), 
						properties.getProperty("db.user"), properties.getProperty("db.password"));
				
				Statement statement = connection.createStatement();
				String sql = "insert into student123 values(2, 'Malinga', 'M', 'New Zealand')";
				boolean resultset = statement.execute(sql);
				System.out.println("Resultset obtained = "  + resultset);
				
				String sqlUpdate = "update student123 set sname='Sachini' where sid = 1";
				int updateCount = statement.executeUpdate(sqlUpdate);
				System.out.println(updateCount + " rows affected.\n");
				
				String sqlResultsSet = "select * from student123";
				ResultSet results = statement.executeQuery(sqlResultsSet);
				
				while(results.next()) {
					System.out.print(results.getLong("sid") + " ");
					System.out.print(results.getString("sname") + " ");
					System.out.println(results.getString("address"));
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			//if there's an error in statement or not added
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Completed");
		}

	}

}
