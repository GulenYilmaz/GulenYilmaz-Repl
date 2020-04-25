package Repl_Homeworks;

import java.util.HashSet;
import java.util.Set;

/*
 * Create a set collection in which you do not want to preserve or sort the order and add below values to it. 

Red
Pink
Yellow
White
Black

Print set collection
And get total number of colors available in the set

Expected Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
 */
public class Repl00191 {

	public static void main(String[] args) {
		Set<String> str=new HashSet<>();
		
		str.add("Red");
		str.add("Pink");
		str.add("Yellow");
		str.add("White");
		str.add("Black");
		
		System.out.println("Original Hash Set: "+str);
		System.out.println("Size of the Hash Set: "+str.size());
		
		
	}
	
	
}
