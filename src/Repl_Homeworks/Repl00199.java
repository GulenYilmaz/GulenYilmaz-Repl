package Repl_Homeworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
 * Create HashMap 
add values as below

map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 
map.put("mango", 40); 
 map.put("mango", 40);     

Using iterator retrieve all keys and values if the format below:

Expected Output:
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40

 */
public class Repl00199 {
public static void main(String[] args) {
	
	Map<String,Integer> map=new HashMap<>();
	
    map.put("mango",10);
    map.put("apple", 30); 
    map.put("orange", 20); 
    map.put("mango", 40); 
     map.put("mango", 40);     

    
    Set<Entry<String, Integer>> entries=map.entrySet();
	Iterator<Entry<String,Integer>>e=entries.iterator();
		while(e.hasNext()) {
			Entry<String,Integer> ee=e.next();
		System.out.println("Key = "+ee.getKey()+" and value = "+ee.getValue());
	
	
		}
}
}
