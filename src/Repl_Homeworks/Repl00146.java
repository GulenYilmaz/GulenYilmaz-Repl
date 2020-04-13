package Repl_Homeworks;
/*In Parent class. 
Create a constructor, it will take a String parameter called city. 
include the logic of printing the parameter value. 
Create another constructor without parameter. 
Include the logic of printing "Parent Constructor". 

Create a Child Class that should be a subclass of Parent class
Inside child class create a constructor that will make a call to parameterized constructor of the parent class.

In Main class. 
Create an Object of the child class by passing String value "Vienna"

Expected Output:
Vienna*/

public class Repl00146 {//Parent class

	String city;
	
	Repl00146 (String city){
		this.city=city;
		System.out.println(this.city);
	}
	
	Repl00146 (){
		System.out.println("Parent Constructor");
	}
	
}
	class Child extends Repl00146{
		Child(String city){
			super(city);
		}
	}
	
	
	
	

