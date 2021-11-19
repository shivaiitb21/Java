import java.util.Scanner;

public class Addition_3 {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.print("Enter any two numbers: ");
		
		/* To take inputs from the system we use the 
		// Predefined class in Java 'Scanner'
		// We know to use any class in Java 
		// We need to create an object using scanner class */
		 
		Scanner s=new Scanner(System.in);
		
		// Use predefined method of Scanner class to take input
		a=s.nextInt();
		b=s.nextInt();
		
		c=a+b;
		
		System.out.print("The sum of two numbers is: "+c);
				

	}

}
