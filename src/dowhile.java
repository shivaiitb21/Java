import java.util.Scanner;

//When we want to execute the statement in the body of the loop at least once irrespective of the condition being true or false
//Sabse pehle code execute ho jayega in 'do' ki body wala
//Ek bar loop execute hone ke bad condition check karta h
//Increment operation in do while loop

public class dowhile {

	public static void main(String[] args) {
		
		int num;
		System.out.print("Enter any number: ");
		Scanner s=new Scanner(System.in);
		
		num =  s.nextInt();
		
		do {
			
			System.out.println(num); //Ye condition hamesha ke liye true ho gaya
			//Hence give the increment
			++num; //pre-increment operator
			
		}
		
		while(num<=10);
		
		// Condition true hogi to repeated task perform karega 'do' loop
		

	}

}
