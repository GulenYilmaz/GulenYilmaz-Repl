package Repl_Homeworks;
/*
 * Create a program that will handle exception to match below output:

Expected Output:
java.lang.ArrayIndexOutOfBoundsException: 4
	at Main.main(Main.java:5)
 */
public class Repl00207 {
public static void main(String[] args) {
	
	int []array= {0,2,4};
	
	
	try {
	System.out.println(array[4]);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}