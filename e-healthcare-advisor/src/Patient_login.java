

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Patient_login {
	public void patient_login()
	{
		try
		{
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_healthcare_advisor?user=root&password=admin&useSSL=false&allowPublicKeyRetrieval=true");
			System.out.println("\n Login as 1.Patient ");
		    Scanner scan = new Scanner(System.in);
		    int choice=scan.nextInt();
		    
		    	System.out.println("Enter username as your email");
		    	String email=scan.nextLine();
		    	email=scan.nextLine();
		    	System.out.println("Enter password");
		    	String password = scan.nextLine();
		    	
		    	Statement st=con.createStatement();
		           ResultSet rs=st.executeQuery("SELECT email, password FROM register_patient where email='"+email+"' and password='"+password+"'");
		           int count=0;
		           while(rs.next()){
		           count++;
		          }
		          if(count>0){
		           System.out.println("welcome "+email);
		           System.out.println(" Congratulations!!!you are logged in successfully");
		           System.out.println("As you are logged in please fill the following information");
		           System.out.println("enter name");
				    String name=scan.nextLine();
				    
				    System.out.println("enter bloodgroup");
				    String bgroup=scan.nextLine();
				    
				    System.out.println("enter your city");
				    String city=scan.nextLine();
				    
				    System.out.println("Do you have any allergy?If yes,please mention");
				    String allergy=scan.nextLine();
				    
				    System.out.println("Do you have any chronic disease?");
				    String disease=scan.nextLine();
				    
				    String a = "INSERT INTO patient_information Values('"+name+"','"+bgroup+"','"+city+"','"+allergy+"','"+disease+"')";
		            st.executeUpdate(a);
		            
		            System.out.println("Thanks for the information");
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
