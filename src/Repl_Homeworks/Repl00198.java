package Repl_Homeworks;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi

Extract all keys and it values and print them in the format below:

Expected Output:
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
 */
public class Repl00198 {
public static void main(String[] args) {
	
Map<Integer,String>iteam=new TreeMap<>();
	
     iteam.put(1,"apple");
     iteam.put(2,"banana");
     iteam.put(3,"pear");
     iteam.put(4,"tomato");
     iteam.put(5,"mango");
     iteam.put(6,"kiwi");
	
	Set<Entry<Integer,String>> entries=iteam.entrySet();
	for(Entry<Integer,String>e:entries) {
		
		System.out.println("Key is "+e.getKey()+" item and values is "+e.getValue());
	}
	
	
}
}
