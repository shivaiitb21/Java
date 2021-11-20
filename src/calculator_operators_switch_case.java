import java.util.Scanner;

// Switch : Multiple choice decision making selection statement
// Switch is used to select only one case out of multiple cases

public class calculator_operators_switch_case {

	public static void main(String[] args) {
		
		int a,b,c,ch;
		System.out.print("Enter any two numbers: ");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.print("Enter your choice: ");
		ch = s.nextInt();
		
		//Switch se expression pass karna padega
		//Expression ka input le lo
		switch(ch) {
		
			case 1:c=a+b;
				System.out.println("Addition: "+c);
				break;
				
			case 2: c=a-b;
				System.out.println("Substraction: "+c);
				break;
			
			case 3: c=a*b;
				System.out.println("Multiplication: "+c);
				break;
				
			case 4: c=a/b;
				System.out.println("Division: "+c);
				break;
			
			case 5: c=a%b;
				System.out.println("Remainder: "+c);
				break;
			
			default: System.out.print("Invalid choice...");
		
		}
			

	}

}
