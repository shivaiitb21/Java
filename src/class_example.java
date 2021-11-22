//Class: group of elements having common properties and behaviours.
// e.g. Person ke kuch props hote (weight) h aur kuch behaviours (gussa karna)

//To define common behaviour and property we create a class in Java

// NOTE:---> Class is virtual, logical & no memory allocated
// NOTE:---> Object is always real

public class class_example {
	
//yaha pe ham 'Class example = person' 
//iska ham common property and behaviour ka combination bata diye
	
	//Properties of a person
	int age=24;
	int weight=72;
	String colour="White";
	
	//Behaviours of a person - lets define by 'method'
	void shout() 
	{
		System.out.println("I shout in anger...");
	}
	void love() 
	{
		System.out.println("I always love...");
	}

	public static void main(String[] args) {
		
		//Access the common properties and behavious through real part
		//Access through real part i.e. object
		//Object are created in real part
		class_example p=new class_example();
		
		//Note:---> Hamne yaha pe class_example is nam ka class banaya h
		
		System.out.println(p.age); //Use common properties of class (person) through real part object (p)
		System.out.println(p.weight);
		System.out.println(p.colour);
		
		//Show behaviour by Calling method
		p.shout();
		p.love();

	}

}
