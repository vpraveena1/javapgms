package week1.day2Assignment;
/*Problem statement:
 *  Check if the number is positive or negative------
 *  psedocode: 1. Initialize a number, say, int number= 35;
 *   2. If a number is positive, print "The number is positive" 
 *   If a number is negative, print "The number is negative"
 *    If it nether negative nor positive, print as
 *     "The number is neither positive nor negative" 

Assignment(Array)
*/
public class CheckPositive {

	public static void main(String[] args) {
		int num= 35;
		if(num>=0)
		{
			System.out.println("The number is positive "+num);
		}
			else if(num<=0)
			{
		System.out.println("The number is negative "+num);	
		
		}
			else {
		System.out.println("The is neither positive nor negative "+num);
			}
}

	}

