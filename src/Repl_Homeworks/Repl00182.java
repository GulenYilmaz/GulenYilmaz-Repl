package Repl_Homeworks;
/*
 * Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line

Numbers in:
4
62
8
5
4

Expected Output:
4 62 8 5 4 

 */
import java.util.ArrayList;
import java.util.Scanner;
public class Repl00182 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers=new ArrayList<>();
	    Scanner scan=new Scanner(System.in);
	    
	    //int num=scan.nextInt();     --->  numbers.add(scan.nextInt());	    
	    for (int i =0; i<=4; i++){
	      numbers.add(scan.nextInt());
	    }
	    for (int i=0; i<numbers.size();i++){
	      System.out.print(numbers.get(i)+" ");
	}
		
	}
}
