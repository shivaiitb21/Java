import java.util.Scanner;

public class condition_ifelse {

	public static void main(String[] args) {
		
		int pwd;
		
		System.out.print("Please enter your password:= ");
		
		Scanner obj=new Scanner(System.in);
		
		pwd=obj.nextInt();
		
		if(pwd==2129)
		{
			System.out.println("My name is Shivanand ");
			System.out.println("My age is 24");
			System.out.println("Contact: 1234567890");
			System.out.println("Address: Delhi");
			
		}
		else
		{
			System.out.println("Sorry!! Wrong password...");
		}

	}

}
