public class Reversing{
	public static void main(String[] args){
		String input = args[0];
	    int length = input.length();
	    for(int curentplace = length - 1; curentplace >= 0; curentplace--)
		{
			System.out.print(input.charAt(curentplace));
		}

	 	System.out.println();

	    if((length % 2) == 0){
		  System.out.print("The middle character is "  
	      + input.charAt(length - (length / 2)));
		}
	    else 
		{ 
			System.out.print("The middle character is "  
	        + input.charAt((length - 1) - ((length - 1) / 2)));
		}

	}
}
