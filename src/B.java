			/* Parameterized Constructor */

class C //Class ke liye parenthesis nahi hota
{
	int x,y;
	C(int a, int b) //Parameterized constructor
	{
		x=a; y=b; //store values of 'a' and 'b' in variables x and y
	}
	
	//Ek se jyada parameterized constructors ham bilkul bana SAKTE h
	C(int a, String b)
	{
		System.out.println(a+" "+b);
	}
	void show() 
	{
		System.out.println(x+" "+y);
	}
}

public class B {

	public static void main(String[] args) {
		
		//Class A ka reference variable bana rahe h
		//Class A ke reference variable me hi ham is object ko initialize kar sakte h
		C r=new C(100, 200); //Being a parameterized constructor with 2 integers, we need to pass 2 integers
		r.show();
		C ref=new C(21, "Shiva");
		
	}

}
