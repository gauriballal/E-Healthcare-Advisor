
import java.util.Scanner;
public class Main 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose appropriate option");
		System.out.print("Enter your choice: \n1. Patient Login\n2. Admin Login\n");
		int Choice = scan.nextInt();
		switch (Choice) {
		case 1: 
			System.out.println("1.Signup 2.Signin 3.Chat with admin");
			int op = scan.nextInt();
			switch(op)
			{
			case 1: 
				Registration r = new Registration();
				r.registration();
				break;
			case 2:
				Patient_login p = new Patient_login();
				p.patient_login();
				break;
			case 3:
				Chat c = new Chat();
				c.chat();
				break;
			default:
				System.out.println("Invalid");
			
			}
			break;
		case 2:
			Admin_login a = new Admin_login();
			a.admin_login();
			System.out.println("View or delete patient's information");
			System.out.println("1.View 2.Delete");
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				View v= new View();
				v.view();
				break;
			}
			break;
		default:
			System.out.println("Enter proper choice");
		}
	}
	
}
