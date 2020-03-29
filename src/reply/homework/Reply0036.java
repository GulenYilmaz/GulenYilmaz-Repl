package reply.homework;

import java.util.Scanner;

public class Reply0036 {

	public static void main(String[] args) {
	/*For you to do:
Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"

Example input/output:
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND

word1: banana 
word2: apple 
int1: 2 
int2: 2 
Output: OR


		word1: phone
word2: pie
int1: 2
int2: 3
Output: NONE
	 * 	
	 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1, word2;
		word1=scan.nextLine();
		word2=scan.nextLine();
		System.out.println("Please enter two numbers");
		int int1, int2;
		int1=scan.nextInt();
		int2=scan.nextInt();
		
		if(int1==int2 && word1.equals(word2)) {
			System.out.println("AND");
		}else if (int1==int2 || word1.equals(word2)) {
			System.out.println("OR");
		}else if (int1!=int2 && word1!=word2) {
			System.out.println("NONE");
		
		}
		
		
		
		
	}

}
