
import java.sql.*;
import java.util.*;
public class Admin_login {
	public void admin_login()
	{
		try
		{
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_healthcare_advisor?user=root&password=admin&useSSL=false&allowPublicKeyRetrieval=true");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter username");
	    	String username=scan.nextLine();
	    	username=scan.nextLine();
	    	System.out.println("Enter password");
	    	String password1 = scan.nextLine();
	    	
	    	Statement stmt=con.createStatement();
	           ResultSet rs1=stmt.executeQuery("SELECT username, password FROM admin_login where username='"+username+"' and password='"+password1+"'");
	           int count1=0;
	           while(rs1.next()){
	           count1++;
	          }
	          if(count1>0){
	           System.out.println("welcome "+username);
	           }
	          else
	        	  System.out.println("Wrong Credentials...Enter correct username or password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
