package Repl_Homeworks;
/*
 * Encapsulation
Create Class EncapsulationDemo
create two variable as shown below. 

private String empName;
private int empAge;

Create the getter/setter methods for each variable. 

In Main Class and main method. 
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs. 

Expected Output:
Employee Name: John
Employee Age: 30
 */
public class Repl00172 {
public static void main(String[] args) {
	EncapsulationDem obj=new EncapsulationDem();
	
	obj.setEmpAge(30);
	obj.setEmpName("John");
	
	System.out.println("Employee Name: "+obj.getEmpName());
	System.out.println("Employee Age: "+obj.getEmpAge());
}
}


class EncapsulationDem{
	private String empName;
	private int empAge;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}	
	
	
}