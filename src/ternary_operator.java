//To check three conditions 

public class ternary_operator {

	public static void main(String[] args) {
		
		int a=10, b=100, c=65465;
		
		int r = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.print("Maximum number: "+r);
	}

}
