package reply.homework;

import java.util.Scanner;

public class Repl0045 {

	public static void main(String[] args) {
		/*For you to do:
Ask the user to enter any number from 1-7.
Based on the number define the day of the week


Example Output:
Input a number between 1-7
Friday

Example Output:
Input a number between 1-7
Invalid
	*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number between 1-7");
		
		int num=scan.nextInt();
		
		String dayOftheWeek;
		
		switch(num) {
		case 1:
			dayOftheWeek="Monday";
			break;
		case 2:
			dayOftheWeek="Tuesday";	
		break;
		case 3:
			dayOftheWeek="Wednesday";
		break;
		case 4:
			dayOftheWeek="Thursday";	
		break;
		case 5:
			dayOftheWeek="Friday";	
		break;
		case 6:
			dayOftheWeek="Saturday";	
		break;
		case 7:
			dayOftheWeek="Sunday";	
		break;
		
		default:
			dayOftheWeek="unknown";
		}
		System.out.println(dayOftheWeek);
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
