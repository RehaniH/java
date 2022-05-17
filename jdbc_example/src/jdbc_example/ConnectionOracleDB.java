package jdbc_example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionOracleDB {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Driver d = new oracle.jdbc.driver.OracleDriver();

			DriverManager.registerDriver(d);

			// replace here with the url, user name and password fields used in your oracle
			// db installation
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username",
					"password");
			System.out.println(connection.isClosed());
			Statement statement = connection.createStatement();
			String sql = "create table student123(sid number(10), sname varchar2(20), gender char(1),address varchar2(20))";
			boolean isResultsetObj = statement.execute(sql);
			System.out.println("sql returns result set object = " + isResultsetObj);

			System.out.println(connection.getAutoCommit());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
