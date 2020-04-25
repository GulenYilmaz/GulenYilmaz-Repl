package Repl_Homeworks;
import java.util.*;


/*
 * Create an Employee class that will be fully encapsulated and will have:
variables as FullName, ssn and salary
constructor to initialize instance variables
getters to have an access to instance variables

Create a set collection that will store # objects of Employee type and using
 Iterator print the value of each variable

Expected Output:
John Doe
123456789
80000.0
Jane Smith
987654321
90000.0
Jackie Chan
0
1000000.0
 */
public class Repl00195 {

	private String FullName;
	private String ssn;
	private double salary;
	
	public Repl00195(String FullName,String ssn,double salary){
		this.FullName=FullName;
		this.ssn=ssn;
		this.salary=salary;
	}
	
	
	public void display() {
		System.out.println(FullName+"\n"+ssn+"\n"+salary);
	}

public static void main(String[] args) {
	
	Set<Repl00195> emp=new LinkedHashSet<>();	
	emp.add(new Repl00195("John Doe","123456789",80000.0));
	emp.add(new Repl00195("Jane Smith","987654321",90000.0));
	emp.add(new Repl00195("Jackie Chan","0",1000000.0));
	
	
	for(Repl00195 e:emp) {
		e.display();
	}
}
}
