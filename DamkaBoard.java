public class DamkaBoard{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i = 1; i <= n; i++){
			if(i % 2 == 0){
				System.out.print(" ");
			}
			for(int t = 1; t < n; t++){
				System.out.print("* ");
			}
			System.out.print("*");
			if (i % 2 == 1) System.out.print(" ");
			System.out.println();
		}
	}
}

		// take imput n + varuble count = 0 

		// if count <= n  print "* " n times and then prinln + count++

		//if count == n print end the code else print " *" n times and then prinln count++