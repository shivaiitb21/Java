/* METHOD: A group/block of code which takes i/p from user, process it and gives output.
   Method runs only when called
   Code reusability provide karata h
   Agar non static method ko call kar rahe h to object banana padega 
   Bina object ke app non static ko call nahi kar sakte*/

public class method {

	/* 'main' method is also a user defined method (bcoz in the body {} we user write the code
	 Apne java program ka execution main method me h start hotay aur main me hi khatam hota h
	 Execution ka starting aur ending point 'main' method hi hota h
	 Is user defined method ko JVM call karta h when we run the program*/
	
	public static void main(String[] args) {
		
		//When our method is not static we creat a object
		method m = new method();
		
		int s = m.Sum(10,20); // Calling
		
		System.out.print("Addition "+s);

	}

//Khud ka user defined method banate h
	
	//Agar method static nahi hota to method ka object banana padta
	
	int Sum(int a, int b) // Method definition (parameters of methods are our inputs)
	{
		return a+b; //Returns are output of our method
	}
	
	}
