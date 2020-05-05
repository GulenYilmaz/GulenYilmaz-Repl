package Repl_Homeworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Create a method that will not be handling exception 
 * and throwing it at caller.
In main method call method and handle the exception.

Expected Output:
java.io.FileNotFoundException:  (No such file or directory)
 */

public class Repl00208 {
   
	
	
	public static void method1(String filePath) throws FileNotFoundException{
	
    FileInputStream fis= new FileInputStream(filePath);
	
	
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		try{
			method1("");
			
		}catch (FileNotFoundException e) {
		System.out.println(e);
		//System.out.println(e.getMessage());
	    //e.printStackTrace();
		}
}
}
