package Repl_Homeworks;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet
Create Set to store String Objects and you want them to be stored in ascending order
Please add the below values and see the result 
"India"
"Australia"
"South Africa"
"India"
"America"
"America"

Print the Set. 

Expected Output: 
[America, Australia, India, South Africa]
 */
public class Repl00192 {

	
	public static void main(String[] args) {
		
		Set<String> str=new TreeSet<>();
		str.add("India");
		str.add("Australia");
		str.add("South Africa");
		str.add("India");
		str.add("America");
		str.add("America");
		System.out.println(str);
	}
}
