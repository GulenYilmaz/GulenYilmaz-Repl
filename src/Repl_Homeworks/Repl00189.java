package Repl_Homeworks;

import java.util.HashSet;

/*
 * Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999
 
Print elements one by one.

Expected Output
999
111
 */
public class Repl00189 {
	
	public static void main(String[] args) {
	    
		HashSet<Integer> list = new HashSet<Integer>();
	     
	      list.add(111);
	      list.add(111);
	      list.add(111);
	      list.add(999);
	      list.add(999);
	      list.add(999);
	      
	      for(Integer l:list){
	        System.out.println(l);
	      }
	  }
}
