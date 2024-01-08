public class Divisors {
	public static void main(String[] args) {
		int runtime = Integer.parseInt(args[0]); // TODO: I don't think that "runtime" is a good name
		for (int i = 1; i <= runtime; i++) {
		if ((runtime % i) == 0)
				{
					System.out.println(i);
				}
		}  
	}

}
		// define x input int and k = 0 

		// for x time you run this function

		// if x % k == 0 print what k is and k ++ 

		// else k++ 

		