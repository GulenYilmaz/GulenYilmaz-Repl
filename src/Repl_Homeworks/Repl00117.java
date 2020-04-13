package Repl_Homeworks;
//declare 3 instance variables to hold an integer, double and char values.
//Create 2 instances of the class and assign values to 
//variables and the print them
//Expected Output:
//10
//10.23
//a
//100
//100.23
//s


public class Repl00117 {

	int number;
	double number2;
	char grade;
	
	public static void main(String[] args) {

		Repl00117 obj= new Repl00117();
		obj.number=10;
		obj.number2=10.23;
		obj.grade='a';
		System.out.println(obj.number);
		System.out.println(obj.number2);
		System.out.println(obj.grade);
		
		
		Repl00117 obj1= new Repl00117();
		obj1.number=100;
		obj1.number2=100.23;
		obj1.grade='s';
		System.out.println(obj1.number);
		System.out.println(obj1.number2);
		System.out.println(obj1.grade);
	}

}
