
public class second {

	int a=10; // instance variable ('a' is class variable i.e. instance variable is a part of class variable) 
	static double b=20.50;
	
	public static void main(String[] args) {
		
		boolean c = true; //Local Variable
		
		//Instance variable i.e. part of a class variable cant be accessed without a object	
		//To access the instance variable, we should have a object of a class
		
		second s=new second(); //object named 's' of class 'second'
		
		//now the instance variable 'a' can be accessed with the help of object 's'
		System.out.println(s.a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
