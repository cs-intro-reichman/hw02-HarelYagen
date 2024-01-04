public class PerfectNumbers{
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		String isperfect = x + " is a perfect number since " + x + " =";
		int totaldividers = 0;
		for(int i = 1; i <= (x - 1); i++) {
	    	if((x % i) == 0){ 
        		isperfect = isperfect + " " + i + " +"; 
        		totaldividers = totaldividers + i;
			}
		}
		

		if(totaldividers == x)
		{
		   System.out.print(isperfect.substring(0, isperfect.length() - 1));
		}
		else 
		{
           System.out.print(x + " is not a perfect number");
		}    
	}
}



		// define x input int and k = 1 
		
		// define varuble string true

		// for x - 1 time you run this function

		// if x % k == 0 defind a string and add k in to the string  print (" + " + string) and . 

		// defind varuble int that add the numbers to a totaldividers then  k ++ 
		
		//else k++ 

		// when the loop is done 

		// if totaldividers == x print the string ture else print the string false