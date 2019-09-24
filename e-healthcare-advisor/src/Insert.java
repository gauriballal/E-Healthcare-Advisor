import java.sql.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
class Insert
{
	public static void main(String args[])
	{
		try
		{
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ e_healthcare_advisor?user=root&password=admin&useSSL=false");
		   // System.out.println("database connectivity successful");
			System.out.println("Register as a patient...Enter the following details");
		    Scanner scan = new Scanner(System.in);
		    System.out.println("enter name");
		    String name=scan.nextLine();
		    
		    System.out.println("enter email");
		    String mail = scan.nextLine();
		    
		    System.out.println("enter phone");
		    Long phone=scan.nextLong();
		    scan.nextLine();
		    
		    String mpattern="(0/91)?[0-9]{10}";
		    
		    System.out.println("enter password: your password must be atleast 8 characters,contains at least 1 digit,atleast 1 lowercase and uppercase character, contain atleat special character from [@ # $ % ! .]");
		    String pass=scan.nextLine();
		   
		    System.out.println("confirmed password");
		    String cpass = scan.nextLine();
		    
		    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&])(?=\\S+$).{8,15}";
		    
		    Statement st = con.createStatement();  
		    
		      
		      if(pass.matches(pattern) && pass.equals(cpass))
		      {
           /* java.util.Date date=new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            java.sql.Timestamp sqltime=new java.sql.Timestamp(date.getTime());
            PreparedStatement ps = con.prepareStatement("insert into register_patient(date,time)values(?,?)");
            ps.setDate(1,sqlDate);
            ps.setTimestamp(2, sqltime);
            ps.executeUpdate();
            ps.close();*/
            int patient_id = 0;
			String a = "INSERT INTO register_patient Values("+patient_id+",'"+name+"','"+mail+"',"+phone+",'"+pass+"','"+cpass+"')";
            st.executeUpdate(a);
            System.out.println("Congratulations!!! You are registered");
		      }
		      else
		    	  System.out.println(" Registration unsuccessful...Please enter correct password");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
	}

	
}
