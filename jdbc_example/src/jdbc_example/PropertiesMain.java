package jdbc_example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		
		try(InputStream input = PropertiesMain.class.getClassLoader().getResourceAsStream("config.properties")){
			Properties properties = new Properties();
			
			if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
			properties.load(input);
			
			System.out.println("url: " + properties.getProperty("db.url"));
			System.out.println("username: " + properties.getProperty("db.user"));
			System.out.println("password: " + properties.getProperty("db.password"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
