package Repl_Homeworks;
/*
 * Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable. 

In Main Class and main method

Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs. 

 Expected Output:
Employee Name: Mario
Employee Age: 32
 */
public class Repl00174 {
	public static void main(String[] args) {
		
		EncapsulationDemooo obj=new EncapsulationDemooo();
		
		obj.setEmpAge(32);
		obj.setEmpName("Mario");
		
		System.out.println("Employee Name: "+obj.getEmpName());
		System.out.println("Employee Age: "+obj.getEmpAge());
	}
	
}



class EncapsulationDemooo{
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
