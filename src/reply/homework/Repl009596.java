package reply.homework;

import java.util.Scanner;

public class Repl009596 {
/*Create a String given="Hello Syntax friends". 
Using String methods from given String create new String "Welcome Syntax family"

Expected Output:
Welcome Syntax family
 * 
 */
	public static void main(String[] args) {
		
//		String given="Hello Syntax friends";
//		
//        given=given.replaceAll("Hello", "Welcome");
//        given=given.replaceAll("friends","family");
//
//        System.out.println(given);
//		
        
        
        
    /*Given the following inputs:
String s;

Write a for loop that will print out the reverse of the string.

Sample input/outputs:
In: manhattan
nattahnam

In: processor
rossecorp

In: racecar
racecar
     *     
     */
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    
	    String s = inp.nextLine();
	    //write your code below
	    
	    String reserve="";
	    
	    char [] array= s.toCharArray();	
		
		for(int i=s.length()-1; i>=0; i--) { 
			reserve=reserve+array[i];
	    }System.out.println(reserve);
        
        
	}

}
