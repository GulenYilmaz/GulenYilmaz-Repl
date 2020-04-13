package Repl_Homeworks;

import java.util.Scanner;

public class Repl0039 {

	public static void main(String[] args) {
/*
 * A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade. 

Example Output:
Please enter your mark
Your grade is A

Example Output:
Please enter your mark
Please enter valid mark
 */


		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter your mark");
		 
		 int grade=scan.nextInt();
		 String score =scan.nextLine();
		
		 if(grade>=1 && grade<25){
			 score="F";
			 System.out.println("Your grade is "+score);
		}else if(grade>=25 && grade<45) {
			score="E";
			System.out.println("Your grade is "+score);
		}else if(grade>=45 && grade<50) {
			score="D";
			System.out.println("Your grade is "+score);
		}else if(grade>=50 && grade<60) {
			score="C";
			System.out.println("Your grade is "+score);
		}else if(grade>=60 && grade<80) {
			score="B";
			System.out.println("Your grade is "+score);
		}else if (grade>=80 ) {
			score="A";
			System.out.println("Your grade is "+score);
		}else if(grade<25) {
			
			System.out.println("Please enter valid mark");
	}	
		 
}		
}
		
		
		
	
