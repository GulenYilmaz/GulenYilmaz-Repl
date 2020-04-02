package reply.homework;
//Declare two static variables to hold
//country name
//continent
//
//Create a method to display the value of static variables in the following format:
// 
//____ located on ____ continent
//
//In the main method assign values to a static variable and execute method display
//
//Expected Output:
//Morocco located on Africa continent


public class Repl00124 {

	static String countryName;
    static String continent;
    
	
	static void method() {
		System.out.println( countryName+" located on "+continent+" continent");
	}
	
	public static void main(String[] args) {

		Repl00124 obj= new Repl00124();
		obj.countryName="Morocco";
		obj.continent="Africa";
		obj.method();
	}

	
	
}
