package jdbc_example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BatchUpdateMain {

	public static void main(String[] args) {
		try {

			InputStream inputStream = BatchUpdateMain.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			if (inputStream == null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}
			properties.load(inputStream);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(properties.getProperty("db.url"),
					properties.getProperty("db.user"), properties.getProperty("db.password"));

			Statement statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.addBatch("insert into student123 values(3, 'Shama', 'F', 'India')");
			statement.addBatch("insert into student123 values(4, 'Induwara', 'M', 'Sri Lanka')");
			statement.addBatch("update student123 set sid=7 where sname='Shama'");
			statement.addBatch("update student123 set  sname='Dewmal' where sid=5");
//			statement.addBatch("delete from student123 where sid=3");
//			statement.addBatch("delete from student123 where sid=4");
			int[] batch = statement.executeBatch();
			for (int count : batch) {
				System.out.println(count + " executed successfully.");
			}
			connection.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}

}
