package Repl_Homeworks;
/*
 * Create Class EncapsulationDemo

create two variable as shown below. 
private String empName=John;
private int empAge=30;

Create only getters methods for each variable. 

Print the values of each variable as shown below. 

Expected Output:
Employee Name: John
Employee Age: 30 

 */
public class Repl00173 {
public static void main(String[] args) {
	
	EncapsulationDemoo obj=new EncapsulationDemoo();
	
	
	
	System.out.println("Employee Name: "+obj.getEmpName());
	System.out.println("Employee Age: "+obj.getEmpAge());
}
}


class EncapsulationDemoo{
	private String empName="John";
	private int empAge=30;

	
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