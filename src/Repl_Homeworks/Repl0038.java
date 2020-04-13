package Repl_Homeworks;

import java.util.Scanner;

public class Repl0038 {
	public static void main(String[] args) {
	/*For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
"Today you will be learning ____"
	 * 	
	 */
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Is it weekend?");
		 
		 boolean weekend=scan.nextBoolean();
		 String subject=scan.nextLine();
		
		 if(!weekend){
			subject="Manual testing";
		}else {
			subject="Java";
		}
		System.out.println("Today you will be learning "+subject);
	}		
	}
	
	
	
	


