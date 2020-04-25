package Repl_Homeworks;

import java.util.HashSet;

/*
 * Create a Set and and below values to it. 
[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.

Expected Output:
[third, first, second]
[]
 */
public class Repl00190 {
	
	public static void main(String[] args) {
	   
		HashSet<String> hs = new HashSet<>();
	       
		//add elements to HashSet
	        
		    hs.add("first");
	        hs.add("second");
	        hs.add("third");
	        System.out.println(hs);
	        
	        
	        hs.clear();
	        System.out.println(hs);
	  }
}
