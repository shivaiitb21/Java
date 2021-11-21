//STRING: Predefined class in Java 
// But can also be used as datatype

public class stringClass {

	public static void main(String[] args) {
	
		String str1="Shiva"; //Goes in String Constant Pool SCP
		String str2=new String("Shiva"); //Goes into HEAP memory
		
//		if (str1==str2) //'str1==str2' (This method checks with reference variable) will only see ki pehla wala string object kis me store h aur dusra wala kisme store h
		if (str1.equals(str2)) //Isko reference variable se koi matlab nahi h, it will only see content
		{
			System.out.print("Both are equals");
		}
		else 
		{
			System.out.print("Not equals");
		}

} 
	}
