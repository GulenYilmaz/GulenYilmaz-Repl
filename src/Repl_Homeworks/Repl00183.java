package Repl_Homeworks;
import java.util.*;

/*
 * Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.

Print Linked List

Expected Output
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
 */
public class Repl00183 {
public static void main(String[] args) {
	

	
	LinkedList<Integer> nums= new LinkedList<>();
	
	
	for (int x = 50; x <100; x++) {
		nums.add(x);
	}

	System.out.println(nums);
	
	nums.forEach(n -> System.out.print(n+", "));
	


	Iterator <Integer> n = nums.iterator();
	
	while (n.hasNext()) {
		if (!(n.next() % 3 == 0)) {
			n.remove();
		}
	}
	
	System.out.println(nums);
}

}
