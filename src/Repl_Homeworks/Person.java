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
public class Person{
	private String firstname;
	
	private String lastname;
	private String birthmonth;
	private String birthday;
	private String birthyear;
	private String ssn;
	Person(String lastName,String birthmonth,String birthday,String birthyear,String ssn){
		this.lastname=lastname;
		this.firstname=firstname;
		this.birthmonth=birthmonth;
		this.birthday=birthday;
		this.birthyear=birthyear;
		this.ssn=ssn;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBirthmonth() {
		return birthmonth;
	}
	public void setBirthmonth(String birthmonth) {
		this.birthmonth = birthmonth;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	public String formatBirthday(String birthmonth,String birthday,String birthyear) {
		this.birthmonth=birthmonth;
		this.birthday=birthday;
		this.birthyear=birthyear;
		System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
		return birthday;
	}
}