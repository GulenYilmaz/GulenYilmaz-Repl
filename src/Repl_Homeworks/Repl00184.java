package Repl_Homeworks;
import java.util.*;
/*
Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

Expected Output:
0 1 1 2 3 5 8 13 21 34 


 */
public class Repl00184 {


	public static void main(String[] args) {
		
		LinkedList<Integer> fib=new LinkedList<>();
		int a=0;
		int b=1;
		int c;
		fib.add(a);
		fib.add(b);
		
		for (int i=0; i<8; i++) {
			c=a+b;
			a=b;
			b=c;
			fib.add(c);
		}
			
		for(int f:fib)	{
			
		
		}System.out.println(fib);
		
		//second way
		/*LinkedList<Integer> fib=new LinkedList<>();
		 * fib.add(0,0);
		 * fib.add(1,1);
		 * int sum;
		 * for(int i=2; i<10; i++){
		 * sum=fib.get(i-1)+fib.get(i_2)};
		 * fib.add(sum);
		 * }
		 * system.out.println(fib);
		 */
	}

}
