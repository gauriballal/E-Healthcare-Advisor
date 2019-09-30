
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_connection {
	public static void main(String args[])
	{
		try
		{
			Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_healthcare_advisor?user=root&password=admin&useSSL=false");
		    System.out.println("database connectivity successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
