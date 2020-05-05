package Repl_Homeworks;
/*
 * Complete the code, handle possible exception

Expected Output: 
/ by zero
 */
public class Repl00206 {
	
		public static void main(String[] args) {
		     int a=10, b=0; 
		     int result;
		     
		   try {  result = a/b;
		     
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
		  }
		}