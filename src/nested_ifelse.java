import java.util.Scanner;

public class nested_ifelse {

	public static void main(String[] args) {
		
		int a,b,c;
		
		System.out.print("Enter three numbers: ");
		
		Scanner obj=new Scanner(System.in);
		
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		
		if(a>b) {
			
			if (a>c) {
				
				System.out.print("Maximum number: "+a);
				
			}
			
			else {
				
				System.out.print("Maximum number: "+c);
				
			}
		}
		
		else {
			
			if(b>c) {
				
				System.out.print("Maaximum number: "+b);
				
			}
			
			else {
				
				System.out.print("Maximum number: "+c);
				
			}
		}
	}

}
