public class Luckystreak{
	public static void main(String[] args){
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
        // import the function of random number and do a 

        //while loop that said while last random is =< prints a space 

        // dfinde in the end of the loop the value of the last random and comper with the new random

        // when the loop is over close the program \ stop