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

		// get an input string 

		// length() funcion gives the lenght of the string so the last char num of the string is n-1

		//defind length as a varuble and  the length -1 as a varuble called curentplace 

		// for length times prints the char in place num curentplace and - curentplace--

		//after the for done go for next line 

		//if length % 2 == 0 prints char in place ((length-1) - (length \ 2))

		//else print char in place ((length-1) - ( (n-1) \ 2 ) )