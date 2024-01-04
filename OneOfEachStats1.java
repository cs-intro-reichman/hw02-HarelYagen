/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
import java.lang.Math;
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here

       int familytwo = 0;
       int familythree = 0;
       int familyforeandmore = 0;
       int avergechildrecounter = 0;
       int runtime = Integer.parseInt(args[0]);

              for (int i = 1; i <= runtime; i++){
              int children = 0;
              double boy = 0.0; 
              double girl = 1.0;
                while(!( boy > 0.5 && girl <= 0.5)) { 
                      double number = Math.random();
                      boy = Math.max(number, boy);
                      girl = Math.min(number, girl);
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

       double everge = ((double)avergechildrecounter / runtime);
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

        
