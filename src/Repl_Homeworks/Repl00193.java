package Repl_Homeworks;
import java.util.*;



/*
 * Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values 
null
Sohil 
Diego
Alijon
Asel
Sumair 
 
Print values 1 by 1 using loop and Iterator 
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
 */
public class Repl00193 {
public static void main(String[] args) {
	
	Set<String> str=new LinkedHashSet<>();
	str.add(null);
	str.add("Sohil");
	str.add("Diego");
	str.add("Alijon");
	str.add("Asel");
	str.add("Sumair");


	Iterator <String >it=str.iterator();
	while(it.hasNext()) {
		
	System.out.println(it.next());
	}
	for(String s:str) {
		System.out.println(s);
	}
	
}
}
