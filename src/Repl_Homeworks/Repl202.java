package Repl_Homeworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Create a Hash Map of String pairs 
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

Using entry set print key and values pairs using loop

Remove below from Map
"ONE"
"FOUR"

Using entry set print key and values pairs using loop

Expected Output:
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC

 */
public class Repl202 {

	public static void main(String[] args) {
		
		
		Map<String,String> map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
	   

		Set<Entry<String, String>> entries=map.entrySet();
		Iterator<Entry<String,String>>e=entries.iterator();
			while(e.hasNext()) {
				Entry<String,String> ee=e.next();
			System.out.println(ee.getKey()+" : "+ee.getValue());
			}
			

			System.out.println("------------------");
			System.out.println("HashMap After Remove :");
			Iterator<Entry<String,String>>e1=entries.iterator();
			while(e1.hasNext()) {
				Entry<String,String> ee1=e1.next();
			
			
		if (!(ee1.getKey().equals("ONE")||ee1.getKey().equals("FOUR"))) {
			e1.remove();
			System.out.println(ee1.getKey()+" : "+ee1.getValue());
		}
		
			}
		
		
		
		
	}

}
