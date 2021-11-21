
public class stringImmutability {

	public static void main(String[] args) {
		
		String str1="Shiva"; //Immutable (Cant change)
		str1.concat(" Ji"); //It wont be concatanated
		System.out.println(str1); //still only shiva will be printed
		
		//But we can make a copy
		String str2=str1.concat(" Ji");
		System.out.print(str2);
			

	}

}
