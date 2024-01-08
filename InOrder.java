/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here TODO: remove unused comments
		int lastnum = 0; // TODO: it's better to use camelCase: lastNum, randomNum
                int randomnum;
                while(true){
                        // TODO: missing identations to the right
                randomnum = (int)(10 * Math.random());
                if(randomnum < lastnum){
                        break;
                } 
                System.out.println(randomnum);
                lastnum = randomnum;
                }
	}
}
	