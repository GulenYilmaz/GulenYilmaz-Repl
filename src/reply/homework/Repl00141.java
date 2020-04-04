package reply.homework;


/*In carObject class:
Create instance variables as below.
model
price, 
quantity

Create a constructor that will initialize instance variables. 

Create a method with name carStockValue. 
Write logic to calculate the total values of cars in stock 
and print the result. 

run the application in Main Class

Expected Output:
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0

Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations. */


public class Repl00141 {
	String model;
	double price; 
	String quantity;
	
	public Repl00141(String model,String quantity,double price){
		this.model=model;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void carStockValue() {
		int sum=quantity.length();
		int mod=model.length();
		System.out.println(model +" "+quantity+" "+price);
	}
	
	public static void main(String[] args) {
		Repl00141 obj1= new Repl00141("Toyota 2019 ", "Stock Value " ,2500000.0);
		Repl00141 obj2= new Repl00141("BMW 2019 ","Stock Value ", 652980.0);
		
		obj1.carStockValue();
		obj2.carStockValue();
	}
}
