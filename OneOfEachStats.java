
import java.util.Random;

public class OneOfEachStats {
	public static void main(String[] args) {

       int familytwo = 0;
       int familythree = 0;
       int familyforeandmore = 0;
       int avergechildrecounter = 0;
       int T = Integer.parseInt(args[0]);
       int seed = Integer.parseInt(args[1]);
       Random rand = new Random(seed);

              for (int i = 1; i <= T; i++){
              int children = 0;
              double boy = 0.0; 
              double girl = 1.0;
                while(!( boy > 0.5 && girl <= 0.5)) { 
                      if(rand.nextDouble() > 0.5) {
                         boy = (double)1;
                      }
                      else{
                        girl = (double)0;
                      }
                      children++;
                }
                avergechildrecounter = avergechildrecounter + children;

                if(children == 2){
                  familytwo++; 
                }

                else if(children == 3){
                  familythree++; 
                }
              
                else{
                  familyforeandmore++; 
                }

          }

       double everge = ((double)avergechildrecounter / T);
       System.out.println("Average: " + everge + " children to get at least one of each gender.");
       int common = Math.max(familytwo, familythree);
       int mostcommon = Math.max(common, familyforeandmore);
       System.out.println("Number of families with 2 children:" + familytwo);
       System.out.println("Number of families with 3 children:" + familythree);
       System.out.println("Number of families with 4 or more children:" + familyforeandmore);


       if(familytwo == mostcommon){
          System.out.println("The most common number of children is 2.");
       }

       else if(familythree == mostcommon){
           System.out.println("The most common number of children is 3.");
 
       }

       else{
            System.out.println("The most common number of children is 4 or more.");

       }
  }
}
        //children++

        // everge childre counter++ 

        //end loop 

	    	// max = (max,number) min = (min,number)

        //avrege = evergechildrecounter / time

        // most common = max(family2, family3)

        // most common = max(most common, family4+)

        // if family2 == most common println 

        // else if family3 == most common println

        //else family4+ == most common println

        