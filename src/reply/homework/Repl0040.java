package reply.homework;

import java.util.Scanner;

public class Repl0040 {

	public static void main(String[] args) {
	
	/*
	 * For you to do: 

By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

First Output: "Enter name of the instructor"

case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

Other than these four names if the user provides any other names --> " Invalid instructor selected"	
	 */
		

		Scanner input=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name=input.nextLine();
		
		String take="";
		
		switch(name) {
		
		case "Shiva":
			take="Will take care of Java Assignment";
			break;
		case "Sandish":
			take="Will take care of SDLC Assignment";
			break;
		case "Wegas":
			take="Will take care of Selenium Assignment";
            break;
		case "Asel":
			take="Will take care of every Assignment";
		 break;
			default:
				take=" Invalid instructor selected ";
		}
		
		System.out.println(take);
		
	
}
}
