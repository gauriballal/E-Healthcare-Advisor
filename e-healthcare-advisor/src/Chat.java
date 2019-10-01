
import java.util.Scanner;
import java.sql.*;
public class Chat {
	public  void chat()
	{
		System.out.println("Chat with admin regarding your disease and medicines");
		System.out.println("Select disease from following options");
		System.out.println("1.headache");
		System.out.println("2.cold and fever");
		System.out.println("3.low haemoglobin");
		Scanner scan = new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Take Disprin for headache");
			System.out.println("We wish for the better health of yours!!!");
			break;
		case 2:
			System.out.println("Take calpol500 for fever and Gpod200 for cold");
			System.out.println("We wish for the better health of yours!!!");
			break;
		case 3:
			System.out.println("For low haemoglobin, daily eat bitroot and pomgranate and take globackZ for fast cure");
			System.out.println("We wish for the better health of yours!!!");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
