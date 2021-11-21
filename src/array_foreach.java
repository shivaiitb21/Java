import java.util.Arrays;
import java.util.Scanner;

public class array_foreach {

	public static void main(String[] args) {
		
//		int a[] = {10,20,30,40,50}; // one way to create array
		
		int a[] = new int[5]; //Array of size 5
		System.out.println("Enter array elements: ");
		Scanner s=new Scanner(System.in);
		
		//Now elements needs to be entered into array
		for (int i=0;i<5;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.print("\nArray Elements: ");
		//For each loop to print array elements
		//For each loop prints/operates code on each element 
		//of the variable holding multiple values stored in ARRAY
		
		//Every element in Array 'a' 
		// gets transferred from 'a' to 'b' 
		// and gets executed by loop
		for (int b : a) {
			System.out.print(b+" ");
		}
		

	}

}
