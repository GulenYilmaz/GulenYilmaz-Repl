package Repl_Homeworks;
//Declare static variable in class level as below and assign its value:
//
//String ss="Welcome To Syntax Technologies"
//
//Access variable in the main method and print it using three ways you learned so far
//
//Hint:
//first way: By calling directly
//Second way: By using the className
//Third way: By creating the object of the class
//
//Expected Output:
//Welcome To Syntax Technologies
//Welcome To Syntax Technologies
//Welcome To Syntax Technologies


public class Repl00120 {
	
	
	
	public static void main(String[] args) {

		Repl00120 obj= new Repl00120();
		
	    ss="Welcome To Syntax Technologies";
	    System.out.println(ss);
		Repl00120.ss="Welcome To Syntax Technologies";
		System.out.println(Repl00120.ss);
		obj.ss="Welcome To Syntax Technologies";
		System.out.println(obj.ss);
		
		
		
	}

	static String ss="Welcome To Syntax Technologies";
	

}
