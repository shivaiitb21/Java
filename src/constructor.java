//Constructor is a special type of METHOD 
//whose name is same as CLASS name

/* Main purpose of Constructor is 
    1) To Initialise object
    2) Initialise values in instance variable */


class A
{
	//Class me 'instance variable' hoga
	int a; String name; //No value initialised
		
	//A nam ka special METHOD - yahi constructor h
	//CONSTRUCTOR ek special METHOD hota h	
	
	A() //Default constructor as no parameters are passed in 'A'
	{
		a=10; name=null;
	}
	//Result ko display karane ke liye aur ek METHOD - VOID show nam ka
	void show() 
	{
		System.out.print(a+" "+name);
	}
}

//Uparwale class ka object banane ke liye alag class banao - 'constructor' class

public class constructor {

	public static void main(String[] args) {
		
		//Isi main method ke andar class ka object banao
		A ref=new A(); //Ye constructor jo 'class A' me define kiya h, object creation ke time pe hi apne aap ko call kar lega
		
		//Normal method ko show karne ke liye call karna padega
		//But constructor (Special method) ko call nahi karna padega apne aap call ho jayega
		ref.show();
	}

}

// Java ke har ek class me default constructor hota h
// Javac will also initialise the default values for the constructor

// Constructor sirf aur sirf INSTANCE VARIABLE me value initialise karta h
// INSTANCE variable object ka hi part hota h


