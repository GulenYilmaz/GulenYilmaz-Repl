package Repl_Homeworks;
import java.util.*;

/*
 * Create an ArrayList of type boolean called listA and add below values
(true, false, false)

Create another array list call listB and ad all values from List A into it

Using iterator print all values from ListB 1 by 1

Expected Output:
true
false
false
 */
public class Repl00185 {

	public static void main(String[] args) {

		ArrayList <Boolean> listA= new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		System.out.println("-----listA------");
		System.out.println(listA);
		ArrayList <Boolean> listB=new ArrayList<>();
		
		
		System.out.println("----listB------");
		listB.addAll(listA);
		System.out.println(listB);
		
		
		System.out.println("-----itertor-----");
	
		Iterator<Boolean> it=listB.iterator();
		while (it.hasNext()) {
				boolean b=it.next();
        System.out.println(b);
		}
	}
	}


