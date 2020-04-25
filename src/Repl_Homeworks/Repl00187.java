package Repl_Homeworks;

import java.util.LinkedList;

/*
 * Create Linked List that will store Integer Objects

Add the values below:
111
222
333
444
555
666

Create a logic to calculate sum of the all the values in list. 

Print the result of sum. 

Expected Output:
Result of sum is 2331
 */
public class Repl00187 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		
		int result = 0;
		
		for (Integer value : list) {
			result = result + value;
		}
		
		System.out.println("Result of sum is " + result);
	}
	

}

