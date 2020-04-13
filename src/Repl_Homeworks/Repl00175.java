package Repl_Homeworks;
/*
 * Create Class Account
Create the below variables:
acc_no;  
name;  
email;
double amount;  

Create the getter/setter methods for each variable. 

In Main Class and the main method. 
Using setter methods assign the values as:
acc_no = 7560504000
name = Sumair
email = sumair@syntax.com 
amount = 50000.0
Using getter methods print the values as below output. 

Expected Output:
 
7560504000 Sumair sumair@syntax.com 50000.0
 
 */
public class Repl00175 {
public static void main(String[] args) {
		
		Account obj=new Account();
		
		obj.setAcc_no(7560504);
		obj.setName("Sumair");
		obj.setEmail("sumair@syntax.com");
		obj.setAmount(50000.0);
		System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
	}
	

}class Account{
	private double acc_no;
	private String name;
	private String email;
	private double amount;
	
	
	
	
	public double getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(double acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
