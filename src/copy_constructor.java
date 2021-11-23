				/* Copy Constructor */

// When 'OBJECT' reference is passed to the constructor as a parameter
// Copy Constructor is used to copy the content of one object to the other
// Ek object ke sare content ko dusre object me pass kar deta h

class Aa 
{	
	int a; String b; //Variables bana lo
	Aa() //Default constructor -- iska value ham copy karenge
	{
		a=10; b="Learn Coding"; //Initialise values
		System.out.println(a+" "+b);
	}
	
	//EK aur constructor to copy the values of the above constructor
	Aa(Aa ref) //Class type ka reference as a parameter (yahi refenrence ke through ham upar wale constructor ke content ko copy karenge
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
			
	}
}



public class copy_constructor {

	public static void main(String[] args) {
		
		Aa r=new Aa(); //Class 'A' ka object ban gaya h
		
		//Copy constructor ek object 'r' ki value ko dusre object 'r2' me copy karta h
		Aa r2 = new Aa(r);

	}

}
