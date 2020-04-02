package reply.homework;
/* 1. Complete the Car.java class:
Create the following variable (Choose proper datatype)
* make
* model
* numberOfDoors
* topSpeed
* price
following the proper naming convention for variables. 

Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters except make and model . (make and model value should assign to "unknown" inside constructor) 
* A fourth constructor Have all parameters except topSpeed and price;(topSpeed value should assign 
* to "90" and price value should be assign to 0 inside constructor)  

Create a display method in Cars class to print the class variable value in console. 

2. Test your code with the Main.java class:
Create several Car objects using all Constructors. 
then call display method with each object. 

Output: 
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0*/



public class Repl00137 {

	public static void main(String[] args) {
	
  Car obj1=new Car("Toyota", "Prius", 4, 120, 30000.0);
  Car obj2=new Car("Toyota", "Prius", 4, 120, 30000.0);
  Car obj3=new Car(4 ,120, 30000.0);
  Car obj4=new Car("Toyota", "Prius", 4);
}	
}
class Car{
	 String make;
	 String model;
	 int numberOfDoors;
	 int topSpeed;
	 double price;
	
	public Car(String make,String model,int numberOfDoors,int  topSpeed,double price) {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	public Car(String make,String model,int  topSpeed,double price) {
		this.numberOfDoors=4;
		System.out.println(make+" "+model+" "+topSpeed+" "+price);
	}
	public Car(int numberOfDoors,int  topSpeed,double price) {
		this. make="unknown";
		this. model="unknown";
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	public Car(String make,String model,int numberOfDoors) {
		this.topSpeed=90;
		this.price=0;
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	
	public void display() {
		
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
}
