import java.sql.*;
import java.util.*;
public class View {
	public static void main(String args[])
	{
		try
		{
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_healthcare_advisor?user=root&password=admin&useSSL=false&allowPublicKeyRetrieval=true");
			System.out.println("Patient's information is as follows:");
	    	Statement smt=con.createStatement();
	
	    	String q="Select * from patient_information";
		
	    	ResultSet rs2=smt.executeQuery(q);

	    	if(rs2.next())
	    	{ 
	    		do{
	    			System.out.println(rs2.getString(1)+","+rs2.getString(2)+","+rs2.getString(3)+","+rs2.getString(4)+","+rs2.getString(5));
	    		}while(rs2.next());
	    	}
	    	else{
			System.out.println("Record Not Found...");
	    	}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
