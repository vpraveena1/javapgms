package week1.day2Assignment;

/*/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
public class ArrayCompare {

	public static void main(String[] args) {
		
    			int num1[]= {3,2,11,4,6,7};
				int num2[]= {1,2,8,4,9,7};
				int len1,len2;
				len1=num1.length;
				len2=num2.length;
				
				for(int i=0;i<=len1-1;i++) 
				{
					//System.out.println(num1[]);
					for(int j=0; j<=len2-1;j++)
					{
						if(num2[j]==num1[i])
							System.out.println(num1[i]);
					}
				}

			}
}

	