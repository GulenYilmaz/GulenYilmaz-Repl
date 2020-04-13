package Repl_Homeworks;
/*In ShoppingStore class:
Create variables as below.
item,
price, 
quantity

Create a constructor to initialize instance variables.

Create a method with name itemTotalPrice. 
write a logic to to calculate the total values of items in stock. and print the result. 
return the total value. 

In Main Class. 
Create two Object of ShoppingStore and pass the parameters to Constructor. 
then using each object call the method itemTotalPrice. 
Store the returned value of each object. 
Calculate sum of both object and print the result. 

Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today


Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype, 
 This Keyword, Method Creation, Mathematics Operations, method return types. */

public class Repl00142 {
	String item;
	double price; 
	String quantity;
	
	Repl00142(String item,  String quantity,double price){
		this.item=item;
		this.price=price;
		this.quantity=quantity;
		System.out.println(item+" "+" Total Value "+price);
				}
		
	public double 	itemTotalPrice() {
		double totalPrice=this.price;
	return totalPrice;
	}
	
}

 class Maain{
	
	 public static void main(String[] args) {
		Repl00142 obj1=new Repl00142("Blanket" ,"Total Value", 99.98);
		Repl00142 obj2=new Repl00142("Mattress", "Total Value", 439.18);
		
		double t1=obj1.itemTotalPrice();
		double t2=obj2.itemTotalPrice();
		System.out.println("You purchased "+(t1+t2)+"Today");	}
}