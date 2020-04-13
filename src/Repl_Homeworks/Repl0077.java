package Repl_Homeworks;

import java.util.Scanner;

public class Repl0077 {

	public static void main(String[] args) {
		/*For you to do:
Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order. 

Example: 
Input: 
1
2
3
4
5
Output:
5
4
3
2
1
		 * 
		 */
	Scanner scan=new Scanner(System.in);
		
	int[] elements=new int [5];//-->0,1,2,3,4
	
	for(int i=0; i<elements.length; i++) {
		
	elements [i]=scan.nextInt();
	
	}
	for(int i=elements.length-1; i>=0; i--) {
		System.out.println(elements[i]);
	}	
		
		
		
		
		
		
	}

}
