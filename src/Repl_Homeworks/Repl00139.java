package Repl_Homeworks;
/*Instructions from your teacher:
1. Complete the Dog.java class:

Create following class variables. 
dogName
dogWeight   
static dogBreed=Mutt;
For all methods and variables use proper naming convention. 

Create constructor to initialize instance variables 

2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.

Expected Output:
Tarzan Mutt 50.0
Lucy Mutt 10.0*/


public class Repl00139 {
	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";

	Repl00139(String dogName, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;

	}

	void display() {
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);
	}
}
class Mainnn  extends Repl00139{
	
	
	Mainnn(String dogName, double dogWeight) {
		super(dogName, dogWeight);
	}

	public static void main(String[] args) {

		Repl00139 dog1 = new Repl00139("Tarzan", 50);
		Repl00139 dog2 = new Repl00139("Lucy", 10);
	    dog1.display();
	    dog2.display();
	    
	    
	  }
	}
