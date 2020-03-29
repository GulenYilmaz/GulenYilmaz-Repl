package reply.homework;

import java.util.Scanner;

public class Repl0097 {

	public static void main(String[] args) {
/*Instructions from your teacher:
Write code that will take in a String input and check to see if it is a palindrome or not.

A palindrome means that the characters are the same forwards and backwards, ignoring spaces.

Examples of palindromes:
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

Your check should be case insensitive too.  For example, 
"Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.
 * 
 */
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
		

		 boolean isPalindrome=false;
		  
		 String end="";
		 String result=givenString.replaceAll(" ","");
		 int n = result.length();
		        
		 for(int i = n - 1; i >= 0; i--) {
		            end = end + result.charAt(i);
		        }
		        if(result.equalsIgnoreCase(end)){
		            System.out.println(!isPalindrome);
		        }
		        else{
		            System.out.println(isPalindrome);
		        }
		    }
		}




