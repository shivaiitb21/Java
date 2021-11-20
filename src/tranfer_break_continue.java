// Break - execution stop kar dega
// Continue - us specific condition ko SKIP kar dega
// Remember Continue = SKIP

//# Program to print the specific numbers from  1 to 10
public class tranfer_break_continue {

	public static void main(String[] args) {
		
		int i;
		
		for (i=1;i<=10;++i) {
			
			if (i==5)
//				break; //5 ke bad kuch v print nahi karega
				
				// Jo bhi condition isko milta h aur agar vo true h to us chij ko skip kar deta h
				continue; //5 ko skip kar ke sab print karega
			
			System.out.print(i+" ");
			
		}

	}

}
