package Repl_Homeworks;
//Declare 3 instance variables to hold: 
//
//year, school name and batch #
//
//Access variables from the main method and assign 
//specific values to them
//Print values of your variables in the following format:
//
//Expected Output:
//I am a student of batch 6 studying at Syntax in the year of 2020



public class Repl00116 {

	static int year;
	static String name;
	static int batchNo;
	
	public static void main(String[] args) {

		Repl00116 obj= new Repl00116 ();
		obj.year=2020;
		obj.name="Syntax";
		obj.batchNo=6;
		System.out.println("I am a student of batch "+batchNo+ " studying at "+name+" in the year of "+year);
		
	}

}
