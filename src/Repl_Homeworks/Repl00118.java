package Repl_Homeworks;
//Declare 3 instance variables to hold:
//name of the country
//capital
//population size
//
//Create a method to display values of instance variables
//
//Create 2 Object, assign values to instance variables, execute method display;
//
//Expected Output:
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000
//


public class Repl00118 {

	
	String country;
	String  capital;
	int population;
	void display() {
		System.out.println("The capital of "+country+" is "
	+capital+"  and population is "+population);
	}
	
	public static void main(String[] args) {

		Repl00118 obj= new Repl00118();
		obj.country="USA";
		obj.capital="Washington DC";
		obj.population=330000000;
		obj.display();
		
		
		
		Repl00118 obj1= new Repl00118();
		obj1.country="Kazakhstan";
		obj1.capital="Astana";
		obj1.population=18500000;
		obj1.display();

		
	}
}
