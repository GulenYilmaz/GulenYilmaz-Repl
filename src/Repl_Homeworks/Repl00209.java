package Repl_Homeworks;
/*
 * Create a method that will do temperature check.
 *  Anytime user passes temperture 
 *  that is below 32 method should throw an Exception saying 
 *  "It is freezing"

In Main method call the method and handle an Exception

Expected Output: 
java.lang.RuntimeException: It is freezing
 */
public class Repl00209 {
public static void checkTemperature(int temp) {
	
	if(temp<32) {
		throw new RuntimeException ("It is freezing");

	}

}

public static void main(String[] args) {
	try{
		checkTemperature(30);
		}catch(RuntimeException e) {
			System.out.println(e);
		}
	}
}

