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
