package Repl_Homeworks;
/*In parent class
Create a non argument constructor and write a logic to print "This is Parent constructor"

Create a Child Class that will be subclass of the Parent class.
Create a constructor without parameter and call parent class constructor explicitly-->acik belirgin

In Main Class. 
Create and object of Child class and run the application. 

Expected Output:
This is Parent constructor
 * 
 */
public class Repl00147 {

	
	Repl00147(){
		System.out.println("This is Parent constructor");
	}
}
class Childd extends Repl00147{
	
	Childd(){
		super();
	}
}