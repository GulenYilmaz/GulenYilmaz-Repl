package reply.homework;
//Create two methods:
//The first method should be a non-static method that will print out the following message:
//"Programming is amazing."
//
//The second method should be a static method that will print out the following message:
//"Java is awesome."
//
//Execute both methods
//
//Expected Output:
//Programming is amazing.
//Java is awesome.


public class Repl00123 {

	
	void method1() {
		System.out.println("Programming is amazing.");
	}
	static void method2() {
		System.out.println("Java is awesome.");
	}
	
	public static void main(String[] args) {

		Repl00123 obj= new Repl00123();
		obj.method1();
		obj.method2();
		
	}
}
