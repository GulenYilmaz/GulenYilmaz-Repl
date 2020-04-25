package Repl_Homeworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Create Hash Map. 
add the follow values

map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT
 
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL


 */
public class Repl00203 {
public static void main(String[] args) {
		
		
		Map<String,String> map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
	   
System.out.println("HashMap Before Replace :");

		Set<Entry<String, String>> entries=map.entrySet();
		
		Iterator<Entry<String,String>>e2=entries.iterator();
			while(e2.hasNext()) {
				Entry<String,String> ee2=e2.next();
			System.out.println(ee2.getKey()+" : "+ee2.getValue());
			
			
			}
			System.out.println("------------------");
			System.out.println("HashMap After Replace :");
			
			map.replace("THREE","ASEL");
			map.replace("FIVE","SUMAIR");
			Iterator<Entry<String,String>>e1=entries.iterator();
			while(e1.hasNext()) {
				Entry<String,String> ee1=e1.next();
	
			System.out.println(ee1.getKey()+" : "+ee1.getValue());
		
			
		
			}
		
		
}
}

