/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int lastnum = 0;
                int randomnum;
                while(true){
                randomnum = (int)(10 * Math.random());
                if(randomnum < lastnum){
                        break;
                } 
                System.out.println(randomnum);
                lastnum = randomnum;
                }
	}
}
	