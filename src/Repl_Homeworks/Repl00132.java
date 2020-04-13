package Repl_Homeworks;

//For you to do:
//
//In AnotherClass declare a private, default, protected, public methods 
//and have them each return the name of the what access modifier they are using.
//All methods should be accessible by class name
//
//Call methods of Another class inside Main class
//
//Expected Output:
//default
//protected
//public

public class Repl00132 {

	public void  method() {
		System.out.println("public");
	}
	private void  method1() {
		System.out.println("Private");
	}
	 void  method2() {
		System.out.println("Default");
	}
	protected void  method3() {
		System.out.println("Protected");
	}
	
	
}

class Mainn extends Repl00132{
	
	public static void main(String[] args) {
		
		
		Repl00132 obj= new Repl00132();
		obj.method2();
		obj.method3();
		obj.method();
		
		
	}
}
