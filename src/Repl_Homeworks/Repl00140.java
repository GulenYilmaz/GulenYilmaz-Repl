package Repl_Homeworks;

/*1. Complete the Employee.java class:

Include the following class variables:
* name(String)
* lastName(String)
* employeeId(int)
* startDate(String)
* salary(int)


Write two constructors:

* non-argument constructor
* parameterized constructor that will initialize  all instance variables

Create two different objects of the Employee class
 using both constructors and 
 print the values of the properties inline using a print method.


Output:
 
null null 0 null 0
Joe Smith 12345 01/01/1970 35000*/


public class Repl00140 {
	String name;
	String lastName;
	int employeeId;
    String startDate;
	int salary;

	Repl00140(){
	}
	
	Repl00140(String name,String lastName,int employeeId,String startDate,int salary){
		this.name=name;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.startDate=startDate;
		this.salary=salary;
		
	}
	void display(String name,String lastName,int employeeId,String startDate,int salary) {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}

}
//class Main  extends Repl00140{
//	
//	
//	
//public static void main(String[] args) {
//
//	Repl00140 emp1 = new Repl00140();
//	Repl00140 emp2 = new Repl00140();
//	emp1.display("null", "null", 0 ,"null", 0);
//    emp2.display("Joe"," Smith", 12345, "01/01/1970", 35000);
//    
//    
//  }
//}
