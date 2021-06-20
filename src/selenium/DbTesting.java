package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTesting {
	
	
	
	public static void selectQuery() throws SQLException, ClassNotFoundException {	
		
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","1988sase@12");
		
		if(connection.isClosed()) {
			
			System.out.println("Not connected to database");
			
		}else {
			
			System.out.println("Successsly connected to database");
			
		}
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("Select * from employees where id=3;");
		
		while(resultSet.next()) {
			
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString("place"));
			System.out.println(resultSet.getInt("experience"));
		
		}
	
	}
		
		/*
		 * String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName"; String
		 * username = "myUserName"; String password = "myPassword"; //Load MS SQL JDBC
		 * Driver Class.forName("net.sourceforge.jtds.jdbc.Driver"); //Creating
		 * connection to the database Connection con =
		 * DriverManager.getConnection(dbURL,username,password); //Creating statement
		 * object Statement st = con.createStatement(); String selectquery =
		 * "SELECT * FROM <tablename> WHERE <condition>"; //Executing the SQL Query and
		 * store the results in ResultSet ResultSet rs = st.executeQuery(selectquery);
		 * //While loop to iterate through all data and print results while (rs.next())
		 * { System.out.println(rs.getString("transaction_datetime")); } //Closing DB
		 * Connection con.close();
		 */
		}

