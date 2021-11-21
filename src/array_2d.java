import java.util.Arrays;
import java.util.Scanner;

public class array_2d {

	public static void main(String[] args) 
	{
		
// Now make a 2D array		
		int a[][] = new int[2][2]; //Matrix of 2 rows and 2 columns
		System.out.println("Enter array elements: ");
		Scanner s=new Scanner(System.in);
		
		//Now elements needs to be entered into array
		for (int i=0;i<2;i++) 
		{
			
			for (int j=0;j<2;j++) 
			{
				a[i][j]=s.nextInt();
			}	
		}		
		System.out.print("\nMatrix Elements:\n");
		
		for (int i=0;i<2;i++) 
		{
			
			for (int j=0;j<2;j++) 
			{
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}

	}
	

}
