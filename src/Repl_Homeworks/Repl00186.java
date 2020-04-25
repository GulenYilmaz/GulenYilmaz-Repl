package Repl_Homeworks;

import java.util.LinkedList;
import java.util.List;

/*
 * Create an Linked List that will store all prime numbers from 1 to 100

Step 1. Create a method that will identify wether number is prime or not
Step 2. Add all prime numbers into Linked List

Print Linked List:

Expected Output:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 8
 */



public class Repl00186 {
	
	public static boolean isPrime(int number) {
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> primeNumbers = new LinkedList<>();
		
		
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		System.out.println(primeNumbers);
	}
	
	
}


