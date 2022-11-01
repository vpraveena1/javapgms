package week1.day2Assignment;
/*Check the given number is palindrome or not 

Int num =34343

Initialize a  temporary variable.

Reverse the number (using for loop and add to the temporary variable)

Compare the temporary number with reversed number

If both numbers are same, print "palindrome number"

Else print "not palindrome number"*/

public class Palindrome {

	public static void main(String[] args) {
		int num=34343, a, sum=0;
		int temp;
		temp=num;
		while(num>0)
		{
			a=num%10;
			sum=(sum*10)+a;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(temp+"  is a palindrome number");
		else
			System.out.println(temp+"  is not a palindromenumber");
			
		}
		

	}


