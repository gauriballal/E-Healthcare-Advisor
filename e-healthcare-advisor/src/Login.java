import java.util.*;
import java.sql.*;

public class Login {
	public static void main(String args[])
	{
		try
		{
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_healthcare_advisor?user=root&password=admin&useSSL=false&allowPublicKeyRetrieval=true");
			System.out.println("\n Login as 1.Patient 2.Admin");
		    Scanner scan = new Scanner(System.in);
		    int choice=scan.nextInt();
		    switch(choice)
		    {
		    case 1:
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
		          
		    break;
		    case 2:
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
		         
		        
		    
		    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
